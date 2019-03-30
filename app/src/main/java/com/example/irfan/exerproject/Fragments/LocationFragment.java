package com.example.irfan.exerproject.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.irfan.exerproject.R;

import java.util.ArrayList;
import java.util.List;


public class LocationFragment extends Fragment {
    public LocationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourites, container, false);
    }


}



//
//public class LocationFragment extends Fragment implements OnMapReadyCallback {
//    private GoogleMap mMap;
//    String[] permissions = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_NETWORK_STATE"};
//
//    private boolean checkPermissions() {
//        List arrayList = new ArrayList();
//        for (String str : this.permissions) {
//            if (ContextCompat.checkSelfPermission(getActivity(), str) != 0) {
//                arrayList.add(str);
//            }
//        }
//        if (arrayList.isEmpty()) {
//            return true;
//        }
//        ActivityCompat.requestPermissions(getActivity(), (String[]) arrayList.toArray(new String[arrayList.size()]), 100);
//        return false;
//    }
//
//    public void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//    }
//
//    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
//        return layoutInflater.inflate(C0586R.layout.fragment_location, viewGroup, false);
//    }
//
//    public void onActivityCreated(@Nullable Bundle bundle) {
//        super.onActivityCreated(bundle);
//        if (getActivity() != null) {
//            SupportMapFragment supportMapFragment = (SupportMapFragment) getActivity().getSupportFragmentManager().findFragmentById(C0586R.id.map);
//            if (supportMapFragment != null) {
//                supportMapFragment.getMapAsync(this);
//            }
//        }
//    }
//
//    public void onMapReady(GoogleMap googleMap) {
//        this.mMap = googleMap;
//        if (!(ContextCompat.checkSelfPermission(getActivity(), "android.permission.ACCESS_FINE_LOCATION") == null || ContextCompat.checkSelfPermission(getActivity(), "android.permission.ACCESS_COARSE_LOCATION") == null)) {
//            checkPermissions();
//        }
//        this.mMap.setMyLocationEnabled(true);
//        googleMap = new LatLng(-34.0d, 151.0d);
//        this.mMap.addMarker(new MarkerOptions().position(googleMap).title("Marker in Sydney"));
//        this.mMap.moveCamera(CameraUpdateFactory.newLatLng(googleMap));
//    }
//}
