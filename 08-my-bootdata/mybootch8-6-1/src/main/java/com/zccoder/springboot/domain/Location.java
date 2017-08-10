package com.zccoder.springboot.domain;

/**
 * Location类
 * Created by ZC on 2017/8/10.
 */
public class Location {

    private String place;

    private String year;

    public Location(String place, String year) {
        this.place = place;
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
