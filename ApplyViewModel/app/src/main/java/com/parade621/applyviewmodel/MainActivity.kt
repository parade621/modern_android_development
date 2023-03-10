package com.parade621.applyviewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.parade621.applyviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding:ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


//        var counter = 100
//        binding.textView.text = counter.toString()
//
//        binding.btn.setOnClickListener {
//            counter += 1
//            binding.textView.text = counter.toString()
//        }

        /**
         * ViewModelProvider를 사용해서 counter를 설정함. 하지만 여전히 불안정 하다.
         * Factory 패턴을 사용해서 ViewModel에서 온전히 값을 받아오게 만들어보자
         */
//        val myViewModel: MyViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
//        myViewModel.counter = 100
//        binding.textView.text = myViewModel.counter.toString()
//
//        binding.btn.setOnClickListener {
//            myViewModel.counter += 1
//            binding.textView.text = myViewModel.counter.toString()
//        }

        val factory = MyViewModelFactory(100, this)
        val myViewModel = ViewModelProvider(this, factory).get(MyViewModel::class.java)
        binding.textView.text = myViewModel.counter.toString()

        binding.btn.setOnClickListener {
            //myViewModel.counter += 1
            //binding.textView.text = myViewModel.counter.toString()
            //myViewModel.saveState()
            // 이 부분을 liveData 사용을 위한 Observer로직으로 구현한다.
            myViewModel.liveCounter.value = myViewModel.liveCounter.value?.plus(1)
        }
        // UI를 표시하는 presenter 로직
        // liveData를 사용하게 되면, 더 이상 버튼의 이벤트 리스너에 둘 필요가 없다.
        myViewModel.modifiedCounter.observe(this){ counter->
            binding.textView.text = counter.toString()
        }

    }
}