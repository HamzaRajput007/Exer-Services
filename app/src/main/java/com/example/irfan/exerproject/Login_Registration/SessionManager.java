//package com.zamhtech.exer.Login_Registration;
//
//import android.app.AlertDialog.Builder;
//import android.content.Context;
//import android.content.DialogInterface;
//import android.content.DialogInterface.OnClickListener;
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.content.SharedPreferences.Editor;
//import android.util.Log;
//import com.facebook.places.model.PlaceFields;
//
//public class SessionManager {
//    private static final String KEY_IS_LOGGED_IN = "isLoggedIn";
//    private static final String PREF_NAME = "ExerLogin";
//    static int PRIVATE_MODE = 0;
//    private static String TAG = "SessionManager";
//    static Editor editor;
//    static SharedPreferences pref;
//
//    /* renamed from: com.zamhtech.exer.Login_Registration.SessionManager$2 */
//    static class C05822 implements OnClickListener {
//        public void onClick(DialogInterface dialogInterface, int i) {
//        }
//
//        C05822() {
//        }
//    }
//
//    public static void setLogin(Context context, boolean z) {
//        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
//        editor = pref.edit();
//        editor.putBoolean(KEY_IS_LOGGED_IN, z);
//        editor.commit();
//        Log.d(TAG, "User login session modified!");
//    }
//
//    public static boolean isLoggedIn(Context context) {
//        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
//        return pref.getBoolean(KEY_IS_LOGGED_IN, false);
//    }
//
//    public static void setLoginUser(Context context, UserModel userModel) {
//        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
//        editor = pref.edit();
//        editor.putInt("id", userModel.getId());
//        editor.putString("name", userModel.getName());
//        editor.putString(PlaceFields.PHONE, userModel.getPhone());
//        editor.putString("uid", userModel.getUnique_id());
//        editor.putString("email", userModel.getEmail());
//        editor.putString("city", userModel.getCity());
//        editor.putString("address", userModel.getAddress());
//        editor.commit();
//    }
//
//    public static UserModel getLoginUser(Context context) {
//        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
//        int i = pref.getInt("id", -1);
//        String string = pref.getString(PlaceFields.PHONE, "Null");
//        return new UserModel(i, pref.getString("uid", "Null"), pref.getString("name", "Null"), pref.getString("email", "Null"), pref.getString("city", "Null"), pref.getString("address", "Null"), string);
//    }
//
//    public static void logoutUser(final Context context, int i) {
//        if (i == 1) {
//            i = new Builder(context);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("Do you want to logout as ");
//            stringBuilder.append(getLoginUser(context).getName());
//            stringBuilder.append(" ?");
//            i.setMessage(stringBuilder.toString());
//            i.setPositiveButton("Yes Logout", new OnClickListener() {
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    SessionManager.setLogin(context, 0);
//                    SessionManager.setLoginUser(context, new UserModel(-1, "null", "null", "null", "null", "null", ""));
//                    context.startActivity(new Intent(context, RegistrationActivity.class));
//                }
//            });
//            i.setNegativeButton("Cancel", new C05822());
//            i.show();
//            return;
//        }
//        setLogin(context, 0);
//        context.startActivity(new Intent(context, LoginActivity.class));
//    }
//}
