package com.example.smartcalendar.app.model;

/**
 * Created by leoz on 8/23/15.
 */
public class DayModel {
    private int day;

    public DayModel(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return Integer.valueOf(day).toString();
    }
}
