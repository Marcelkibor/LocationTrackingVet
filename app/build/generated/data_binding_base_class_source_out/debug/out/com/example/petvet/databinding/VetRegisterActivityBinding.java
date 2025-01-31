// Generated by view binder compiler. Do not edit!
package com.example.petvet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.petvet.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VetRegisterActivityBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final MaterialButton btRegister;

  @NonNull
  public final CardView cardHeader;

  @NonNull
  public final EditText edEmail;

  @NonNull
  public final EditText edLastName;

  @NonNull
  public final EditText edPassword;

  @NonNull
  public final EditText edPhone;

  @NonNull
  public final EditText edUsername;

  @NonNull
  public final TextView greetingText;

  private VetRegisterActivityBinding(@NonNull CardView rootView, @NonNull ImageView backArrow,
      @NonNull MaterialButton btRegister, @NonNull CardView cardHeader, @NonNull EditText edEmail,
      @NonNull EditText edLastName, @NonNull EditText edPassword, @NonNull EditText edPhone,
      @NonNull EditText edUsername, @NonNull TextView greetingText) {
    this.rootView = rootView;
    this.backArrow = backArrow;
    this.btRegister = btRegister;
    this.cardHeader = cardHeader;
    this.edEmail = edEmail;
    this.edLastName = edLastName;
    this.edPassword = edPassword;
    this.edPhone = edPhone;
    this.edUsername = edUsername;
    this.greetingText = greetingText;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VetRegisterActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VetRegisterActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vet_register_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VetRegisterActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.btRegister;
      MaterialButton btRegister = ViewBindings.findChildViewById(rootView, id);
      if (btRegister == null) {
        break missingId;
      }

      id = R.id.cardHeader;
      CardView cardHeader = ViewBindings.findChildViewById(rootView, id);
      if (cardHeader == null) {
        break missingId;
      }

      id = R.id.edEmail;
      EditText edEmail = ViewBindings.findChildViewById(rootView, id);
      if (edEmail == null) {
        break missingId;
      }

      id = R.id.edLastName;
      EditText edLastName = ViewBindings.findChildViewById(rootView, id);
      if (edLastName == null) {
        break missingId;
      }

      id = R.id.edPassword;
      EditText edPassword = ViewBindings.findChildViewById(rootView, id);
      if (edPassword == null) {
        break missingId;
      }

      id = R.id.edPhone;
      EditText edPhone = ViewBindings.findChildViewById(rootView, id);
      if (edPhone == null) {
        break missingId;
      }

      id = R.id.edUsername;
      EditText edUsername = ViewBindings.findChildViewById(rootView, id);
      if (edUsername == null) {
        break missingId;
      }

      id = R.id.greetingText;
      TextView greetingText = ViewBindings.findChildViewById(rootView, id);
      if (greetingText == null) {
        break missingId;
      }

      return new VetRegisterActivityBinding((CardView) rootView, backArrow, btRegister, cardHeader,
          edEmail, edLastName, edPassword, edPhone, edUsername, greetingText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
