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
//        if (position == 0)
            return context.getString(R.string.Manors);

        }


    public Fragment getItem(int position) {
        switch (position) {

            default:
                return new ManorsFragment();

        }
    }

    public int getCount() {
        return 1;
    }

}
