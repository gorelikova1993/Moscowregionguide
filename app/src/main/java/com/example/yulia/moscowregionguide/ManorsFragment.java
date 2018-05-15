package com.example.yulia.moscowregionguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * A simple {@link Fragment} subclass.
 */
public class ManorsFragment extends Fragment {


    public ManorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.recycler, container, false);

        final ArrayList<Location> manors = new ArrayList<>();

        manors.add(new Location(
                getString(R.string.KName),
                getString(R.string.kDescription),  getString(R.string.KSite),
                getString(R.string.KGeo), R.drawable.kuskovo));




        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        LocationAdapter adapter = new LocationAdapter(manors,  getContext());

        recyclerView.setAdapter(adapter);

        return rootView;


    }

}
