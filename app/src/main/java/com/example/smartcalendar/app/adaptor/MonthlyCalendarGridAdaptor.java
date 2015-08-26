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
import com.example.smartcalendar.app.model.WEEKDAY;

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

        if (position < 7) {
            textView.setBackgroundColor(Color.GRAY);
            switch (position) {
                case 0: textView.setText("S"); break;
                case 1: textView.setText("M"); break;
                case 2: textView.setText("T"); break;
                case 3: textView.setText("W"); break;
                case 4: textView.setText("T"); break;
                case 5: textView.setText("F"); break;
                case 6: textView.setText("S"); break;
            }
        }else if (position % 2 == 0) {
            textView.setBackgroundColor(Color.WHITE);
            textView.setText(getItem(position).toString());
        } else {
            textView.setBackgroundColor(Color.LTGRAY);
            textView.setText(getItem(position).toString());
        }
        return newView;
    }
}
