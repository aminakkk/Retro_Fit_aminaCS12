package com.example.retro_fit_aminacs12;

import com.google.gson.annotations.SerializedName;

public class ModelDo {

    @SerializedName("key")
    private String key;

    @SerializedName("activity")
    private String letsGo;

    @SerializedName("price")
    private double price;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLetsGo() {
        return letsGo;
    }

    public void setLetsGo(String letsGo) {
        this.letsGo = letsGo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
