//package com.example.irfan.exerproject.Activities;
//
//import android.os.Bundle;
//import android.support.v4.view.ViewPager;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.ImageView;
//import android.widget.TextView;
//import com.zamhtech.exer.Adapters.ViewPagerAdapter;
//import com.zamhtech.exer.Fragments.ExclusiveDealsFragment;
//import com.zamhtech.exer.Fragments.InfoFragment;
//import com.zamhtech.exer.Fragments.LocationFragment;
//
//public class DetailsActivity extends AppCompatActivity {
//    static String name;
//    static int shopID;
//    TextView details_name_tv;
//    ImageView fav_btn;
//    private TabLayout tabLayout;
//    private ViewPager viewPager;
//
//    /* renamed from: com.zamhtech.exer.Activities.DetailsActivity$1 */
//    class C05531 implements OnClickListener {
//        int select = null;
//
//        C05531() {
//        }
//
//        public void onClick(View view) {
//            if (this.select % 2 == null) {
//                DetailsActivity.this.fav_btn.setImageResource(C0586R.drawable.ic_y_favorite_red);
//            } else {
//                DetailsActivity.this.fav_btn.setImageResource(C0586R.drawable.ic_n_favorite_white_);
//            }
//            this.select++;
//        }
//    }
//
//    public static int getShopID() {
//        return shopID;
//    }
//
//    public static String getShopName() {
//        return name;
//    }
//
//    protected void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//        setContentView((int) C0586R.layout.activity_details);
//        this.details_name_tv = (TextView) findViewById(C0586R.id.details_name_tv);
//        this.fav_btn = (ImageView) findViewById(C0586R.id.details_image_fav);
//        this.fav_btn.setOnClickListener(new C05531());
//        name = getIntent().getStringExtra("name");
//        shopID = getIntent().getIntExtra("shopID", 0);
//        this.details_name_tv.setText(name);
//        this.viewPager = (ViewPager) findViewById(C0586R.id.viewpager);
//        bundle = new ViewPagerAdapter(getSupportFragmentManager());
//        bundle.addFragment(new ExclusiveDealsFragment(), "Exclusive Deals");
//        bundle.addFragment(new InfoFragment(), "Info");
//        bundle.addFragment(new LocationFragment(), "Location");
//        this.viewPager.setAdapter(bundle);
//        this.tabLayout = (TabLayout) findViewById(C0586R.id.tabs);
//        this.tabLayout.setupWithViewPager(this.viewPager);
//    }
//}
