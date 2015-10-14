package com.example.androidchoi.viewpagerfragment;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Choi on 2015-10-13.
 */
public class AlbumListFragment extends Fragment {

    public static final String ARGS_ALBUM = "album";
    public static int COUNT = 3;
    private static int[] mAlbumArray = new int[COUNT];
    private static int mCurrentPosition;


    //    public static final String ARGS_ALBUM_TWO = "album2";
//    public static final String ARGS_ALBUM_THREE = "album3";
    private AlbumListFragment(){
        TypedArray albums = getResources().obtainTypedArray(R.array.list_name);
        for(int i = 0; i < COUNT ; i++){
            mAlbumArray[i] = albums.getResourceId((mCurrentPosition*COUNT)+i, -1);
        }
    }

    public static AlbumListFragment newInstance(int position) {

        mCurrentPosition = position;
        AlbumListFragment fragment = new AlbumListFragment();
        Bundle bundle = new Bundle();
//        bundle.putInt(ARGS_ALBUM);
        bundle.putIntArray(ARGS_ALBUM, mAlbumArray);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle != null){

        }
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_album_list, container, false);
        ImageView[] imageViews = new ImageView[COUNT];
        imageViews[0] = (ImageView)view.findViewById(R.id.first_album);
        imageViews[1] = (ImageView)view.findViewById(R.id.second_album);
        imageViews[2] = (ImageView)view.findViewById(R.id.third_album);
        for(int i=0; i<COUNT; i++){
            imageViews[i].setImageResource(mAlbumArray[i]);
        }
        return view;
    }
}
