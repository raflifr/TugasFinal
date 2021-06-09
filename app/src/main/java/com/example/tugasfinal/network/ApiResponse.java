package com.example.tugasfinal.network;

import com.example.tugasfinal.models.ApiModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {
    @SerializedName("results")
    @Expose
    private List<ApiModel> models;

    public List<ApiModel> getModel() {
        return models;
    }
}
