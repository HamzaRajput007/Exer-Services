//package com.example.irfan.exerproject.Adapters;
//
//import android.content.Context;
//import android.content.Intent;
//import android.support.v7.widget.RecyclerView.Adapter;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import com.zamhtech.exer.Activities.ShopDetails;
//import com.zamhtech.exer.Models.ShopsModel;
//import java.util.ArrayList;
//import java.util.List;
//
//public class PremiumDealsAdapter extends Adapter<ViewHolder> {
//    Context ctx;
//    List<ShopsModel> resultDataList = new ArrayList();
//
//    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
//        View cardView1;
//        TextView heading;
//        ImageView imageView;
//
//        public ViewHolder(View view) {
//            super(view);
//            this.cardView1 = view;
//            this.heading = (TextView) view.findViewById(C0586R.id.premdeals_recycler_name);
//            this.imageView = (ImageView) view.findViewById(C0586R.id.premdeals_recycler_image);
//        }
//    }
//
//    public PremiumDealsAdapter(Context context, List<ShopsModel> list) {
//        this.ctx = context;
//        this.resultDataList = list;
//    }
//
//    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0586R.layout.premdeals_recycler_row, viewGroup, false));
//    }
//
//    public void onBindViewHolder(ViewHolder viewHolder, int i) {
//        final ShopsModel shopsModel = (ShopsModel) this.resultDataList.get(i);
//        viewHolder.heading.setText(shopsModel.getName());
//        viewHolder.cardView1.setOnClickListener(new OnClickListener() {
//            public void onClick(View view) {
//                view = new Intent(PremiumDealsAdapter.this.ctx, ShopDetails.class);
//                view.putExtra("name", shopsModel.getName());
//                view.putExtra("shopID", shopsModel.getId());
//                PremiumDealsAdapter.this.ctx.startActivity(view);
//            }
//        });
//    }
//
//    public int getItemCount() {
//        return this.resultDataList.size();
//    }
//}
