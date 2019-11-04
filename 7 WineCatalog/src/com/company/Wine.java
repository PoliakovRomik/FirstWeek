package com.company;

import java.util.Date;

public class Wine {
    private String name;
    private String countryOfManufacture;
    private int yearOfPouring;

    public Wine(String name, String countryOfManufacture, int yearOfPouring) {
        this.name = name;
        this.countryOfManufacture = countryOfManufacture;
        this.yearOfPouring = yearOfPouring;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public void setYearOfPouring(int yearOfPouring) {
        this.yearOfPouring = yearOfPouring;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public int getYearOfPouring() {
        return yearOfPouring;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + name + '\'' +
                ", country of manufacture='" + countryOfManufacture + '\'' +
                ", wine exposure='" + wineExposure() +
                ", year o pouring='" + yearOfPouring + '}';
    }

    public int wineExposure(){
        return 2019 - this.getYearOfPouring();
    }
}
