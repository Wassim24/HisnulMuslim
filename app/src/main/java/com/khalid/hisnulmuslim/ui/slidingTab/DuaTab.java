package com.khalid.hisnulmuslim.ui.slidingTab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.khalid.hisnulmuslim.R;
import com.khalid.hisnulmuslim.adapter.DuaGroupAdapter;
import com.khalid.hisnulmuslim.loader.DuaGroupLoader;
import com.khalid.hisnulmuslim.model.Dua;

import java.util.List;

/**
 * Created by Khalid on 22 Mar 2015.
 */
public class DuaTab extends Fragment {
    private DuaGroupAdapter mAdapter;
    private ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_1, container, false);
        mListView = (ListView) v.findViewById(R.id.duaListView);

        return v;
    }

    @Override
    public Loader<List<Dua>> onCreateLoader(int id, Bundle args) {
        return new DuaGroupLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<List<Dua>> loader, List<Dua> data) {
        if (mAdapter == null) {
            mAdapter = new DuaGroupAdapter(this, data, );
            mListView.setAdapter(mAdapter);
        } else {
            mAdapter.setData(data);
        }
    }

    public void onLoaderReset(Loader<List<Dua>> loader) {
        mAdapter.setData(null);
    }
}