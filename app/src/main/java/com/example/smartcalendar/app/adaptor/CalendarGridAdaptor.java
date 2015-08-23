package com.example.smartcalendar.app.adaptor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.smartcalendar.app.R;

import java.util.List;

/**
 * Created by leoz on 8/20/15.
 */
public class CalendarGridAdaptor extends ArrayAdapter<Integer> {
    private int resource = -1;

    public CalendarGridAdaptor(Context context, int resource, List<Integer> objects) {
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

        TextView textView = (TextView) newView.findViewById(R.id.txtCalendarCell);
        textView.setText(getItem(position).toString());
        return newView;
    }
}
