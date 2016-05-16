package com.example.janko.myapplication.model;

/**
 * Created by JankoHP on 12.5.2016.
 */
public class WeatherData {
    private long id;
    private String name;
    private Main main;

    public WeatherData(long id, String name, float temp){
        this.id = id;
        this.name = name;
        this.main = new Main(temp);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Main getMain() {
        return main;
    }
}
