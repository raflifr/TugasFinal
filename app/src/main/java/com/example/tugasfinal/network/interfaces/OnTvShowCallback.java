package com.example.tugasfinal.network.interfaces;

import com.example.tugasfinal.models.ApiModel;

import java.util.List;

public interface OnTvShowCallback {
    void onSuccess(List<ApiModel> model, int page, String message);
    void onFailure(String message);
}
