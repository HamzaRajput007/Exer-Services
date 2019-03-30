//package com.zamhtech.exer.Helper;
//
//import android.annotation.SuppressLint;
//import android.support.design.internal.BottomNavigationItemView;
//import android.support.design.internal.BottomNavigationMenuView;
//import android.support.design.widget.BottomNavigationView;
//import android.util.Log;
//import java.lang.reflect.Field;
//
//public class BottomNavigationViewHelper {
//    @SuppressLint({"RestrictedApi"})
//    public static void disableShiftMode(BottomNavigationView bottomNavigationView) {
//        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);
//        try {
//            Field declaredField = bottomNavigationMenuView.getClass().getDeclaredField("mShiftingMode");
//            declaredField.setAccessible(true);
//            declaredField.setBoolean(bottomNavigationMenuView, false);
//            declaredField.setAccessible(false);
//            for (int i = 0; i < bottomNavigationMenuView.getChildCount(); i++) {
//                BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) bottomNavigationMenuView.getChildAt(i);
//                bottomNavigationItemView.setShiftingMode(false);
//                bottomNavigationItemView.setChecked(bottomNavigationItemView.getItemData().isChecked());
//            }
//        } catch (BottomNavigationView bottomNavigationView2) {
//            Log.e("BNVHelper", "Unable to get shift mode field", bottomNavigationView2);
//        } catch (BottomNavigationView bottomNavigationView22) {
//            Log.e("BNVHelper", "Unable to change value of shift mode", bottomNavigationView22);
//        }
//    }
//}
