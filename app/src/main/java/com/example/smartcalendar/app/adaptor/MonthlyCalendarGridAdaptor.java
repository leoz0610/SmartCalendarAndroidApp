package com.example.smartcalendar.app.adaptor;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.smartcalendar.app.R;
import com.example.smartcalendar.app.model.DayModel;

import java.util.List;

/**
 * Created by leoz on 8/20/15.
 */
public class MonthlyCalendarGridAdaptor extends ArrayAdapter<DayModel> {
    private int resource = -1;

    public MonthlyCalendarGridAdaptor(Context context, int resource, List<DayModel> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View newView = null;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            newView = inflater.inflate(resource, parent, false);
        } else {
            newView = convertView;
        }

        TextView textView = (TextView) newView.findViewById(R.id.txtMonthlyCalendarCell);
        textView.setText(getItem(position).toString());
        if (position % 2 == 0) {
            textView.setBackgroundColor(Color.WHITE);
        } else {
            textView.setBackgroundColor(Color.GRAY);
        }
        return newView;
    }
}
