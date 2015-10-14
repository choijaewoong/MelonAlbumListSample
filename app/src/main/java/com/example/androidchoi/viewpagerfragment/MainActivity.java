package com.example.androidchoi.viewpagerfragment;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager mAlbumListPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAlbumListPager = (ViewPager)findViewById(R.id.pager_album_list);
        mAlbumListPager.setClipToPadding(false);
//        mAlbumListPager.setPageMargin();
        mAlbumListPager.setAdapter(new AlbumListAdapter(getSupportFragmentManager()));
    }
}
