//package com.example.irfan.exerproject.Activities;
//
//import android.os.Bundle;
//import android.support.design.widget.TabLayout;
//import android.support.v4.view.PagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import com.zamhtech.exer.Adapters.ViewPagerAdapter;
//import com.zamhtech.exer.Fragments.BeautyAndWellnessCatFragment;
//import com.zamhtech.exer.Fragments.EntertainmentCatFragment;
//import com.zamhtech.exer.Fragments.FoodAndDrinksCatFragment;
//import com.zamhtech.exer.Fragments.RetailandServicesCatFragment;
//import com.zamhtech.exer.Fragments.TravelandHotelsCatFragment;
//import com.zamhtech.exer.Fragments.WebDealsCatFragment;
//
//public class CategoryActivity extends AppCompatActivity {
//    private TabLayout tabLayout;
//    private Toolbar toolbar;
//    private ViewPager viewPager;
//
//    protected void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//        setContentView(R.layout.activity_category);
//        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(this.toolbar);
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
//        this.viewPager = (ViewPager) findViewById(R.id.viewpager);
//        this.viewPager.setOffscreenPageLimit(6);
//        setupViewPager(this.viewPager);
//        this.tabLayout = (TabLayout) findViewById(R.id.tabs);
//        this.tabLayout.setTabMode(0);
//        this.tabLayout.setupWithViewPager(this.viewPager);
//        setupTabIcons();
//    }
//
//    private void setupTabIcons() {
//        this.tabLayout.getTabAt(0).setIcon(R.drawable.glass);
//        this.tabLayout.getTabAt(1).setIcon(R.drawable.heart);
//        this.tabLayout.getTabAt(2).setIcon(R.drawable.steering);
//        this.tabLayout.getTabAt(3).setIcon((R.drawable.shopping_bag);
//        this.tabLayout.getTabAt(4).setIcon(R.drawable.world_wide_web);
//        this.tabLayout.getTabAt(5).setIcon(R.drawable.hotel);
//    }
//
//    private void setupViewPager(ViewPager viewPager) {
//        PagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
//        viewPagerAdapter.addFragment(new FoodAndDrinksCatFragment(), "Food and Drinks");
//        viewPagerAdapter.addFragment(new BeautyAndWellnessCatFragment(), "Beauty And Wellness");
//        viewPagerAdapter.addFragment(new EntertainmentCatFragment(), "Entertainment");
//        viewPagerAdapter.addFragment(new RetailandServicesCatFragment(), "Retail & Services");
//        viewPagerAdapter.addFragment(new WebDealsCatFragment(), "Web Deals");
//        viewPagerAdapter.addFragment(new TravelandHotelsCatFragment(), "Travel & Hotels");
//        viewPager.setAdapter(viewPagerAdapter);
//    }
//}
