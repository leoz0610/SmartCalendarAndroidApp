package com.example.smartcalendar.app.model;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by leoz on 8/23/15.
 */
public class MonthModel extends ArrayList<DayModel> {
    private int daysInMonth;

    public MonthModel(DateTime dateTime) {
        daysInMonth = dateTime.dayOfMonth().getMaximumValue();

        for (int i = 0; i < 7; i++) {
            add(null);
        }

        for (int i = 0; i < daysInMonth; i++) {
            add(new DayModel(i + 1));
        }
    }
}
