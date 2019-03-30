//package com.zamhtech.exer.Fragments;
//
//import android.content.Context;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.support.v7.widget.RecyclerView.LayoutManager;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Toast;
//import com.android.volley.Response.ErrorListener;
//import com.android.volley.Response.Listener;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.StringRequest;
//import com.zamhtech.exer.Activities.DetailsActivity;
//import com.zamhtech.exer.Adapters.ExclusiveDealsAdapter;
//import com.zamhtech.exer.Models.DealsModel;
//import com.zamhtech.exer.Network.AppConfig;
//import com.zamhtech.exer.Network.AppController;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.json.JSONObject;
//
//public class ExclusiveDealsFragment extends Fragment {
//    public static RecyclerView recyclerView;
//    String TAG = "ProfileFragment";
//    int shop_id;
//    String shop_name;
//    View view;
//
//    class dealsList extends AsyncTask<Void, Void, Void> {
//
//        /* renamed from: com.zamhtech.exer.Fragments.ExclusiveDealsFragment$dealsList$2 */
//        class C07992 implements ErrorListener {
//            C07992() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String str = ExclusiveDealsFragment.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("MainActivity Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(str, stringBuilder.toString());
//                Toast.makeText(ExclusiveDealsFragment.this.getContext(), volleyError.getMessage(), 1).show();
//            }
//        }
//
//        dealsList() {
//        }
//
//        protected void onPostExecute(Void voidR) {
//            super.onPostExecute(voidR);
//        }
//
//        protected Void doInBackground(Void... voidArr) {
//            fillItemsRecycler(ExclusiveDealsFragment.recyclerView);
//            return null;
//        }
//
//        private void fillItemsRecycler(final RecyclerView recyclerView) {
//            String str = ExclusiveDealsFragment.this.TAG;
//            final List arrayList = new ArrayList();
//            AppController.getInstance().addToRequestQueue(new StringRequest(1, AppConfig.URL_DEALS_FOR_SHOP, new Listener<String>() {
//                public void onResponse(String str) {
//                    String str2 = ExclusiveDealsFragment.this.TAG;
//                    StringBuilder stringBuilder = new StringBuilder();
//                    stringBuilder.append("Response: ");
//                    stringBuilder.append(str);
//                    Log.d(str2, stringBuilder.toString());
//                    arrayList.clear();
//                    try {
//                        JSONObject jSONObject = new JSONObject(str);
//                        if (jSONObject.getBoolean("error") == null) {
//                            str = jSONObject.getJSONArray("Deals");
//                            for (int i = 0; i < str.length(); i++) {
//                                JSONObject jSONObject2 = str.getJSONObject(i);
//                                int i2 = jSONObject2.getInt("id");
//                                int i3 = jSONObject2.getInt("shop_id");
//                                String string = jSONObject2.getString("name");
//                                int i4 = jSONObject2.getInt("price");
//                                arrayList.add(new DealsModel(i2, i3, string, jSONObject2.getInt("discount"), jSONObject2.getString("description"), i4));
//                            }
//                            str = new ExclusiveDealsAdapter(ExclusiveDealsFragment.this.getContext(), arrayList, ExclusiveDealsFragment.this.shop_name);
//                            recyclerView.setHasFixedSize(true);
//                            LayoutManager linearLayoutManager = new LinearLayoutManager(ExclusiveDealsFragment.this.getContext());
//                            linearLayoutManager.setOrientation(1);
//                            recyclerView.setLayoutManager(linearLayoutManager);
//                            recyclerView.setAdapter(str);
//                            return;
//                        }
//                        Log.i(ExclusiveDealsFragment.this.TAG, jSONObject.getString("error_msg"));
//                    } catch (String str3) {
//                        str3.printStackTrace();
//                        Context context = ExclusiveDealsFragment.this.getContext();
//                        StringBuilder stringBuilder2 = new StringBuilder();
//                        stringBuilder2.append("Json error: ");
//                        stringBuilder2.append(str3.getMessage());
//                        Toast.makeText(context, stringBuilder2.toString(), 1).show();
//                    }
//                }
//            }, new C07992()) {
//                protected Map<String, String> getParams() {
//                    Map<String, String> hashMap = new HashMap();
//                    hashMap.put("shop_id", String.valueOf(ExclusiveDealsFragment.this.shop_id));
//                    return hashMap;
//                }
//            }, str);
//        }
//    }
//
//    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
//        this.view = layoutInflater.inflate(C0586R.layout.fragment_exclusive_deals, viewGroup, false);
//        this.shop_id = DetailsActivity.getShopID();
//        this.shop_name = DetailsActivity.getShopName();
//        recyclerView = (RecyclerView) this.view.findViewById(C0586R.id.exclusive_deals_recycler);
//        new dealsList().execute(new Void[0]);
//        return this.view;
//    }
//}
