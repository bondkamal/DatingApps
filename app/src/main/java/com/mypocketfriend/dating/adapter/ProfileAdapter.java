package com.mypocketfriend.dating.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mypocketfriend.dating.MainActivity;
import com.mypocketfriend.dating.R;
import com.mypocketfriend.dating.modal.ProfileModal;

import java.util.List;

public class ProfileAdapter  extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {

    Context context;
    List<ProfileModal> profileModals;

    public ProfileAdapter(Context context, List<ProfileModal> profileModals) {
        this.context = context;
        this.profileModals = profileModals;
    }

    @NonNull
    @Override
    public ProfileAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_page_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ViewHolder holder, int position) {

        String name = profileModals.get(position).getName();
        String rank = profileModals.get(position).getRank();
        String star = profileModals.get(position).getStar();
        String follower = profileModals.get(position).getFollower();

        holder.name_tv.setText(name);
        holder.rank_tv.setText(rank);
        holder.star_tv.setText(star);
        holder.follower_tv.setText(follower);
    }

    @Override
    public int getItemCount() {
        return profileModals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name_tv;
        TextView rank_tv;
        TextView audio_or_video;
        TextView star_tv;
        TextView follower_tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name_tv = itemView.findViewById(R.id.profile_name);
            rank_tv = itemView.findViewById(R.id.profile_rank);
            audio_or_video = itemView.findViewById(R.id.audio_or_video);
            star_tv = itemView.findViewById(R.id.profile_star);
            follower_tv = itemView.findViewById(R.id.profile_follower);



        }
    }

}
