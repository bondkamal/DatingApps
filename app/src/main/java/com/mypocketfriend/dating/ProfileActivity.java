package com.mypocketfriend.dating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ProfileActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        LinearLayout itemStore = findViewById(R.id.item_store_lay);
        LinearLayout starWallet = findViewById(R.id.start_wallet);
        LinearLayout level = findViewById(R.id.my_level);
        LinearLayout followingLayout = findViewById(R.id.profile_following_layout);



        followingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this,FollowingActivity.class));
            }
        });

        itemStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, ItemStoreActivity.class));
            }
        });

        starWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, StarWalletActivity.class));
            }
        });

        level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, LevelAndRewardsActivity.class));
            }
        });


    }
}