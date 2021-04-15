package com.mypocketfriend.dating;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mypocketfriend.dating.adapter.BannerHomePageAdapter;
import com.mypocketfriend.dating.adapter.CategoryAdapter;
import com.mypocketfriend.dating.adapter.ProfileAdapter;
import com.mypocketfriend.dating.modal.BannerHomePageModal;
import com.mypocketfriend.dating.modal.CategoryModal;
import com.mypocketfriend.dating.modal.ProfileModal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView categoryRecycler;
    List<CategoryModal> categoryModals = new ArrayList<>();
    private CategoryAdapter adapter;

    private RecyclerView profileRecycler;
    List<ProfileModal> profileModals = new ArrayList<>();
    private ProfileAdapter profileAdapter;

    private ImageView nav_home, nav_profile;
    public static Dialog profileDialog;

    private RecyclerView bannerRecycler;
    List<BannerHomePageModal> bannerHomePageModals = new ArrayList<>();
    private BannerHomePageAdapter bannerHomePageAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryRecycler = findViewById(R.id.cate_recyclerView);
        profileRecycler = findViewById(R.id.profile_recyclerView);
        bannerRecycler = findViewById(R.id.banner_recyclerView);
        nav_home = findViewById(R.id.nav_home);
        nav_profile = findViewById(R.id.nav_profile);

        profileDialog = new Dialog(this);
        profileDialog.setContentView(R.layout.profile_view_layout);
        profileDialog.setCancelable(true);
        profileDialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.slider_background));
        profileDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        categoryRecycler.setLayoutManager(linearLayoutManager);

        adapter = new CategoryAdapter(getApplicationContext(), categoryModals);
        categoryRecycler.setAdapter(adapter);

        categoryModals.add(new CategoryModal("1", "New"));
        categoryModals.add(new CategoryModal("1", "New Name"));
        categoryModals.add(new CategoryModal("1", "Surajit"));
        categoryModals.add(new CategoryModal("1", "Kamalesh"));
        categoryModals.add(new CategoryModal("1", "Abhisekh"));
        categoryModals.add(new CategoryModal("1", "Popular"));
        categoryModals.add(new CategoryModal("1", "Live"));
        categoryModals.add(new CategoryModal("1", "Hot"));

        adapter.notifyDataSetChanged();


        LinearLayoutManager linearLayoutManagerProfile = new LinearLayoutManager(this);
        linearLayoutManagerProfile.setOrientation(RecyclerView.VERTICAL);
        profileRecycler.setLayoutManager(linearLayoutManagerProfile);

        profileAdapter = new  ProfileAdapter(getApplicationContext(),profileModals);
        profileRecycler.setAdapter(profileAdapter);

        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));
        profileModals.add(new ProfileModal("1","Kamalesh","53","5563","86342"));

        profileAdapter.notifyDataSetChanged();

        LinearLayoutManager linearLayoutManagerBanner = new LinearLayoutManager(this);
        linearLayoutManagerBanner.setOrientation(RecyclerView.HORIZONTAL);
        bannerRecycler.setLayoutManager(linearLayoutManagerBanner);

        bannerHomePageAdapter = new BannerHomePageAdapter(getApplicationContext(),bannerHomePageModals);
        bannerRecycler.setAdapter(bannerHomePageAdapter);

        bannerHomePageModals.add(new BannerHomePageModal("","HOT","VIDEO","KAMALESH","Kamalesh Broad"));
        bannerHomePageModals.add(new BannerHomePageModal("","HOT","VIDEO","KAMALESH","Kamalesh Broad"));
        bannerHomePageModals.add(new BannerHomePageModal("","HOT","VIDEO","KAMALESH","Kamalesh Broad"));
        bannerHomePageModals.add(new BannerHomePageModal("","HOT","VIDEO","KAMALESH","Kamalesh Broad"));
        bannerHomePageModals.add(new BannerHomePageModal("","HOT","VIDEO","KAMALESH","Kamalesh Broad"));





        nav_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_search){
            return true;
        }else if(id == R.id.action_message){
            return true;
        }else if(id == R.id.action_notify){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}