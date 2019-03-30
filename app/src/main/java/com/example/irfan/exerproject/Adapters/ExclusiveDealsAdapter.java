package com.example.irfan.exerproject.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.irfan.exerproject.Fragments.ItemOneFragment;
import com.example.irfan.exerproject.Models.DealsModel;
import com.example.irfan.exerproject.R;

import java.util.ArrayList;
import java.util.List;

public class ExclusiveDealsAdapter extends RecyclerView.Adapter<ExclusiveDealsAdapter.MyViewHolder> {

        Context context;
        List<DealsModel> contactList;

public ExclusiveDealsAdapter(Context context, List<DealsModel> contactList) {
        this.context = context;
        this.contactList = contactList;
        }

@Override
public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.exclusive_deals_recycler_row, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
        }

@Override
public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.deals_title.setText(contactList.get(position).getTitle());
        holder.deals_desc.setText(contactList.get(position).getDescription());
        holder.deals_descounted_price.setText(contactList.get(position).getDicount());
        holder.deals_originalPrice.setText(contactList.get(position).getOriginal_price());
        }

@Override
public int getItemCount() {
        return contactList.size();
        }

public static class MyViewHolder extends RecyclerView.ViewHolder {

    TextView deals_title;
    TextView deals_desc;
    TextView deals_descounted_price;
    TextView deals_originalPrice;
    ImageView share_deals;
    ImageView fav_deals;


    public MyViewHolder(View itemView) {
        super(itemView);

        deals_title = (TextView) itemView.findViewById(R.id.deals_title);
        deals_desc = (TextView) itemView.findViewById(R.id.deals_desc);
        deals_descounted_price = (TextView) itemView.findViewById(R.id.deals_descounted_price);
        deals_originalPrice = (TextView) itemView.findViewById(R.id.deals_originalPrice);
    }
}
}
