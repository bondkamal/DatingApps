package com.mypocketfriend.dating.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mypocketfriend.dating.R;
import com.mypocketfriend.dating.modal.StoreModal;

import java.util.List;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {

    private List<StoreModal> storeModals;
    private Context context;

    public StoreAdapter(List<StoreModal> storeModals, Context context) {
        this.storeModals = storeModals;
        this.context = context;
    }

    @NonNull
    @Override
    public StoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.store_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreAdapter.ViewHolder holder, int position) {
        String image = storeModals.get(position).getImage();
        String cutP = storeModals.get(position).getCut_price();
        String cutPe = storeModals.get(position).getCut_persen();
        String finalA = storeModals.get(position).getFinal_amount();
        holder.setData(image,cutP,cutPe,finalA);
    }

    @Override
    public int getItemCount() {
        return storeModals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView cut;
        public TextView persen;
        public TextView amount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.banner);
            cut = itemView.findViewById(R.id.cut_price);
            persen = itemView.findViewById(R.id.cut_persen);
            amount = itemView.findViewById(R.id.final_amount);
        }

        public void setData(String image, String cutP, String cutPe, String finalA) {
            cut.setText(cutP);
            persen.setText(cutPe);
            amount.setText(finalA);
        }
    }
}
