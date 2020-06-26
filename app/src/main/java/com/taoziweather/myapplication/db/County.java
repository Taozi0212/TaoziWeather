package com.taoziweather.myapplication.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;  //实体类id

    private String countyName;  //县名字

    private String weatherId;  //县所属市id

    private int cityId;

    //getter和setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
