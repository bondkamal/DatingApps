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
import com.mypocketfriend.dating.modal.FollowingModal;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class FollowingAdapter extends RecyclerView.Adapter<FollowingAdapter.ViewHolder> {

    Context context;
    List<FollowingModal> followingModals;

    public FollowingAdapter(Context context, List<FollowingModal> followingModals) {
        this.context = context;
        this.followingModals = followingModals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.following_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String name = followingModals.get(position).getName();

        holder.textView.setText(name);
    }

    @Override
    public int getItemCount() {
       return followingModals.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView circleImageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            circleImageView = itemView.findViewById(R.id.following_profile_image);
            textView = itemView.findViewById(R.id.following_profile_name);
        }
    }
}
