package com.mypocketfriend.dating.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mypocketfriend.dating.R;
import com.mypocketfriend.dating.modal.CategoryModal;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private Context context;
    List<CategoryModal> categoryModals;

    public CategoryAdapter(Context context, List<CategoryModal> categoryModals) {
        this.context = context;
        this.categoryModals = categoryModals;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        String name = categoryModals.get(position).getName();
        holder.name_tv.setText(name);
    }

    @Override
    public int getItemCount() {
        return categoryModals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name_tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name_tv = itemView.findViewById(R.id.categoye_name);
        }


    }
}
