package com.example.tugasfinal.network.interfaces;

import com.example.tugasfinal.models.ApiModel;

import java.util.List;

public interface OnSearchCallback {
    void onSuccess(List<ApiModel> model, String message);
    void onFailure(String message);
}
