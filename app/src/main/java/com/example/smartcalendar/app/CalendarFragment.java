package com.example.smartcalendar.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.example.smartcalendar.app.adaptor.CalendarGridAdaptor;

import java.util.ArrayList;


public class CalendarFragment extends Fragment {
    private Activity myActivity = null;
    private ArrayList<Integer> calendarCells;
    private CalendarGridAdaptor gridAdaptor;

    public CalendarFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        GridView calendar = (GridView) rootView.findViewById(R.id.gridCalendar);
        calendarCells = new ArrayList<Integer>();
        calendarCells.add(1);
        calendarCells.add(2);
        calendarCells.add(3);
        calendarCells.add(4);
        calendarCells.add(5);
        gridAdaptor = new CalendarGridAdaptor(myActivity, R.layout.fragment_calendar, calendarCells);
        calendar.setAdapter(gridAdaptor);
        return rootView;
    }

}
