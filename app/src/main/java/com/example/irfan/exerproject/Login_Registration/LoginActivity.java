package com.example.irfan.exerproject.Login_Registration;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.irfan.exerproject.Activities.MainActivity;
import com.example.irfan.exerproject.Network.AppConfig;
import com.example.irfan.exerproject.R;
import com.example.irfan.exerproject.Retrofit.ApiClient;
import com.example.irfan.exerproject.Retrofit.ApiInterface;
import com.example.irfan.exerproject.Retrofit.Models.UserModel;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.ErrorListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {
    Button btn_login;
    //  CallbackManager callbackManager;
    TextView forgetPassword;
    EditText le_email;
    EditText le_password;
    //LoginButton loginButton;
    ProgressDialog progressDialog;
    TextView reg;

    ApiInterface apiInterface;
    UserModel mUserModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        le_email = findViewById(R.id.le_email);
        le_password = findViewById(R.id.le_password);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);



//
//
        Button btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<UserModel> call = apiInterface.mUserResponse(le_email.getText().toString(), le_password.getText().toString());
                call.enqueue(new Callback<UserModel>() {
                    @Override
                    public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                        mUserModel = response.body();

                        if (mUserModel.getResponse().equals("ok")){
                            Intent it = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(it);
                            finish();
                        }else {
                            Toast.makeText(LoginActivity.this, "Login Details are incorrect", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<UserModel> call, Throwable t) {
                        Toast.makeText(LoginActivity.this, "Some Problem Detected. Please try again.", Toast.LENGTH_SHORT).show();
                        t.printStackTrace();
                    }
                });



            }
        });


    /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$1 */
//    class C05731 implements OnClickListener {
//        C05731() {
//        }
//
//        public void onClick(View view) {
//            LoginActivity.this.login();
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$2 */
//    class C05742 implements OnClickListener {
//        C05742() {
//        }
//
//        public void onClick(View view) {
//            view = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
//            view.putExtra("email", LoginActivity.this.le_email.getText().toString());
//            LoginActivity.this.startActivity(view);
//            LoginActivity.this.finish();
//        }
//
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$3 */
//    class C05753 implements OnClickListener {
//        C05753() {
//        }
//
//        public void onClick(View view) {
//            view = new Intent(LoginActivity.this, SignupActivity.class);
//            view.putExtra("email", LoginActivity.this.le_email.getText().toString());
//            LoginActivity.this.startActivity(view);
//            LoginActivity.this.finish();
//        }
//    }
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$4 */
//    class C05764 implements OnClickListener {
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$4$1 */
//        class C08201 implements FacebookCallback<LoginResult> {
//
//            /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$4$1$1 */
//            class C08191 implements GraphJSONObjectCallback {
//                C08191() {
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
//            C08201() {
//            }
//
//            public void onSuccess(LoginResult loginResult) {
//                Log.i("FacebookLoginTest", loginResult.getAccessToken().getUserId());
//                loginResult = GraphRequest.newMeRequest(loginResult.getAccessToken(), new C08191());
//                Bundle bundle = new Bundle();
//                bundle.putString(GraphRequest.FIELDS_PARAM, "id,name,email,gender, birthday");
//                loginResult.setParameters(bundle);
//                loginResult.executeAsync();
//            }
//        }
//
//        C05764() {
//        }
//
//        public void onClick(View view) {
//            LoginActivity.this.progressDialog.show();
//            LoginActivity.this.loginButton.setPressed(true);
//            LoginActivity.this.loginButton.invalidate();
//            LoginActivity.this.loginButton.registerCallback(LoginActivity.this.callbackManager, new C08201());
//            LoginActivity.this.loginButton.setPressed(false);
//            LoginActivity.this.loginButton.invalidate();
//        }
//    }
//
//    class loginTask extends AsyncTask<Void, Void, Boolean> {
//        private String TAG = "MainActivityAsync";
//        private final String email;
//        private final String password;
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$loginTask$1 */
//        class C08211 implements Listener<String> {
//            C08211() {
//            }
//
//            public void onResponse(String str) {
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("DataValue: ");
//                stringBuilder.append(loginTask.this.email);
//                stringBuilder.append(" ");
//                stringBuilder.append(loginTask.this.password);
//                Log.d("DataValueAndroid", stringBuilder.toString());
//                String access$700 = loginTask.this.TAG;
//                stringBuilder = new StringBuilder();
//                stringBuilder.append("get response");
//                stringBuilder.append(str);
//                Log.i(access$700, stringBuilder.toString());
//                try {
//                    JSONObject jSONObject = new JSONObject(str);
//                    str = jSONObject.getString("response");
//                    if (str.equalsIgnoreCase("ok")) {
//                        LoginActivity.this.progressDialog.dismiss();
//                        str = jSONObject.getJSONObject("user");
//                        access$700 = str.getString("name");
//                        String string = str.getString("email");
//                        String string2 = str.getString("address");
//                        String string3 = str.getString(PlaceFields.PHONE);
//                        int i = str.getInt("id");
//                        SessionManager.setLogin(LoginActivity.this, true);
//                        SessionManager.setLoginUser(LoginActivity.this, new UserModel(i, "", access$700, string, "", string2, string3));
//                        str = LoginActivity.this;
//                        stringBuilder = new StringBuilder();
//                        stringBuilder.append("Logged In as ");
//                        stringBuilder.append(access$700);
//                        Toast.makeText(str, stringBuilder.toString(), 0).show();
//                        LoginActivity.this.startActivity(new Intent(LoginActivity.this, MainActivity.class));
//                        LoginActivity.this.finish();
//                    } else if (str.equals("failed") != null) {
//                        LoginActivity.this.progressDialog.dismiss();
//                        Toast.makeText(LoginActivity.this, "Write Correct Password or try to Login with Facebook", 0).show();
//                    }
//                } catch (String str2) {
//                    str2.printStackTrace();
//                    LoginActivity.this.progressDialog.dismiss();
//                }
//            }
//        }
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$loginTask$2 */
//        class C08222 implements ErrorListener {
//            C08222() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String access$700 = loginTask.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("Registration Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(access$700, stringBuilder.toString());
//                Toast.makeText(LoginActivity.this.getApplicationContext(), "Network Error", 1).show();
//                LoginActivity.this.progressDialog.dismiss();
//            }
//        }
//
//        public loginTask(String str, String str2) {
//            this.email = str;
//            this.password = str2;
//        }
//
//        protected Boolean doInBackground(Void... voidArr) {
//
//            Request c08773 = new StringRequest(1, AppConfig.URL_LOGIN, new C08211(), new C08222()) {
//                protected Map<String, String> getParams() {
//                    Map<String, String> hashMap = new HashMap();
//                    hashMap.put("user_password", loginTask.this.password);
//                    hashMap.put("user_email", loginTask.this.email);
//                    return hashMap;
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08773, "req_showListItems");
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
//        /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$signUpTask$1 */
//        class C08231 implements Listener<String> {
//            C08231() {
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
//                        LoginActivity.this.progressDialog.dismiss();
//                        new loginTask(signUpTask.this.email, signUpTask.this.pass).execute(new Void[0]);
//                    } else if (str.equals("exist")) {
//                        LoginActivity.this.progressDialog.dismiss();
//                        new loginTask(signUpTask.this.email, signUpTask.this.pass).execute(new Void[0]);
//                    } else if (str.equals("error")) {
//                        LoginActivity.this.progressDialog.dismiss();
//                        Toast.makeText(LoginActivity.this, "Something went wrong", 0).show();
//                    } else if (str.equals("NoDataFound") != null) {
//                        LoginActivity.this.progressDialog.dismiss();
//                    }
//                } catch (String str2) {
//                    str2.printStackTrace();
//                }
//            }
//        }
//
//        /* renamed from: com.zamhtech.exer.Login_Registration.LoginActivity$signUpTask$2 */
//        class C08242 implements ErrorListener {
//            C08242() {
//            }
//
//            public void onErrorResponse(VolleyError volleyError) {
//                String access$400 = signUpTask.this.TAG;
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append("Registration Error: ");
//                stringBuilder.append(volleyError.getMessage());
//                Log.e(access$400, stringBuilder.toString());
//                Toast.makeText(LoginActivity.this.getApplicationContext(), volleyError.getMessage(), 1).show();
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
//            Request c08783 = new StringRequest(1, AppConfig.URL_REGISTER, new C08231(), new C08242()) {
//                protected Map<String, String> getParams() {
//                    Map<String, String> hashMap = new HashMap();
//                    hashMap.put("user_name", signUpTask.this.name);
//                    hashMap.put("user_password", signUpTask.this.pass);
//                    hashMap.put("user_email", signUpTask.this.email);
//                    return hashMap;
//                }
//            };
//            AppController.getInstance().addToRequestQueue(c08783, "req_showListItems");
//            return Boolean.valueOf(1);
//        }
//    }
//
//    protected void onCreate(Bundle bundle) {
//        super.onCreate(bundle);
//        FacebookSdk.sdkInitialize(this);
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
//        setContentView((int) C0586R.layout.activity_login);
//        if (SessionManager.isLoggedIn(this) != null) {
//            startActivity(new Intent(this, MainActivity.class));
//            finish();
//        }
//        this.progressDialog = new ProgressDialog(this);
//        this.reg = (TextView) findViewById(C0586R.id.txt_reg);
//        this.forgetPassword = (TextView) findViewById(C0586R.id.forgetpassword_btn);
//        this.le_email = (EditText) findViewById(C0586R.id.le_email);
//        this.le_password = (EditText) findViewById(C0586R.id.le_password);
//        this.btn_login = (Button) findViewById(C0586R.id.btn_login);
//        this.btn_login.setOnClickListener(new C05731());
//        this.forgetPassword.setOnClickListener(new C05742());
//        this.reg.setOnClickListener(new C05753());
//        this.le_email.setText(getIntent().getStringExtra("email"));
//        this.progressDialog = new ProgressDialog(this);
//        this.progressDialog.setTitle("Please Wait");
//        this.progressDialog.setMessage("Signing in");
//        this.callbackManager = Factory.create();
//        this.loginButton = (LoginButton) findViewById(C0586R.id.login_button);
//        this.loginButton.setReadPermissions("public_profile", "email");
//        this.loginButton.setOnClickListener(new C05764());
//        LoginManager.getInstance().logOut();
//    }
//
//    private void login() {
//        Object obj = this.le_email.getText().toString();
//        Object obj2 = this.le_password.getText().toString();
//        if (TextUtils.isEmpty(obj)) {
//            this.le_email.setError("Invalid Email");
//        } else if (TextUtils.isEmpty(obj2)) {
//            this.le_email.setError("Invalid Password");
//        } else {
//            this.progressDialog.setTitle("Account Login");
//            this.progressDialog.setMessage("Please Wait! While we are logging into your Account");
//            this.progressDialog.show();
//            this.progressDialog.setCancelable(false);
//            new loginTask(obj, obj2).execute(new Void[0]);
//        }
//    }
//
//    protected void onActivityResult(int i, int i2, Intent intent) {
//        this.callbackManager.onActivityResult(i, i2, intent);
//        super.onActivityResult(i, i2, intent);
//    }
   }
}

