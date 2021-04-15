package com.mypocketfriend.dating;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mypocketfriend.dating.adapter.FollowingAdapter;
import com.mypocketfriend.dating.modal.FollowingModal;

import java.util.ArrayList;
import java.util.List;

public class FollowingActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<FollowingModal> followingModals = new ArrayList<>();
    private FollowingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_following);

        recyclerView = findViewById(R.id.following_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new FollowingAdapter(getApplicationContext(), followingModals);
        recyclerView.setAdapter(adapter);

        followingModals.add(new FollowingModal("", "Surajit", ""));
        followingModals.add(new FollowingModal("", "Surajit", ""));
        followingModals.add(new FollowingModal("", "Surajit", ""));
        followingModals.add(new FollowingModal("", "Surajit", ""));
        followingModals.add(new FollowingModal("", "Surajit", ""));
        adapter.notifyDataSetChanged();
    }
}