// Generated by view binder compiler. Do not edit!
package com.example.petvet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.petvet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddServiceBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final Button btAdd;

  @NonNull
  public final CardView cardSpinner;

  @NonNull
  public final CardView colorFrame;

  @NonNull
  public final EditText sName;

  @NonNull
  public final Spinner spCategory;

  private FragmentAddServiceBinding(@NonNull FrameLayout rootView, @NonNull ImageView backArrow,
      @NonNull Button btAdd, @NonNull CardView cardSpinner, @NonNull CardView colorFrame,
      @NonNull EditText sName, @NonNull Spinner spCategory) {
    this.rootView = rootView;
    this.backArrow = backArrow;
    this.btAdd = btAdd;
    this.cardSpinner = cardSpinner;
    this.colorFrame = colorFrame;
    this.sName = sName;
    this.spCategory = spCategory;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_service, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddServiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.btAdd;
      Button btAdd = ViewBindings.findChildViewById(rootView, id);
      if (btAdd == null) {
        break missingId;
      }

      id = R.id.cardSpinner;
      CardView cardSpinner = ViewBindings.findChildViewById(rootView, id);
      if (cardSpinner == null) {
        break missingId;
      }

      id = R.id.colorFrame;
      CardView colorFrame = ViewBindings.findChildViewById(rootView, id);
      if (colorFrame == null) {
        break missingId;
      }

      id = R.id.sName;
      EditText sName = ViewBindings.findChildViewById(rootView, id);
      if (sName == null) {
        break missingId;
      }

      id = R.id.spCategory;
      Spinner spCategory = ViewBindings.findChildViewById(rootView, id);
      if (spCategory == null) {
        break missingId;
      }

      return new FragmentAddServiceBinding((FrameLayout) rootView, backArrow, btAdd, cardSpinner,
          colorFrame, sName, spCategory);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
