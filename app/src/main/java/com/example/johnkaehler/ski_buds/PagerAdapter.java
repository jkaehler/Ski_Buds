package com.example.johnkaehler.ski_buds;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int i) {
        /*Fragment fragment = new SingleFragment();
        Bundle args = new Bundle();
        // Our object is just an integer :-P
        args.putInt(SingleFragment.ARG_OBJECT, i + 1);
        fragment.setArguments(args);
        return fragment;*/
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}
