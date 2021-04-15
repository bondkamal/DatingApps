package com.mypocketfriend.dating.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mypocketfriend.dating.R;
import com.mypocketfriend.dating.modal.BannerHomePageModal;

import java.util.List;

public class BannerHomePageAdapter extends RecyclerView.Adapter<BannerHomePageAdapter.ViewHolder> {

    private Context context;
    List<BannerHomePageModal> bannerHomePageModals;

    public BannerHomePageAdapter(Context context, List<BannerHomePageModal> bannerHomePageModals) {
        this.context = context;
        this.bannerHomePageModals = bannerHomePageModals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.banner_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //String name = bannerHomePageModals.get(position).getBannerName();
        BannerHomePageModal item = bannerHomePageModals.get(position);
        holder.bannerNameTV.setText(item.getBannerName());
        //String type = bannerHomePageModals.get(position).getBannerType();
        holder.bannerTypeTV.setText(item.getBannerType());
        //String owner = bannerHomePageModals.get(position).getBannerOwner();
        holder.bannerOwnerTV.setText(item.getBannerOwner());
       // String ownerName = bannerHomePageModals.get(position).getBannerOwnerName();
        holder.bannerOwnerNameTV.setText(item.getBannerOwnerName());


    }

    @Override
    public int getItemCount() {
        return bannerHomePageModals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView bannerNameTV,bannerTypeTV,bannerOwnerTV,bannerOwnerNameTV;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            bannerNameTV = itemView.findViewById(R.id.banner_name);
            bannerTypeTV = itemView.findViewById(R.id.banner_type);
            bannerOwnerTV = itemView.findViewById(R.id.banner_owner);
            bannerOwnerNameTV = itemView.findViewById(R.id.banner_owner_name);

        }
    }
}
