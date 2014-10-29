package com.nydev.reach;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mark on 10/27/2014.
 */
public class GoalSelectionFragment extends Fragment {

    private final String LOG_TAG = GoalSelectionFragment.class.getSimpleName();

    private ArrayAdapter<String> mGoalAdapter;

    public GoalSelectionFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mGoalAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_goal,
                R.id.list_item_goal_textview,
                new ArrayList<String>()
        );

        ListView listView = (ListView) rootView.findViewById(R.id.listview_goal);
        listView.setAdapter(mGoalAdapter);

        mGoalAdapter.add("Exercise");
        mGoalAdapter.add("Diet");

        listView.setAdapter(mGoalAdapter);

        return rootView;
    }
}
