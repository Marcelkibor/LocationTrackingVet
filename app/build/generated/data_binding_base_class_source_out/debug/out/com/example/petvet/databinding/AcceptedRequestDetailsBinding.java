// Generated by view binder compiler. Do not edit!
package com.example.petvet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.petvet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AcceptedRequestDetailsBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView tvAClientRequestName;

  @NonNull
  public final TextView tvAClientServiceName;

  private AcceptedRequestDetailsBinding(@NonNull CardView rootView,
      @NonNull TextView tvAClientRequestName, @NonNull TextView tvAClientServiceName) {
    this.rootView = rootView;
    this.tvAClientRequestName = tvAClientRequestName;
    this.tvAClientServiceName = tvAClientServiceName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static AcceptedRequestDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AcceptedRequestDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.accepted_request_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AcceptedRequestDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvAClientRequestName;
      TextView tvAClientRequestName = ViewBindings.findChildViewById(rootView, id);
      if (tvAClientRequestName == null) {
        break missingId;
      }

      id = R.id.tvAClientServiceName;
      TextView tvAClientServiceName = ViewBindings.findChildViewById(rootView, id);
      if (tvAClientServiceName == null) {
        break missingId;
      }

      return new AcceptedRequestDetailsBinding((CardView) rootView, tvAClientRequestName,
          tvAClientServiceName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
