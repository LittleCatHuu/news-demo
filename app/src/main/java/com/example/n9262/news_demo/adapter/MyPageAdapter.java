package com.example.n9262.news_demo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.n9262.news_demo.fragment.NewsFragment;

import java.util.ArrayList;

/**
 * Created by n9262 on 2017/6/11.
 */
public class MyPageAdapter extends FragmentPagerAdapter {
    private ArrayList<NewsFragment> mFragmentArrayList;
    private ArrayList<String> mTitleList;

    public MyPageAdapter(FragmentManager fm, ArrayList<NewsFragment> fragmentArrayList, ArrayList<String> titleList) {
        super(fm);
        this.mFragmentArrayList = fragmentArrayList;
        this.mTitleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        if(position < mFragmentArrayList.size()){
            return mFragmentArrayList.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        if(mFragmentArrayList == null){
            return 0;
        }
        return mFragmentArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(mTitleList != null && position < mTitleList.size()) {
            return mTitleList.get(position);
        }

        return "notitle";
    }
}
