package com.example.smartcalendar.app.model;

/**
 * Created by leoz on 8/25/15.
 */
public enum WEEKDAY {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private final int value;

    private WEEKDAY(int value) {
        this.value = value;
    }

    public int getValue() { return value; }
}
