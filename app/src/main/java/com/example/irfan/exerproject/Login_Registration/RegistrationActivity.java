package com.example.irfan.exerproject.Login_Registration;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.irfan.exerproject.Login_Registration.LoginActivity;
import com.example.irfan.exerproject.R;


public class RegistrationActivity extends AppCompatActivity {
    //    CallbackManager callbackManager;
//    LoginButton loginButton;
    Button loginin;
    ProgressDialog progressDialog;
    Button signup;
    TextView skiplogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        Button login_siginin_btn = findViewById(R.id.login_siginin_btn);
        login_siginin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(it);
            }
        });


//    /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$1 */
//    class C05771 implements OnClickListener {
//        C05771() {
//        }
//
//        public void onClick(View view) {
//            RegistrationActivity.this.startActivity(new Intent(RegistrationActivity.this, SignupActivity.class));
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$2 */
//    class C05782 implements OnClickListener {
//        C05782() {
//        }
//
//        public void onClick(View view) {
//            RegistrationActivity.this.startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$3 */
//    class C05793 implements OnClickListener {
//        C05793() {
//        }
//
//        public void onClick(View view) {
//            RegistrationActivity.this.startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
//            RegistrationActivity.this.finish();
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$4 */
//    class C05804 implements OnClickListener {
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$4$1 */
//        class C08261 implements FacebookCallback<LoginResult> {
//
//            /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$4$1$1 */
//            class C08251 implements GraphJSONObjectCallback {
//                C08251() {
//                }
//
//                public void onCompleted(JSONObject jSONObject, GraphResponse graphResponse) {
//                    StringBuilder stringBuilder = new StringBuilder();
//                    stringBuilder.append(graphResponse);
//                    stringBuilder.append("");
//                    Log.e("response: ", stringBuilder.toString());
//                    try {
//                        graphResponse = jSONObject.getString("id").toString();
//                        String str = jSONObject.getString("email").toString();
//                        jSONObject = jSONObject.getString("name").toString();
//                        StringBuilder stringBuilder2 = new StringBuilder();
//                        stringBuilder2.append(graphResponse);
//                        stringBuilder2.append(" ");
//                        stringBuilder2.append(jSONObject);
//                        stringBuilder2.append("  ");
//                        stringBuilder2.append(str);
//                        Log.i("FacebookLoginTest", stringBuilder2.toString());
//                        new signUpTask(jSONObject, str, graphResponse).execute(new Void[null]);
//                    } catch (JSONObject jSONObject2) {
//                        jSONObject2.printStackTrace();
//                    }
//                }
//            }
//
//            public void onCancel() {
//            }
//
//            public void onError(FacebookException facebookException) {
//            }
//
//            C08261() {
//            }
//
//            public void onSuccess(LoginResult loginResult) {
//                Log.i("FacebookLoginTest", loginResult.getAccessToken().getUserId());
//                loginResult = GraphRequest.newMeRequest(loginResult.getAccessToken(), new C08251());
//                Bundle bundle = new Bundle();
//                bundle.putString(GraphRequest.FIELDS_PARAM, "id,name,email,gender, birthday");
//                loginResult.setParameters(bundle);
//                loginResult.executeAsync();
//            }
//        }
//
//        C05804() {
//        }
//
//        public void onClick(View view) {
//            RegistrationActivity.this.progressDialog.show();
//            RegistrationActivity.this.loginButton.setPressed(true);
//            RegistrationActivity.this.loginButton.invalidate();
//            RegistrationActivity.this.loginButton.registerCallback(RegistrationActivity.this.callbackManager, new C08261());
//            RegistrationActivity.this.loginButton.setPressed(false);
//            RegistrationActivity.this.loginButton.invalidate();
//        }
//    }
//
//    class loginTask extends AsyncTask<Void, Void, Boolean> {
//        private String TAG = "MainActivityAsync";
//        private final String email;
//        private final String password;
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$loginTask$1 */
//        class C08271 implements Listener<String> {
//            C08271() {
//            }
//
//            public void onResponse(String str) {
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("DataValue: ");
//                stringBuilder.append(loginTask.this.email);
//                stringBuilder.append(" ");
//                stringBuilder.append(loginTask.this.password);
//                Log.d("DataValueAndroid", stringBuilder.toString());
//                String access$600 = loginTask.this.TAG;
//                stringBuilder = new StringBuilder();
//                stringBuilder.append("get response");
//                stringBuilder.append(str);
//                Log.i(access$600, stringBuilder.toString());
//                try {
//                    JSONObject jSONObject = new JSONObject(str);
//                    str = jSONObject.getString("response");
//                    if (str.equalsIgnoreCase("ok")) {
//                        RegistrationActivity.this.progressDialog.dismiss();
//                        str = jSONObject.getJSONObject("user");
//                        access$600 = str.getString("name");
//                        String string = str.getString("email");
//                        String string2 = str.getString("address");
//                        String string3 = str.getString(PlaceFields.PHONE);
//                        int i = str.getInt("id");
//                        SessionManager.setLogin(RegistrationActivity.this, true);
//                        SessionManager.setLoginUser(RegistrationActivity.this, new UserModel(i, "", access$600, string, "", string2, string3));
//                        str = RegistrationActivity.this;
//                        stringBuilder = new StringBuilder();
//                        stringBuilder.append("Logged In as ");
//                        stringBuilder.append(access$600);
//                        Toast.makeText(str, stringBuilder.toString(), 0).show();
//                        RegistrationActivity.this.startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
//                        RegistrationActivity.this.finish();
//                    } else if (str.equals("failed") != null) {
//                        RegistrationActivity.this.progressDialog.dismiss();
//                        Toast.makeText(RegistrationActivity.this, "Something went wrong", 0).show();
//                    }
//                } catch (String str2) {
//                    str2.printStackTrace();
//                    RegistrationActivity.this.progressDialog.dismiss();
//                }
//            }
//        }
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$loginTask$2 */
//        class C08282 implements ErrorListener {
//            C08282() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String access$600 = loginTask.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("Registration Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(access$600, stringBuilder.toString());
//                Toast.makeText(RegistrationActivity.this.getApplicationContext(), "Network Error", 1).show();
//                RegistrationActivity.this.progressDialog.dismiss();
//            }
//        }
//
//        public loginTask(String str, String str2) {
//            this.email = str;
//            this.password = str2;
//        }
//
//        protected Boolean doInBackground(Void... voidArr) {
//            Request c08793 = new StringRequest(1, AppConfig.URL_LOGIN, new C08271(), new C08282()) {
//                protected Map<String, String> getParams() {
//                    Map<String, String> hashMap = new HashMap();
//                    hashMap.put("user_password", loginTask.this.password);
//                    hashMap.put("user_email", loginTask.this.email);
//                    return hashMap;
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08793, "req_showListItems");
//            return Boolean.valueOf(1);
//        }
//    }
//
//    public class signUpTask extends AsyncTask<Void, Void, Boolean> {
//        private String TAG = "MainActivityAsync";
//        private final String email;
//        private final String name;
//        private final String pass;
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$signUpTask$1 */
//        class C08291 implements Listener<String> {
//            C08291() {
//            }
//
//            public void onResponse(String str) {
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("DataValue: ");
//                stringBuilder.append(signUpTask.this.name);
//                stringBuilder.append(" ");
//                stringBuilder.append(signUpTask.this.pass);
//                stringBuilder.append(" ");
//                stringBuilder.append(signUpTask.this.email);
//                Log.d("DataValueAndro", stringBuilder.toString());
//                try {
//                    str = new JSONObject(str).getString("response");
//                    if (str.equalsIgnoreCase("ok")) {
//                        RegistrationActivity.this.progressDialog.dismiss();
//                        new loginTask(signUpTask.this.email, signUpTask.this.pass).execute(new Void[0]);
//                    } else if (str.equals("exist")) {
//                        RegistrationActivity.this.progressDialog.dismiss();
//                        new loginTask(signUpTask.this.email, signUpTask.this.pass).execute(new Void[0]);
//                    } else if (str.equals("error")) {
//                        RegistrationActivity.this.progressDialog.dismiss();
//                        Toast.makeText(RegistrationActivity.this, "Something went wrong", 0).show();
//                    } else if (str.equals("NoDataFound") != null) {
//                        RegistrationActivity.this.progressDialog.dismiss();
//                    }
//                } catch (String str2) {
//                    str2.printStackTrace();
//                }
//            }
//        }
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.RegistrationActivity$signUpTask$2 */
//        class C08302 implements ErrorListener {
//            C08302() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String access$300 = signUpTask.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("Registration Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(access$300, stringBuilder.toString());
//                Toast.makeText(RegistrationActivity.this.getApplicationContext(), volleyError.getMessage(), 1).show();
//            }
//        }
//
//        public signUpTask(String str, String str2, String str3) {
//            this.name = str;
//            this.email = str2;
//            this.pass = str3;
//        }
//
//        protected Boolean doInBackground(Void... voidArr) {
//            Request c08803 = new StringRequest(1, AppConfig.URL_REGISTER, new C08291(), new C08302()) {
//                protected Map<String, String> getParams() {
//                    Map<String, String> hashMap = new HashMap();
//                    hashMap.put("user_name", signUpTask.this.name);
//                    hashMap.put("user_password", signUpTask.this.pass);
//                    hashMap.put("user_email", signUpTask.this.email);
//                    return hashMap;
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08803, "req_showListItems");
//            return Boolean.valueOf(1);
//        }
//    }

//    protected void onCreate(Bundle bundle) {
//        super.onCreate(bundle);

        // FacebookSdk.sdkInitialize(this);
//        AppEventsLogger.activateApp((Context) this);
//        try {
//            for (Signature signature : getPackageManager().getPackageInfo(getPackageName(), 64).signatures) {
//                MessageDigest instance = MessageDigest.getInstance("SHA");
//                instance.update(signature.toByteArray());
//                Log.d("KeyHash:", Base64.encodeToString(instance.digest(), 0));
//            }
//        } catch (Bundle bundle2) {
//            bundle2.printStackTrace();
//        } catch (Bundle bundle22) {
//            bundle22.printStackTrace();
//        }
//        setContentView((int) C0586R.layout.activity_registration);
//        this.signup = (Button) findViewById(C0586R.id.signup_siginin_btn);
//        this.loginin = (Button) findViewById(C0586R.id.login_siginin_btn);
//        this.skiplogin = (TextView) findViewById(C0586R.id.skip_login);
//        if (SessionManager.isLoggedIn(this) != null) {
//            startActivity(new Intent(this, MainActivity.class));
//            finish();
//        }
//        this.signup.setOnClickListener(new C05771());
//        this.loginin.setOnClickListener(new C05782());
//        this.skiplogin.setOnClickListener(new C05793());
//        this.progressDialog = new ProgressDialog(this);
//        this.progressDialog.setTitle("Please Wait");
//        this.progressDialog.setMessage("Signing in");
//        this.callbackManager = Factory.create();
//        this.loginButton = (LoginButton) findViewById(C0586R.id.login_button);
//        this.loginButton.setReadPermissions("public_profile", "email");
//        this.loginButton.setOnClickListener(new C05804());
//        LoginManager.getInstance().logOut();
//    }
//
//    protected void onActivityResult(int i, int i2, Intent intent) {
//        this.callbackManager.onActivityResult(i, i2, intent);
//        super.onActivityResult(i, i2, intent);
//    }
    }
}