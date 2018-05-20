package com.example.yulia.moscowregionguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleriesFragment extends Fragment {


    public GalleriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.recycler, container, false);
        final ArrayList<Location> galleries = new ArrayList<>();

        galleries.add(new Location(getString(R.string.trName), getString(R.string.trDescription), getString(R.string.trSite),
                getString(R.string.trGeo), R.drawable.tretyakovgallery));
        galleries.add(new Location(getString(R.string.vinName), getString(R.string.vinDescription),
                getString(R.string.vinSite), getString(R.string.vinGeo), R.drawable.vinzavod));
        galleries.add(new Location(getString(R.string.pushName), getString(R.string.pushDescription),
                getString(R.string.pushSite), getString(R.string.pushGeo), R.drawable.push));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        LocationAdapter adapter = new LocationAdapter(galleries, getContext());
        recyclerView.setAdapter(adapter);

        return rootView;
    }

}
