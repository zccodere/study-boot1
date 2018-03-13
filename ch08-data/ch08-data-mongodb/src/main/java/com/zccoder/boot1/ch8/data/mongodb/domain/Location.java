package com.zccoder.boot1.ch8.data.mongodb.domain;

/**
 * @title POJO
 * @describe Location类
 * @author zc
 * @date 2017/08/10
 **/
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
