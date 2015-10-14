package com.example.androidchoi.viewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Choi on 2015-10-13.
 */
public class AlbumListAdapter extends FragmentPagerAdapter {
//
//    public static int COUNT = 3;
//    int[] mAlbumArray = new int[AlbumListFragment.COUNT];

    public AlbumListAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return AlbumListFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
