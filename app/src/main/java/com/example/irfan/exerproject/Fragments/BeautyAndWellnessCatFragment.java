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
//import com.zamhtech.exer.Adapters.HotDealsAdapter;
//import com.zamhtech.exer.Models.ShopsModel;
//import com.zamhtech.exer.Network.AppConfig;
//import com.zamhtech.exer.Network.AppController;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.json.JSONObject;
//
//public class BeautyAndWellnessCatFragment extends Fragment {
//    String TAG = "CatFragment";
//    private int cat_id = 3;
//    RecyclerView recyclerView;
//    View view;
//
//    class shopsList extends AsyncTask<Void, Void, Void> {
//
//        /* renamed from: com.zamhtech.exer.Fragments.BeautyAndWellnessCatFragment$shopsList$2 */
//        class C07952 implements ErrorListener {
//            C07952() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String str = BeautyAndWellnessCatFragment.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("MainActivity Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(str, stringBuilder.toString());
//                Toast.makeText(BeautyAndWellnessCatFragment.this.getContext(), volleyError.getMessage(), 1).show();
//            }
//        }
//
//        shopsList() {
//        }
//
//        protected void onPostExecute(Void voidR) {
//            super.onPostExecute(voidR);
//        }
//
//        protected Void doInBackground(Void... voidArr) {
//            fillItemsRecycler(BeautyAndWellnessCatFragment.this.recyclerView);
//            return null;
//        }
//
//        private void fillItemsRecycler(final RecyclerView recyclerView) {
//            String str = BeautyAndWellnessCatFragment.this.TAG;
//            final List arrayList = new ArrayList();
//            AppController.getInstance().addToRequestQueue(new StringRequest(1, AppConfig.URL_SHOPS_FOR_CAT, new Listener<String>() {
//                public void onResponse(String str) {
//                    String str2 = BeautyAndWellnessCatFragment.this.TAG;
//                    StringBuilder stringBuilder = new StringBuilder();
//                    stringBuilder.append("Response: ");
//                    stringBuilder.append(str);
//                    Log.d(str2, stringBuilder.toString());
//                    arrayList.clear();
//                    try {
//                        JSONObject jSONObject = new JSONObject(str);
//                        if (jSONObject.getBoolean("error") == null) {
//                            str = jSONObject.getJSONArray("Shops");
//                            for (int i = 0; i < str.length(); i++) {
//                                JSONObject jSONObject2 = str.getJSONObject(i);
//                                arrayList.add(new ShopsModel(jSONObject2.getInt("id"), jSONObject2.getString("Name"), jSONObject2.getInt("catId"), jSONObject2.getString("Address"), jSONObject2.getInt("discount_percentage")));
//                            }
//                            str = new HotDealsAdapter(BeautyAndWellnessCatFragment.this.getContext(), arrayList);
//                            recyclerView.setHasFixedSize(true);
//                            LayoutManager linearLayoutManager = new LinearLayoutManager(BeautyAndWellnessCatFragment.this.getContext());
//                            linearLayoutManager.setOrientation(1);
//                            recyclerView.setLayoutManager(linearLayoutManager);
//                            recyclerView.setAdapter(str);
//                            return;
//                        }
//                        Log.i(BeautyAndWellnessCatFragment.this.TAG, jSONObject.getString("error_msg"));
//                    } catch (String str3) {
//                        str3.printStackTrace();
//                        Context context = BeautyAndWellnessCatFragment.this.getContext();
//                        StringBuilder stringBuilder2 = new StringBuilder();
//                        stringBuilder2.append("Json error: ");
//                        stringBuilder2.append(str3.getMessage());
//                        Toast.makeText(context, stringBuilder2.toString(), 1).show();
//                    }
//                }
//            }, new C07952()) {
//                protected Map<String, String> getParams() {
//                    Map<String, String> hashMap = new HashMap();
//                    hashMap.put("cat_id", String.valueOf(BeautyAndWellnessCatFragment.this.cat_id));
//                    return hashMap;
//                }
//            }, str);
//        }
//    }
//
//    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
//        this.view = layoutInflater.inflate(C0586R.layout.fragment_category, viewGroup, false);
//        this.recyclerView = (RecyclerView) this.view.findViewById(C0586R.id.recyclerview_CatFragment);
//        new shopsList().execute(new Void[0]);
//        return this.view;
//    }
//}
