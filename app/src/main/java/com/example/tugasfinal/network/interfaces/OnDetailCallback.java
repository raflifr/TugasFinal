package com.example.tugasfinal.network.interfaces;

import com.example.tugasfinal.models.ApiModel;

public interface OnDetailCallback {
    void onSuccess(ApiModel model, String message);
    void onFailure(String message);
}
