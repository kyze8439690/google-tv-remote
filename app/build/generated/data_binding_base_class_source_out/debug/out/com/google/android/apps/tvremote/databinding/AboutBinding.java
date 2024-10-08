// Generated by view binder compiler. Do not edit!
package com.google.android.apps.tvremote.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.tvremote.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AboutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonPrivacy;

  @NonNull
  public final Button buttonTos;

  @NonNull
  public final Button buttonTutorial;

  @NonNull
  public final TextView versionText;

  private AboutBinding(@NonNull LinearLayout rootView, @NonNull Button buttonPrivacy,
      @NonNull Button buttonTos, @NonNull Button buttonTutorial, @NonNull TextView versionText) {
    this.rootView = rootView;
    this.buttonPrivacy = buttonPrivacy;
    this.buttonTos = buttonTos;
    this.buttonTutorial = buttonTutorial;
    this.versionText = versionText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AboutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_privacy;
      Button buttonPrivacy = ViewBindings.findChildViewById(rootView, id);
      if (buttonPrivacy == null) {
        break missingId;
      }

      id = R.id.button_tos;
      Button buttonTos = ViewBindings.findChildViewById(rootView, id);
      if (buttonTos == null) {
        break missingId;
      }

      id = R.id.button_tutorial;
      Button buttonTutorial = ViewBindings.findChildViewById(rootView, id);
      if (buttonTutorial == null) {
        break missingId;
      }

      id = R.id.version_text;
      TextView versionText = ViewBindings.findChildViewById(rootView, id);
      if (versionText == null) {
        break missingId;
      }

      return new AboutBinding((LinearLayout) rootView, buttonPrivacy, buttonTos, buttonTutorial,
          versionText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
