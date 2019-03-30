package com.example.irfan.exerproject.Activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.os.Bundle;


import com.example.irfan.exerproject.Fragments.BenefitsFragment;
import com.example.irfan.exerproject.Fragments.FavouritesFragment;
import com.example.irfan.exerproject.Fragments.ItemOneFragment;
import com.example.irfan.exerproject.Fragments.LocationFragment;
import com.example.irfan.exerproject.Fragments.ProfileFragment;
import com.example.irfan.exerproject.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    // BottomNavigationView bottomNavigationView;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();
    //SliderLayout sliderLayout;

    BottomNavigationView bottomNavigationView;

    //viewPager
    private ViewPager viewPager;

    //Fragments
    ItemOneFragment homeFragment;
    LocationFragment locationFragment;
    //DashBoardFragment dashBoardFragment;
    FavouritesFragment favouritesFragment;
    BenefitsFragment benefitsFragment;
    ProfileFragment profileFragment;


    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);





        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Initializing the bottomNavigationView
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                                viewPager.setCurrentItem(0);
                                break;
                            case R.id.navigation_map:
                                viewPager.setCurrentItem(1);
                                break;
                            case R.id.navigation_benifits:
                                viewPager.setCurrentItem(2);
                                break;
                            case R.id.navigation_favourite:
                                viewPager.setCurrentItem(3);
                                break;
                            case R.id.navigation_profile:
                                viewPager.setCurrentItem(4);
                                break;
                        }
                        return false;
                    }
                });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page",""+position);
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        homeFragment=new ItemOneFragment();
        locationFragment=new LocationFragment();
        benefitsFragment=new BenefitsFragment();
        favouritesFragment=new FavouritesFragment();
        profileFragment=new ProfileFragment();

        adapter.addFragment(homeFragment);
        adapter.addFragment(locationFragment);
        adapter.addFragment(benefitsFragment);
        adapter.addFragment(favouritesFragment);
        adapter.addFragment(profileFragment);
        viewPager.setAdapter(adapter);
    }

    private class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);
        }
















//        sliderLayout = findViewById(R.id.imageSlider);
//        sliderLayout.setIndicatorAnimation(SliderLayout.Animations.FILL);
//        //set indicator animation by using SliderLayout.Animations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
//        sliderLayout.setScrollTimeInSec(1); //set scroll delay in seconds :
//
//        setSliderViews();
    }

//    private void setSliderViews() {
//
//        for (int i = 0; i <= 3; i++) {
//
//            SliderView sliderView = new SliderView(this);
//
//            switch (i) {
//                case 0:
//                    sliderView.setImageUrl("https://images.pexels.com/photos/547114/pexels-photo-547114.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
//                    break;
//                case 1:
//                    sliderView.setImageUrl("https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
//                    break;
//                case 2:
//                    sliderView.setImageUrl("https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
//                    break;
//                case 3:
//                    sliderView.setImageUrl("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
//                    break;
//            }
//
//            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
//            sliderView.setDescription("setDescription " + (i + 1));
//            final int finalI = i;
//            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
//                @Override
//                public void onSliderClick(SliderView sliderView) {
//                    Toast.makeText(MainActivity.this, "This is slider " + (finalI + 1), Toast.LENGTH_SHORT).show();
//                }
//            });
//
//            //at last add this view in your layout :
//            sliderLayout.addSliderView(sliderView);
//        }



        // Pager listener over indicator
//        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//            @Override
//            public void onPageSelected(int position) {
//                currentPage = position;
//
//            }
//
//            @Override
//            public void onPageScrolled(int pos, float arg1, int arg2) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int pos) {
//
//            }
//        });


//        ViewPager viewpager = (ViewPager)findViewById(R.id.viewpager);
//        viewpager.setAdapter(adapter);
//
//        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
//        indicator.setViewPager(viewpager);
//        adapter.registerDataSetObserver(indicator.getDataSetObserver());


//    /* renamed from: com.zamhtech.exer.Activities.MainActivity$1 */
//    class C07911 implements OnNavigationItemSelectedListener {
//        C07911() {
//        }
//
//        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//            switch (menuItem.getItemId()) {
//                case C0586R.id.navigation_benefits:
//                    MainActivity.this.viewPager_home.setCurrentItem(2);
//                    break;
//                case C0586R.id.navigation_favorites:
//                    MainActivity.this.viewPager_home.setCurrentItem(3);
//                    break;
//                case C0586R.id.navigation_home:
//                    MainActivity.this.viewPager_home.setCurrentItem(0);
//                    break;
//                case C0586R.id.navigation_map:
//                    MainActivity.this.viewPager_home.setCurrentItem(1);
//                    break;
//                case C0586R.id.navigation_profile:
//                    MainActivity.this.viewPager_home.setCurrentItem(4);
//                    break;
//                default:
//                    break;
//            }
//            return false;
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Activities.MainActivity$2 */
//    class C07922 implements OnPageChangeListener {
//        public void onPageScrollStateChanged(int i) {
//        }
//
//        public void onPageScrolled(int i, float f, int i2) {
//        }
//
//        C07922() {
//        }
//
//        public void onPageSelected(int i) {
//            if (MainActivity.this.prevMenuItem != null) {
//                MainActivity.this.prevMenuItem.setChecked(false);
//            } else {
//                MainActivity.this.bottomNavigationView.getMenu().getItem(0).setChecked(false);
//            }
//            String str = PlaceFields.PAGE;
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("onPageSelected: ");
//            stringBuilder.append(i);
//            Log.d(str, stringBuilder.toString());
//            MainActivity.this.bottomNavigationView.getMenu().getItem(i).setChecked(true);
//            MainActivity.this.prevMenuItem = MainActivity.this.bottomNavigationView.getMenu().getItem(i);
//        }
//    }
//
//    protected void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//        setContentView((int) C0586R.layout.activity_home);
//        new ToneGenerator(3, 80).startTone(24, Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
//        this.viewPager_home = (ViewPager) findViewById(C0586R.id.viewpager_home);
//        this.bottomNavigationView = (BottomNavigationView) findViewById(C0586R.id.bottom_navigation_home);
//        BottomNavigationViewHelper.disableShiftMode(this.bottomNavigationView);
//        this.bottomNavigationView.setOnNavigationItemSelectedListener(new C07911());
//        this.viewPager_home.addOnPageChangeListener(new C07922());
//        bundle = new ViewPagerAdapter(getSupportFragmentManager());
//        bundle.addFragment(new HomeFragment(), "Home");
//        bundle.addFragment(new LocationFragment(), "Map");
//        bundle.addFragment(new BenefitsFragment(), "Benefits");
//        bundle.addFragment(new FavouritesFragment(), "Favourites");
//        bundle.addFragment(new ProfileFragment(), "Account");
//        this.viewPager_home.setAdapter(bundle);
//    }
    }
