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
        manors.add(new Location(getString(R.string.aName), getString(R.string.aDescription),
                getString(R.string.aSite), getString(R.string.aGeo), R.drawable.arkhangelskoe ));
        manors.add(new Location(getString(R.string.MName), getString(R.string.mDescription),
                getString(R.string.mSite), getString(R.string.mGeo), R.drawable.marfino));
        manors.add(new Location(getString(R.string.sName), getString(R.string.sDescription), getString(R.string.sSite),
                getString(R.string.sGeo), R.drawable.serednikovo));





        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        LocationAdapter adapter = new LocationAdapter(manors,  getContext());

        recyclerView.setAdapter(adapter);

        return rootView;


    }

}
