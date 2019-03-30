//package com.example.irfan.exerproject.Activities;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import com.google.android.gms.maps.CameraUpdateFactory;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.OnMapReadyCallback;
//import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.MarkerOptions;
//
//public class ShopDetails extends AppCompatActivity {
//    private GoogleMap mMap;
//
//    /* renamed from: com.zamhtech.exer.Activities.ShopDetails$1 */
//    class C07931 implements OnMapReadyCallback {
//        C07931() {
//        }
//
//        public void onMapReady(GoogleMap googleMap) {
//            ShopDetails.this.mMap = googleMap;
//            googleMap = new LatLng(-34.0d, 151.0d);
//            ShopDetails.this.mMap.addMarker(new MarkerOptions().position(googleMap).title("Marker in Sydney"));
//            ShopDetails.this.mMap.moveCamera(CameraUpdateFactory.newLatLng(googleMap));
//        }
//    }
//
//    protected void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//        setContentView((int) C0586R.layout.activity_shop_details);
//        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(C0586R.id.map)).getMapAsync(new C07931());
//    }
//}
