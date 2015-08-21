package com.example.smartcalendar.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.example.smartcalendar.app.adaptor.CalendarGridAdaptor;


public class CalendarFragment extends Fragment {
    private Activity myActivity = null;

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
        GridView calendar = (GridView) myActivity.findViewById(R.id.gridCalendar);
        CalendarGridAdaptor gridAdaptor = new CalendarGridAdaptor(myActivity, R.layout.fragment_calendar);
        gridAdaptor.add(1);
        gridAdaptor.add(2);
        calendar.setAdapter(gridAdaptor);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
