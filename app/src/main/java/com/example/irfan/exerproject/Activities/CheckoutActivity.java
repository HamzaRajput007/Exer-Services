//package com.example.irfan.exerproject.Activities;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.text.Html;
//import android.view.MenuItem;
//import android.widget.TextView;
//
//public class CheckoutActivity extends AppCompatActivity {
//    protected void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//        setContentView(R.layout.activity_checkout);
//        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        bundle = getIntent().getExtras().getString("shop");
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("<font color=#FFA7A7A7>Show this screen to </font> <font color=#f28824>");
//        stringBuilder.append(bundle);
//        stringBuilder.append("</font> <font color=#FFA7A7A7>to get Discount!</font>");
//        ((TextView) findViewById(R.id.showScreen_tv)).setText(Html.fromHtml(stringBuilder.toString()));
//    }
//
//    public boolean onOptionsItemSelected(MenuItem menuItem) {
//        if (menuItem.getItemId() == 16908332) {
//            onBackPressed();
//        }
//        return super.onOptionsItemSelected(menuItem);
//    }
//}
