package com.example.yulia.moscowregionguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    Context context;

    public CategoryAdapter(FragmentManager fragmentManager, Context mContext) {
        super(fragmentManager);
        context = mContext;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.Manors);
            case 1:
                return context.getString(R.string.Parks);
            case 2:
                return context.getString(R.string.Galleries);
            default:
                return context.getString(R.string.Museums);

        }
    }

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ManorsFragment();
            case 1:
                return new ParksFragment();
            case 2:
                return new GalleriesFragment();
            default:
                return new MuseumsFragment();

        }
    }

    public int getCount() {
        return 4;
    }

}
