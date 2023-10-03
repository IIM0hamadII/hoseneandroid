package com.example.hosenehotel;

public class Mainhotel {
    private String name;
    private String location;
    private double rating;
    private  int NumOFRooms;

    public Mainhotel() {
    }
   
    public Mainhotel(String name, String location, double rating, int numOFRooms) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        NumOFRooms = numOFRooms;
    }

    public Mainhotel(int contentLayoutId, String name, String location, double rating, int numOFRooms) {
        super();
        this.name = name;
        this.location = location;
        this.rating = rating;
        NumOFRooms = numOFRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumOFRooms() {
        return NumOFRooms;
    }

    public void setNumOFRooms(int numOFRooms) {
        NumOFRooms = numOFRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                ", NumOFRooms=" + NumOFRooms +
                '}';
    }



}
