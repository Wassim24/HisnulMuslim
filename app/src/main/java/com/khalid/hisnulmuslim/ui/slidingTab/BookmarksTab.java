package com.khalid.hisnulmuslim.ui.slidingTab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khalid.hisnulmuslim.R;

/**
 * Created by Khalid on 22 Mar 2015.
 */
public class BookmarksTab extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_2, container, false);
        return v;
    }
}
