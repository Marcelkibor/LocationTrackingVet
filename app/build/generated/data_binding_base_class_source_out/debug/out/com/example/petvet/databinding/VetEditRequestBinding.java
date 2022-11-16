// Generated by view binder compiler. Do not edit!
package com.example.petvet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.petvet.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VetEditRequestBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final MaterialButton btConfirm;

  @NonNull
  public final CardView cardCategories;

  @NonNull
  public final CardView cardHeaders;

  @NonNull
  public final CardView cardRadio;

  @NonNull
  public final ImageView drawerHome;

  @NonNull
  public final TextView greetingText;

  @NonNull
  public final RadioButton radioBtn1;

  @NonNull
  public final RadioButton radioBtn2;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final ImageView servPhoto;

  @NonNull
  public final TextView tvAnimalCategory;

  @NonNull
  public final TextView tvAnimalCategoryDesc;

  @NonNull
  public final TextView tvClientDesc;

  @NonNull
  public final TextView tvClientDescLabel;

  @NonNull
  public final TextView tvHeaderSelect;

  @NonNull
  public final TextView tvRequestedTime;

  @NonNull
  public final TextView tvRequestedTimeDesc;

  @NonNull
  public final TextView tvServiceRequest;

  @NonNull
  public final TextView tvServiceRequestDesc;

  private VetEditRequestBinding(@NonNull DrawerLayout rootView, @NonNull ImageView backArrow,
      @NonNull MaterialButton btConfirm, @NonNull CardView cardCategories,
      @NonNull CardView cardHeaders, @NonNull CardView cardRadio, @NonNull ImageView drawerHome,
      @NonNull TextView greetingText, @NonNull RadioButton radioBtn1,
      @NonNull RadioButton radioBtn2, @NonNull RadioGroup radioGroup, @NonNull ImageView servPhoto,
      @NonNull TextView tvAnimalCategory, @NonNull TextView tvAnimalCategoryDesc,
      @NonNull TextView tvClientDesc, @NonNull TextView tvClientDescLabel,
      @NonNull TextView tvHeaderSelect, @NonNull TextView tvRequestedTime,
      @NonNull TextView tvRequestedTimeDesc, @NonNull TextView tvServiceRequest,
      @NonNull TextView tvServiceRequestDesc) {
    this.rootView = rootView;
    this.backArrow = backArrow;
    this.btConfirm = btConfirm;
    this.cardCategories = cardCategories;
    this.cardHeaders = cardHeaders;
    this.cardRadio = cardRadio;
    this.drawerHome = drawerHome;
    this.greetingText = greetingText;
    this.radioBtn1 = radioBtn1;
    this.radioBtn2 = radioBtn2;
    this.radioGroup = radioGroup;
    this.servPhoto = servPhoto;
    this.tvAnimalCategory = tvAnimalCategory;
    this.tvAnimalCategoryDesc = tvAnimalCategoryDesc;
    this.tvClientDesc = tvClientDesc;
    this.tvClientDescLabel = tvClientDescLabel;
    this.tvHeaderSelect = tvHeaderSelect;
    this.tvRequestedTime = tvRequestedTime;
    this.tvRequestedTimeDesc = tvRequestedTimeDesc;
    this.tvServiceRequest = tvServiceRequest;
    this.tvServiceRequestDesc = tvServiceRequestDesc;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static VetEditRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VetEditRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vet_edit_request, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VetEditRequestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backArrow;
      ImageView backArrow = ViewBindings.findChildViewById(rootView, id);
      if (backArrow == null) {
        break missingId;
      }

      id = R.id.btConfirm;
      MaterialButton btConfirm = ViewBindings.findChildViewById(rootView, id);
      if (btConfirm == null) {
        break missingId;
      }

      id = R.id.cardCategories;
      CardView cardCategories = ViewBindings.findChildViewById(rootView, id);
      if (cardCategories == null) {
        break missingId;
      }

      id = R.id.cardHeaders;
      CardView cardHeaders = ViewBindings.findChildViewById(rootView, id);
      if (cardHeaders == null) {
        break missingId;
      }

      id = R.id.cardRadio;
      CardView cardRadio = ViewBindings.findChildViewById(rootView, id);
      if (cardRadio == null) {
        break missingId;
      }

      id = R.id.drawer_home;
      ImageView drawerHome = ViewBindings.findChildViewById(rootView, id);
      if (drawerHome == null) {
        break missingId;
      }

      id = R.id.greetingText;
      TextView greetingText = ViewBindings.findChildViewById(rootView, id);
      if (greetingText == null) {
        break missingId;
      }

      id = R.id.radioBtn1;
      RadioButton radioBtn1 = ViewBindings.findChildViewById(rootView, id);
      if (radioBtn1 == null) {
        break missingId;
      }

      id = R.id.radioBtn2;
      RadioButton radioBtn2 = ViewBindings.findChildViewById(rootView, id);
      if (radioBtn2 == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.servPhoto;
      ImageView servPhoto = ViewBindings.findChildViewById(rootView, id);
      if (servPhoto == null) {
        break missingId;
      }

      id = R.id.tvAnimalCategory;
      TextView tvAnimalCategory = ViewBindings.findChildViewById(rootView, id);
      if (tvAnimalCategory == null) {
        break missingId;
      }

      id = R.id.tvAnimalCategoryDesc;
      TextView tvAnimalCategoryDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvAnimalCategoryDesc == null) {
        break missingId;
      }

      id = R.id.tvClientDesc;
      TextView tvClientDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvClientDesc == null) {
        break missingId;
      }

      id = R.id.tvClientDescLabel;
      TextView tvClientDescLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvClientDescLabel == null) {
        break missingId;
      }

      id = R.id.tvHeaderSelect;
      TextView tvHeaderSelect = ViewBindings.findChildViewById(rootView, id);
      if (tvHeaderSelect == null) {
        break missingId;
      }

      id = R.id.tvRequestedTime;
      TextView tvRequestedTime = ViewBindings.findChildViewById(rootView, id);
      if (tvRequestedTime == null) {
        break missingId;
      }

      id = R.id.tvRequestedTimeDesc;
      TextView tvRequestedTimeDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvRequestedTimeDesc == null) {
        break missingId;
      }

      id = R.id.tvServiceRequest;
      TextView tvServiceRequest = ViewBindings.findChildViewById(rootView, id);
      if (tvServiceRequest == null) {
        break missingId;
      }

      id = R.id.tvServiceRequestDesc;
      TextView tvServiceRequestDesc = ViewBindings.findChildViewById(rootView, id);
      if (tvServiceRequestDesc == null) {
        break missingId;
      }

      return new VetEditRequestBinding((DrawerLayout) rootView, backArrow, btConfirm,
          cardCategories, cardHeaders, cardRadio, drawerHome, greetingText, radioBtn1, radioBtn2,
          radioGroup, servPhoto, tvAnimalCategory, tvAnimalCategoryDesc, tvClientDesc,
          tvClientDescLabel, tvHeaderSelect, tvRequestedTime, tvRequestedTimeDesc, tvServiceRequest,
          tvServiceRequestDesc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
