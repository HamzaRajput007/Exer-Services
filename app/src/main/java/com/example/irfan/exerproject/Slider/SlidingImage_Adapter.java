package com.example.irfan.exerproject.Slider;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.irfan.exerproject.R;

import java.util.ArrayList;

class SlidingImage_Adapter extends PagerAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Context context;
    private ArrayList<ImageModel> imageModelArrayList;
    private LayoutInflater inflater;

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public SlidingImage_Adapter(Context context, ArrayList<ImageModel> arrayList) {
        this.context = context;
        this.imageModelArrayList = arrayList;
        this.inflater = LayoutInflater.from(context);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.imageModelArrayList.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.inflater.inflate(R.layout.slider, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.image)).setImageResource(((ImageModel) this.imageModelArrayList.get(i)).getImage_drawable());
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }
}
