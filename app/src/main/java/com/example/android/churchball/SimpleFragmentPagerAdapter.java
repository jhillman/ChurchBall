package com.example.android.churchball;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jesserich on 1/17/18.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;
    private String[] titles = new String[]{"Team A", "Team B"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new TeamAFragment();
            case 1: return new TeamBFragment();
            default: return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
