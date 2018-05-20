package com.example.yulia.moscowregionguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.recycler, container, false);
        final ArrayList<Location> museums = new ArrayList<>();

        museums.add(new Location(getString(R.string.bName), getString(R.string.bDescription), getString(R.string.bSite),
                getString(R.string.bGeo), R.drawable.bulgakov));
        museums.add(new Location(getString(R.string.hName), getString(R.string.hDesription), getString(R.string.hSite),
                getString(R.string.hGeo), R.drawable.historical_museum));
        museums.add(new Location(getString(R.string.dName), getString(R.string.dDescription), getString(R.string.dSite),
                getString(R.string.dGeo), R.drawable.darvinovskiy_museum));
        museums.add(new Location(getString(R.string.wName), getString(R.string.wDescription), getString(R.string.wSite),
                getString(R.string.wGeo), R.drawable.war_museum));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        LocationAdapter adapter = new LocationAdapter(museums, getContext());
        recyclerView.setAdapter(adapter);

        return rootView;


    }

}
