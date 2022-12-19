// Generated by view binder compiler. Do not edit!
package com.parade621.mvc_ex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.parade621.mvc_ex.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class IncludeLoginViewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etUserName;

  @NonNull
  public final Button loginBtn;

  private IncludeLoginViewBinding(@NonNull LinearLayout rootView, @NonNull EditText etPassword,
      @NonNull EditText etUserName, @NonNull Button loginBtn) {
    this.rootView = rootView;
    this.etPassword = etPassword;
    this.etUserName = etUserName;
    this.loginBtn = loginBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IncludeLoginViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IncludeLoginViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.include_login_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IncludeLoginViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.etPassword;
      EditText etPassword = ViewBindings.findChildViewById(rootView, id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.etUserName;
      EditText etUserName = ViewBindings.findChildViewById(rootView, id);
      if (etUserName == null) {
        break missingId;
      }

      id = R.id.loginBtn;
      Button loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      return new IncludeLoginViewBinding((LinearLayout) rootView, etPassword, etUserName, loginBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
