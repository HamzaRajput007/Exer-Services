package com.example.irfan.exerproject.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.irfan.exerproject.R;

import java.util.Objects;

public class ProfileFragment extends Fragment {


    public ProfileFragment() {
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
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }


}

//    String TAG = "ProfileFragment";
//    TextView feedback;
//    TextView logout;
//    TextView profile_tv_email;
//    TextView profile_tv_name;
//    TextView profile_tv_name2;
//    TextView profile_tv_phone;
//    TextView rate;
//    TextView share;
//    View view;
//
//    /* renamed from: com.zamhtech.exer.Fragments.ProfileFragment$1 */
//    class C05671 implements OnClickListener {
//        C05671() {
//        }
//
//        public void onClick(View view) {
//            SessionManager.logoutUser(ProfileFragment.this.getContext(), 1);
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Fragments.ProfileFragment$2 */
//    class C05682 implements OnClickListener {
//        C05682() {
//        }
//
//        public void onClick(View view) {
//            ProfileFragment.this.startActivity(new Intent(ProfileFragment.this.getContext(), FeedbackActivity.class));
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Fragments.ProfileFragment$3 */
//    class C05693 implements OnClickListener {
//        C05693() {
//        }
//
//        public void onClick(View view) {
//            ProfileFragment.this.rateUs();
//        }
//    }
//
//    /* renamed from: com.zamhtech.exer.Fragments.ProfileFragment$4 */
//    class C05704 implements OnClickListener {
//        C05704() {
//        }
//
//        public void onClick(View view) {
//            ProfileFragment.this.share();
//        }
//    }
//
//    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
//        this.view = layoutInflater.inflate(C0586R.layout.fragment_profile, viewGroup, false);
//        this.profile_tv_name = (TextView) this.view.findViewById(C0586R.id.profile_tv_name);
//        this.profile_tv_email = (TextView) this.view.findViewById(C0586R.id.profile_tv_email);
//        this.feedback = (TextView) this.view.findViewById(C0586R.id.feedback_btn_pro);
//        this.rate = (TextView) this.view.findViewById(C0586R.id.rate_btn_pro);
//        this.share = (TextView) this.view.findViewById(C0586R.id.share_btn_pro);
//        this.logout = (TextView) this.view.findViewById(C0586R.id.logout_btn_pro);
//        this.logout.setOnClickListener(new C05671());
//        this.feedback.setOnClickListener(new C05682());
//        this.rate.setOnClickListener(new C05693());
//        this.share.setOnClickListener(new C05704());
//        layoutInflater = SessionManager.getLoginUser((Context) Objects.requireNonNull(getContext()));
//        this.profile_tv_name.setText(layoutInflater.getName());
//        this.profile_tv_email.setText(layoutInflater.getEmail());
//        return this.view;
//    }
//
//    public void share() {
//        Intent intent = new Intent("android.intent.action.SEND");
//        intent.setType("text/plain");
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(" http://play.google.com/store/apps/details?id=");
//        stringBuilder.append(getActivity().getPackageName());
//        String stringBuilder2 = stringBuilder.toString();
//        intent.putExtra("android.intent.extra.SUBJECT", "Best app to use as a Unplug alarm & Full Battery alarm! Check it out, its free");
//        intent.putExtra("android.intent.extra.TEXT", stringBuilder2);
//        startActivity(Intent.createChooser(intent, "Share via"));
//    }
//
//    public void rateUs() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("http://play.google.com/store/apps/details?id=");
//        stringBuilder.append(getActivity().getPackageName());
//        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString())));
//    }
//}
