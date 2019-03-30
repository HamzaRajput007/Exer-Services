//package com.zamhtech.exer.Fragments;
//
//import android.content.Context;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.net.Uri;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.os.Handler;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.support.v4.view.ViewPager;
//import android.support.v4.view.ViewPager.OnPageChangeListener;
//import android.support.v7.app.AlertDialog.Builder;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.RecyclerView.LayoutManager;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.ViewGroup;
//import android.widget.Toast;
//import com.android.volley.Response.ErrorListener;
//import com.android.volley.Response.Listener;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.StringRequest;
//import com.viewpagerindicator.CirclePageIndicator;
//import com.zamhtech.exer.Activities.CategoryActivity;
//import com.zamhtech.exer.Adapters.HotDealsAdapter;
//import com.zamhtech.exer.Adapters.NearByDealsAdapter;
//import com.zamhtech.exer.Adapters.NewShopsAdapter;
//import com.zamhtech.exer.Adapters.PremiumDealsAdapter;
//import com.zamhtech.exer.Models.ImageModel;
//import com.zamhtech.exer.Models.ShopsModel;
//import com.zamhtech.exer.Models.SlidingImage_Adapter;
//import com.zamhtech.exer.Network.AppConfig;
//import com.zamhtech.exer.Network.AppController;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Timer;
//import java.util.TimerTask;
//import org.json.JSONObject;
//
//public class HomeFragment extends Fragment {
//    private static int NUM_PAGES;
//    private static int currentPage;
//    private static ViewPager mPager;
//    String TAG = "HomeFragmentFragment";
//    List<ShopsModel> hotdealsModelList = new ArrayList();
//    private ArrayList<ImageModel> imageModelArrayList;
//    private int[] myImageList = new int[]{C0586R.drawable.burger, C0586R.drawable.stakes, C0586R.drawable.fish, C0586R.drawable.sandwich, C0586R.drawable.icecream, C0586R.drawable.drink};
//    List<ShopsModel> nearDealsModelList = new ArrayList();
//    List<ShopsModel> newShopsModelList = new ArrayList();
//    List<ShopsModel> premiumDealsModelList = new ArrayList();
//    RecyclerView recyclerView_hotdeals;
//    RecyclerView recyclerView_nearDeals;
//    RecyclerView recyclerView_newShops;
//    RecyclerView recyclerView_premiumDeals;
//    View view;
//
//    /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$1 */
//    class C05621 implements OnClickListener {
//        C05621() {
//        }
//
//        public void onClick(View view) {
//            HomeFragment.this.startActivity(new Intent(HomeFragment.this.getContext(), CategoryActivity.class));
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$2 */
//    class C05632 implements Runnable {
//        C05632() {
//        }
//
//        public void run() {
//            if (HomeFragment.currentPage == HomeFragment.NUM_PAGES) {
//                HomeFragment.currentPage = 0;
//            }
//            HomeFragment.mPager.setCurrentItem(HomeFragment.access$008(), true);
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$5 */
//    class C05655 implements DialogInterface.OnClickListener {
//        public void onClick(DialogInterface dialogInterface, int i) {
//        }
//
//        C05655() {
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$6 */
//    class C05666 implements DialogInterface.OnClickListener {
//        public void onClick(DialogInterface dialogInterface, int i) {
//        }
//
//        C05666() {
//        }
//    }
//
//    class displayAllItems extends AsyncTask<Void, Void, Void> {
//
//        /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$displayAllItems$2 */
//        class C08042 implements ErrorListener {
//            C08042() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String str = HomeFragment.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("MainActivity Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(str, stringBuilder.toString());
//                Toast.makeText(HomeFragment.this.getContext(), volleyError.getMessage(), 1).show();
//            }
//        }
//
//        displayAllItems() {
//        }
//
//        protected void onPostExecute(Void voidR) {
//            super.onPostExecute(voidR);
//        }
//
//        protected Void doInBackground(Void... voidArr) {
//            fillItemsRecycler(HomeFragment.this.recyclerView_hotdeals);
//            return null;
//        }
//
//        private void fillItemsRecycler(final RecyclerView recyclerView) {
//            RecyclerView c08693 = new StringRequest(1, AppConfig.URL_HOTDEALS, new Listener<String>() {
//                public void onResponse(String str) {
//                    String str2 = HomeFragment.this.TAG;
//                    StringBuilder stringBuilder = new StringBuilder();
//                    stringBuilder.append("MainActivity Response: ");
//                    stringBuilder.append(str);
//                    Log.d(str2, stringBuilder.toString());
//                    HomeFragment.this.hotdealsModelList.clear();
//                    try {
//                        JSONObject jSONObject = new JSONObject(str);
//                        if (jSONObject.getBoolean("error") == null) {
//                            str = jSONObject.getJSONArray("Deals");
//                            for (int i = 0; i < str.length(); i++) {
//                                JSONObject jSONObject2 = str.getJSONObject(i);
//                                HomeFragment.this.hotdealsModelList.add(new ShopsModel(jSONObject2.getInt("id"), jSONObject2.getString("Name"), jSONObject2.getInt("catId"), jSONObject2.getString("Address"), jSONObject2.getInt("discount_percentage")));
//                            }
//                            str = new HotDealsAdapter(HomeFragment.this.getContext(), HomeFragment.this.hotdealsModelList);
//                            recyclerView.setHasFixedSize(true);
//                            LayoutManager linearLayoutManager = new LinearLayoutManager(HomeFragment.this.getContext());
//                            linearLayoutManager.setOrientation(1);
//                            recyclerView.setLayoutManager(linearLayoutManager);
//                            recyclerView.setAdapter(str);
//                            return;
//                        }
//                        Log.i(HomeFragment.this.TAG, jSONObject.getString("error_msg"));
//                    } catch (String str3) {
//                        str3.printStackTrace();
//                        Context context = HomeFragment.this.getContext();
//                        StringBuilder stringBuilder2 = new StringBuilder();
//                        stringBuilder2.append("Json error: ");
//                        stringBuilder2.append(str3.getMessage());
//                        Toast.makeText(context, stringBuilder2.toString(), 1).show();
//                    }
//                }
//            }, new C08042()) {
//                protected Map<String, String> getParams() {
//                    return new HashMap();
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08693, "req_Datafillerrecycler");
//        }
//    }
//
//    class nearDeals extends AsyncTask<Void, Void, Void> {
//
//        /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$nearDeals$2 */
//        class C08062 implements ErrorListener {
//            C08062() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String str = HomeFragment.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("MainActivity Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(str, stringBuilder.toString());
//                Toast.makeText(HomeFragment.this.getContext(), volleyError.getMessage(), 1).show();
//            }
//        }
//
//        nearDeals() {
//        }
//
//        protected void onPostExecute(Void voidR) {
//            super.onPostExecute(voidR);
//        }
//
//        protected Void doInBackground(Void... voidArr) {
//            fillItemsRecycler(HomeFragment.this.recyclerView_nearDeals);
//            return null;
//        }
//
//        private void fillItemsRecycler(final RecyclerView recyclerView) {
//            RecyclerView c08703 = new StringRequest(1, AppConfig.URL_NEARDEALS, new Listener<String>() {
//                public void onResponse(String str) {
//                    String str2 = HomeFragment.this.TAG;
//                    StringBuilder stringBuilder = new StringBuilder();
//                    stringBuilder.append("MainActivity Response: ");
//                    stringBuilder.append(str);
//                    Log.d(str2, stringBuilder.toString());
//                    HomeFragment.this.premiumDealsModelList.clear();
//                    try {
//                        JSONObject jSONObject = new JSONObject(str);
//                        if (jSONObject.getBoolean("error") == null) {
//                            str = jSONObject.getJSONArray("Shops");
//                            for (int i = 0; i < str.length(); i++) {
//                                JSONObject jSONObject2 = str.getJSONObject(i);
//                                HomeFragment.this.nearDealsModelList.add(new ShopsModel(jSONObject2.getInt("id"), jSONObject2.getString("Name"), jSONObject2.getInt("catId"), jSONObject2.getString("Address"), jSONObject2.getInt("discount_percentage")));
//                            }
//                            str = new NearByDealsAdapter(HomeFragment.this.getContext(), HomeFragment.this.nearDealsModelList);
//                            recyclerView.setHasFixedSize(true);
//                            LayoutManager linearLayoutManager = new LinearLayoutManager(HomeFragment.this.getContext());
//                            linearLayoutManager.setOrientation(0);
//                            recyclerView.setLayoutManager(linearLayoutManager);
//                            recyclerView.setAdapter(str);
//                            return;
//                        }
//                        Log.i(HomeFragment.this.TAG, jSONObject.getString("error_msg"));
//                    } catch (String str3) {
//                        str3.printStackTrace();
//                        Context context = HomeFragment.this.getContext();
//                        StringBuilder stringBuilder2 = new StringBuilder();
//                        stringBuilder2.append("Json error: ");
//                        stringBuilder2.append(str3.getMessage());
//                        Toast.makeText(context, stringBuilder2.toString(), 1).show();
//                    }
//                }
//            }, new C08062()) {
//                protected Map<String, String> getParams() {
//                    return new HashMap();
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08703, "nearDeals");
//        }
//    }
//
//    class newShopsDeals extends AsyncTask<Void, Void, Void> {
//
//        /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$newShopsDeals$2 */
//        class C08082 implements ErrorListener {
//            C08082() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String str = HomeFragment.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("MainActivity Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(str, stringBuilder.toString());
//                Toast.makeText(HomeFragment.this.getContext(), volleyError.getMessage(), 1).show();
//            }
//        }
//
//        newShopsDeals() {
//        }
//
//        protected void onPostExecute(Void voidR) {
//            super.onPostExecute(voidR);
//        }
//
//        protected Void doInBackground(Void... voidArr) {
//            fillItemsRecycler(HomeFragment.this.recyclerView_newShops);
//            return null;
//        }
//
//        private void fillItemsRecycler(final RecyclerView recyclerView) {
//            RecyclerView c08713 = new StringRequest(1, AppConfig.URL_NEWSHOPS, new Listener<String>() {
//                public void onResponse(String str) {
//                    String str2 = HomeFragment.this.TAG;
//                    StringBuilder stringBuilder = new StringBuilder();
//                    stringBuilder.append("MainActivity Response: ");
//                    stringBuilder.append(str);
//                    Log.d(str2, stringBuilder.toString());
//                    HomeFragment.this.newShopsModelList.clear();
//                    try {
//                        JSONObject jSONObject = new JSONObject(str);
//                        if (jSONObject.getBoolean("error") == null) {
//                            str = jSONObject.getJSONArray("Shops");
//                            for (int i = 0; i < str.length(); i++) {
//                                JSONObject jSONObject2 = str.getJSONObject(i);
//                                HomeFragment.this.newShopsModelList.add(new ShopsModel(jSONObject2.getInt("id"), jSONObject2.getString("Name"), jSONObject2.getInt("catId"), jSONObject2.getString("Address"), jSONObject2.getInt("discount_percentage")));
//                            }
//                            str = new NewShopsAdapter(HomeFragment.this.getContext(), HomeFragment.this.newShopsModelList);
//                            recyclerView.setHasFixedSize(true);
//                            LayoutManager linearLayoutManager = new LinearLayoutManager(HomeFragment.this.getContext());
//                            linearLayoutManager.setOrientation(0);
//                            recyclerView.setLayoutManager(linearLayoutManager);
//                            recyclerView.setAdapter(str);
//                            return;
//                        }
//                        Log.i(HomeFragment.this.TAG, jSONObject.getString("error_msg"));
//                    } catch (String str3) {
//                        str3.printStackTrace();
//                        Context context = HomeFragment.this.getContext();
//                        StringBuilder stringBuilder2 = new StringBuilder();
//                        stringBuilder2.append("Json error: ");
//                        stringBuilder2.append(str3.getMessage());
//                        Toast.makeText(context, stringBuilder2.toString(), 1).show();
//                    }
//                }
//            }, new C08082()) {
//                protected Map<String, String> getParams() {
//                    return new HashMap();
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08713, "req_datarecycler");
//        }
//    }
//
//    class premiumDeals extends AsyncTask<Void, Void, Void> {
//
//        /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$premiumDeals$2 */
//        class C08102 implements ErrorListener {
//            C08102() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String str = HomeFragment.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("MainActivity Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(str, stringBuilder.toString());
//                Toast.makeText(HomeFragment.this.getContext(), volleyError.getMessage(), 1).show();
//            }
//        }
//
//        premiumDeals() {
//        }
//
//        protected void onPostExecute(Void voidR) {
//            super.onPostExecute(voidR);
//        }
//
//        protected Void doInBackground(Void... voidArr) {
//            fillItemsRecycler(HomeFragment.this.recyclerView_premiumDeals);
//            return null;
//        }
//
//        private void fillItemsRecycler(final RecyclerView recyclerView) {
//            RecyclerView c08723 = new StringRequest(1, AppConfig.URL_PREMIUMDEALS, new Listener<String>() {
//                public void onResponse(String str) {
//                    String str2 = HomeFragment.this.TAG;
//                    StringBuilder stringBuilder = new StringBuilder();
//                    stringBuilder.append("MainActivity Response: ");
//                    stringBuilder.append(str);
//                    Log.d(str2, stringBuilder.toString());
//                    HomeFragment.this.premiumDealsModelList.clear();
//                    try {
//                        JSONObject jSONObject = new JSONObject(str);
//                        if (jSONObject.getBoolean("error") == null) {
//                            str = jSONObject.getJSONArray("Shops");
//                            for (int i = 0; i < str.length(); i++) {
//                                JSONObject jSONObject2 = str.getJSONObject(i);
//                                HomeFragment.this.premiumDealsModelList.add(new ShopsModel(jSONObject2.getInt("id"), jSONObject2.getString("Name"), jSONObject2.getInt("catId"), jSONObject2.getString("Address"), jSONObject2.getInt("discount_percentage")));
//                            }
//                            str = new PremiumDealsAdapter(HomeFragment.this.getContext(), HomeFragment.this.premiumDealsModelList);
//                            recyclerView.setHasFixedSize(true);
//                            LayoutManager linearLayoutManager = new LinearLayoutManager(HomeFragment.this.getContext());
//                            linearLayoutManager.setOrientation(0);
//                            recyclerView.setLayoutManager(linearLayoutManager);
//                            recyclerView.setAdapter(str);
//                            return;
//                        }
//                        Log.i(HomeFragment.this.TAG, jSONObject.getString("error_msg"));
//                    } catch (String str3) {
//                        str3.printStackTrace();
//                        Context context = HomeFragment.this.getContext();
//                        StringBuilder stringBuilder2 = new StringBuilder();
//                        stringBuilder2.append("Json error: ");
//                        stringBuilder2.append(str3.getMessage());
//                        Toast.makeText(context, stringBuilder2.toString(), 1).show();
//                    }
//                }
//            }, new C08102()) {
//                protected Map<String, String> getParams() {
//                    return new HashMap();
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08723, "premiumDeals");
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Fragments.HomeFragment$4 */
//    class C08024 implements OnPageChangeListener {
//        public void onPageScrollStateChanged(int i) {
//        }
//
//        public void onPageScrolled(int i, float f, int i2) {
//        }
//
//        C08024() {
//        }
//
//        public void onPageSelected(int i) {
//            HomeFragment.currentPage = i;
//        }
//    }
//
//    static /* synthetic */ int access$008() {
//        int i = currentPage;
//        currentPage = i + 1;
//        return i;
//    }
//
//    @Nullable
//    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
//        this.view = layoutInflater.inflate(C0586R.layout.fragment_home, viewGroup, false);
//        this.recyclerView_hotdeals = (RecyclerView) this.view.findViewById(C0586R.id.recyclerview_hotdeals);
//        this.recyclerView_newShops = (RecyclerView) this.view.findViewById(C0586R.id.recyclerview_newshops);
//        this.recyclerView_premiumDeals = (RecyclerView) this.view.findViewById(C0586R.id.recyclerview_permdeals);
//        this.recyclerView_nearDeals = (RecyclerView) this.view.findViewById(C0586R.id.recyclerview_neardeals);
//        this.recyclerView_hotdeals.setNestedScrollingEnabled(false);
//        this.recyclerView_newShops.setNestedScrollingEnabled(false);
//        this.recyclerView_premiumDeals.setNestedScrollingEnabled(false);
//        this.recyclerView_nearDeals.setNestedScrollingEnabled(false);
//        new displayAllItems().execute(new Void[0]);
//        new newShopsDeals().execute(new Void[0]);
//        new premiumDeals().execute(new Void[0]);
//        new nearDeals().execute(new Void[0]);
//        this.imageModelArrayList = new ArrayList();
//        this.imageModelArrayList = populateList();
//        init();
//        layoutInflater = new C05621();
//        this.view.findViewById(C0586R.id.food).setOnClickListener(layoutInflater);
//        this.view.findViewById(C0586R.id.beauty).setOnClickListener(layoutInflater);
//        this.view.findViewById(C0586R.id.web).setOnClickListener(layoutInflater);
//        this.view.findViewById(C0586R.id.retail).setOnClickListener(layoutInflater);
//        this.view.findViewById(C0586R.id.hotels).setOnClickListener(layoutInflater);
//        this.view.findViewById(C0586R.id.entertainment).setOnClickListener(layoutInflater);
//        return this.view;
//    }
//
//    private ArrayList<ImageModel> populateList() {
//        ArrayList<ImageModel> arrayList = new ArrayList();
//        for (int i = 0; i <= 5; i++) {
//            ImageModel imageModel = new ImageModel();
//            imageModel.setImage_drawable(this.myImageList[i]);
//            arrayList.add(imageModel);
//        }
//        return arrayList;
//    }
//
//    private void init() {
//        mPager = (ViewPager) this.view.findViewById(C0586R.id.pager);
//        mPager.setAdapter(new SlidingImage_Adapter(getContext(), this.imageModelArrayList));
//        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) this.view.findViewById(C0586R.id.indicator);
//        circlePageIndicator.setFillColor(C0586R.color.colorPrimary);
//        circlePageIndicator.setViewPager(mPager);
//        circlePageIndicator.setRadius(getResources().getDisplayMetrics().density * 3.0f);
//        NUM_PAGES = this.imageModelArrayList.size();
//        final Handler handler = new Handler();
//        final Runnable c05632 = new C05632();
//        new Timer().schedule(new TimerTask() {
//            public void run() {
//                handler.post(c05632);
//            }
//        }, 10000, 10000);
//        circlePageIndicator.setOnPageChangeListener(new C08024());
//    }
//
//    private void Feedback() {
//        Intent intent = new Intent("android.intent.action.SEND");
//        intent.setType("text/email");
//        intent.putExtra("android.intent.extra.EMAIL", new String[]{"contact@enscyd.com"});
//        intent.putExtra("android.intent.extra.SUBJECT", "Feedback on Unplug alarm & Full Battery");
//        intent.putExtra("android.intent.extra.TEXT", "Dear Developers,");
//        startActivity(Intent.createChooser(intent, "Send Feedback:"));
//        getActivity().overridePendingTransition(0, 0);
//    }
//
//    private void visitWebsite() {
//        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.enscyd.com")));
//        getActivity().overridePendingTransition(0, 0);
//    }
//
//    private void privacyPolicy() {
//        new Builder(getContext()).setTitle((CharSequence) "Disclaimer").setMessage((CharSequence) "We do not gather users information without their consent.").setPositiveButton((CharSequence) "Close", new C05655()).setIcon((int) C0586R.mipmap.ic_launcher).show();
//    }
//
//    private void aboutus() {
//        new Builder(getContext()).setTitle((CharSequence) "About Exer").setMessage((CharSequence) "Exer has got you covered by putting great local and international businesses right at your fingertips. Discover new Food joints, hot spots or places for shopping near you and avail FREE handsome discounts up-to 80% as easy as possible. SavYour is your one stop solution to get Limitless Savings on the best deals and discounts available from 800+ Brands. \nRemember, spending without discounts is just too expensive!\nRemain updated with our latest offerings by following us on our Social Media handles.").setPositiveButton((CharSequence) "Close", new C05666()).setIcon((int) C0586R.mipmap.ic_launcher).show();
//    }
//}
