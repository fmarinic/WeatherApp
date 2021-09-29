package com.example.weatherapp2.Models;

import com.google.gson.annotations.SerializedName;

public class Coord {
    @SerializedName("lon")
    private float lon;
    @SerializedName("lat")
    private float lat;

    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }
}
