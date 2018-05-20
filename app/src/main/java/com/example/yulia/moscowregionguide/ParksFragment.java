package com.example.yulia.moscowregionguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.recycler, container, false);
        final ArrayList<Location> parks = new ArrayList<>();

        parks.add(new Location(getString(R.string.gName), getString(R.string.gDescription),
                getString(R.string.gSite), getString(R.string.gGeo), R.drawable.parkgorkogo));
        parks.add(new Location(getString(R.string.iName), getString(R.string.iDescription), getString(R.string.iSite),
                getString(R.string.iGeo), R.drawable.izmailovski));
        parks.add(new Location(getString(R.string.vName), getString(R.string.vDescription),
                getString(R.string.vSite), getString(R.string.vGeo), R.drawable.vorobievy_mountains));
        parks.add(new Location(getString(R.string.soName), getString(R.string.soDescription),
                getString(R.string.soSite), getString(R.string.soGeo), R.drawable.sokolniki));
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        LocationAdapter adapter = new LocationAdapter(parks, getContext());
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
