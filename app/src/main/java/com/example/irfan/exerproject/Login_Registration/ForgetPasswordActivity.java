package com.example.irfan.exerproject.Login_Registration;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ForgetPasswordActivity extends AppCompatActivity {
    EditText emailedittext;
    Button resetButn;
    TextView resettext;

//    /* renamed from: com.zamhtech.exer.Login_Registration.ForgetPasswordActivity$1 */
//    class C05711 implements TextWatcher {
//        public void afterTextChanged(Editable editable) {
//        }
//
//        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
//        }
//
//        C05711() {
//        }
//
//        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
//            charSequence = ForgetPasswordActivity.this.resettext;
//            i = new StringBuilder();
//            i.append("Type the registered Email address in order to reset the password, We will send your password on ");
//            i.append(ForgetPasswordActivity.this.emailedittext.getText().toString());
//            charSequence.setText(i.toString());
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Login_Registration.ForgetPasswordActivity$2 */
//    class C05722 implements OnClickListener {
//        C05722() {
//        }
//
//        public void onClick(View view) {
//            new resetTask(ForgetPasswordActivity.this.emailedittext.getText().toString()).execute(new Void[0]);
//        }
//    }
//
//    class resetTask extends AsyncTask<Void, Void, Boolean> {
//        private String TAG = "resetTask";
//        private final String email;
//        ProgressDialog progressDialog;
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.ForgetPasswordActivity$resetTask$1 */
//        class C08171 implements Listener<String> {
//            C08171() {
//            }
//
//            public void onResponse(String str) {
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("DataValue: ");
//                stringBuilder.append(resetTask.this.email);
//                Log.d("DataValueAndroid", stringBuilder.toString());
//                String access$100 = resetTask.this.TAG;
//                stringBuilder = new StringBuilder();
//                stringBuilder.append("get response");
//                stringBuilder.append(str);
//                Log.i(access$100, stringBuilder.toString());
//                try {
//                    JSONObject jSONObject = new JSONObject(str);
//                    if (jSONObject.getBoolean("error") == null) {
//                        Toast.makeText(ForgetPasswordActivity.this, "Email Sent on your Email address", 0).show();
//                        str = ForgetPasswordActivity.this.resettext;
//                        StringBuilder stringBuilder2 = new StringBuilder();
//                        stringBuilder2.append("Password has been sent on ");
//                        stringBuilder2.append(resetTask.this.email);
//                        stringBuilder2.append(" check and Login again!");
//                        str.setText(stringBuilder2.toString());
//                    } else {
//                        Toast.makeText(ForgetPasswordActivity.this, jSONObject.getString("error_msg"), 0).show();
//                    }
//                    resetTask.this.progressDialog.dismiss();
//                } catch (String str2) {
//                    str2.printStackTrace();
//                    resetTask.this.progressDialog.dismiss();
//                }
//            }
//        }
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.ForgetPasswordActivity$resetTask$2 */
//        class C08182 implements ErrorListener {
//            C08182() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String access$100 = resetTask.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("Registration Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(access$100, stringBuilder.toString());
//                Toast.makeText(ForgetPasswordActivity.this.getApplicationContext(), "Network Error", 1).show();
//                resetTask.this.progressDialog.dismiss();
//            }
//        }
//
//        public resetTask(String str) {
//            this.email = str;
//        }
//
//        protected void onPreExecute() {
//            super.onPreExecute();
//            this.progressDialog = new ProgressDialog(ForgetPasswordActivity.this);
//            this.progressDialog.setTitle("Please Wait!");
//            this.progressDialog.setMessage("Resetting Password");
//            this.progressDialog.show();
//        }
//
//        protected Boolean doInBackground(Void... voidArr) {
//            Request c08763 = new StringRequest(1, AppConfig.URL_RESET_PASSWORD, new C08171(), new C08182()) {
//                protected Map<String, String> getParams() {
//                    Map<String, String> hashMap = new HashMap();
//                    hashMap.put("email", resetTask.this.email);
//                    return hashMap;
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08763, "req_showListItems");
//            return Boolean.valueOf(1);
//        }
//    }
//
//    protected void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//        setContentView((int) C0586R.layout.activity_forget_password);
//        this.emailedittext = (EditText) findViewById(C0586R.id.forget_email_forget);
//        this.resettext = (TextView) findViewById(C0586R.id.reset_text);
//        this.resetButn = (Button) findViewById(C0586R.id.reset_pass_button_forget);
//        this.emailedittext.setText(getIntent().getStringExtra("email"));
//        this.emailedittext.addTextChangedListener(new C05711());
//        this.resetButn.setOnClickListener(new C05722());
//    }
}
