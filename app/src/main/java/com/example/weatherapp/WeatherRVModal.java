package com.example.weatherapp;

public class WeatherRVModal
{

    private String time;
    private String temperature;
    private String icon;
    private String windSpeed;



    public WeatherRVModal(String time, String temperature, String icon, String windSpeed) {
        this.time = time;
        this.temperature = temperature;
        this.icon = icon;
        this.windSpeed = windSpeed;
    }


    public void setTime(String time) {
        this.time = time;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }


    public String getTime() {
        return time;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getIcon() {
        return icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }
}
