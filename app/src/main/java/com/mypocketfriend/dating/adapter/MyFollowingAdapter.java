package com.mypocketfriend.dating.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.mypocketfriend.dating.R;
import com.mypocketfriend.dating.modal.MyFollowingModal;
import com.mypocketfriend.dating.modal.ProfileModal;

import java.util.List;

public class MyFollowingAdapter extends RecyclerView.Adapter<MyFollowingAdapter.ViewHolder> {

    Context context;
    List<MyFollowingModal> myFollowingModals;

    public MyFollowingAdapter(Context context, List<MyFollowingModal> myFollowingModals) {
        this.context = context;
        this.myFollowingModals = myFollowingModals;
    }

    @NonNull
    @Override
    public MyFollowingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.my_following, parent, false);
        return new MyFollowingAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String image = myFollowingModals.get(position).getId();
        String name = myFollowingModals.get(position).getName();
        String follower = myFollowingModals.get(position).getFollower();
        String profilePic = myFollowingModals.get(position).getProfilePic();

        holder.followingName.setText(name);
        holder.followingSize.setText(follower);

    }

    @Override
    public int getItemCount() {
        return myFollowingModals.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView ;
        TextView followingName;
        TextView followingSize;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            imageView = itemView.findViewById(R.id.following_image);
            followingName = itemView.findViewById(R.id.following_name);
            followingSize = itemView.findViewById(R.id.following_size);
        }
    }
}
