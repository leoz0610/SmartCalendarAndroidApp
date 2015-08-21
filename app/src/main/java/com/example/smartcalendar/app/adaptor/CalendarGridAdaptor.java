package com.example.smartcalendar.app.adaptor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.smartcalendar.app.R;

/**
 * Created by leoz on 8/20/15.
 */
public class CalendarGridAdaptor extends ArrayAdapter<Integer> {
    private int resource = -1;
    private Activity myActivity = null;

    public CalendarGridAdaptor(Context context, int resource) {
        super(context, resource);
        this.resource = resource;
        this.myActivity = (Activity) context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View newView = null;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)myActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            newView = inflater.inflate(resource, parent, true);
        } else {
            newView = convertView;
        }

        TextView textView = (TextView) myActivity.findViewById(R.id.txtCalendarCell);
        textView.setText(position);
        return newView;
    }
}
