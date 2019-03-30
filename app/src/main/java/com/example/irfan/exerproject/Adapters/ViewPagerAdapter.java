//package com.example.irfan.exerproject.Adapters;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ViewPagerAdapter extends FragmentPagerAdapter {
//    private final List<Fragment> mFragmentList = new ArrayList();
//    private final List<String> mFragmentTitleList = new ArrayList();
//
//    public ViewPagerAdapter(FragmentManager fragmentManager) {
//        super(fragmentManager);
//    }
//
//    public Fragment getItem(int i) {
//        return (Fragment) this.mFragmentList.get(i);
//    }
//
//    public int getCount() {
//        return this.mFragmentList.size();
//    }
//
//    public void addFragment(Fragment fragment, String str) {
//        this.mFragmentList.add(fragment);
//        this.mFragmentTitleList.add(str);
//    }
//
//    public CharSequence getPageTitle(int i) {
//        return (CharSequence) this.mFragmentTitleList.get(i);
//    }
//}
