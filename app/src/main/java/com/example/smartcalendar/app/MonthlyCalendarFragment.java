package com.example.smartcalendar.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import com.example.smartcalendar.app.adaptor.MonthlyCalendarGridAdaptor;
import com.example.smartcalendar.app.model.MonthModel;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.DateTime.Property;

import java.util.ArrayList;


public class MonthlyCalendarFragment extends Fragment {
    private Activity myActivity = null;
    private ArrayList<Integer> calendarCells;
    private MonthlyCalendarGridAdaptor gridAdaptor;
    private DateTime currentDayTime;
    private MonthModel monthModel;

    public MonthlyCalendarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myActivity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_monthly_calendar, container, false);
        currentDayTime = new DateTime(DateTimeZone.getDefault());
        monthModel = new MonthModel(currentDayTime);

        GridView calendar = (GridView) rootView.findViewById(R.id.gridMonthlyCalendar);
        TextView header = (TextView) rootView.findViewById(R.id.txtMonCalendarHeader);
        gridAdaptor = new MonthlyCalendarGridAdaptor(myActivity, R.layout.grid_item_monthly_calendar, monthModel);
        calendar.setAdapter(gridAdaptor);
        header.setText(currentDayTime.monthOfYear().getAsText());
        return rootView;
    }

}
