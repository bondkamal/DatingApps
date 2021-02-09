package com.mypocketfriend.dating;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mypocketfriend.dating.adapter.StoreAdapter;
import com.mypocketfriend.dating.modal.StoreModal;

import java.util.ArrayList;
import java.util.List;

public class ItemStoreActivity extends AppCompatActivity {

    private List<StoreModal> storeModals;
    private StoreAdapter storeAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_store);

        recyclerView = findViewById(R.id.store_recycler);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        storeModals = new ArrayList<>();
        storeModals.add(new StoreModal("", "4900", "50%", "2450"));
        storeModals.add(new StoreModal("", "2000", "50%", "1000"));
        storeModals.add(new StoreModal("", "3000", "50%", "1500"));
        storeModals.add(new StoreModal("", "10000", "50%", "5000"));
        storeModals.add(new StoreModal("", "2500", "50%", "1250"));
        storeModals.add(new StoreModal("", "100", "50%", "50"));
        storeModals.add(new StoreModal("", "500", "50%", "250"));
        storeModals.add(new StoreModal("", "4900", "50%", "2450"));
        storeModals.add(new StoreModal("", "2000", "50%", "1000"));
        storeModals.add(new StoreModal("", "3000", "50%", "1500"));
        storeModals.add(new StoreModal("", "10000", "50%", "5000"));
        storeModals.add(new StoreModal("", "2500", "50%", "1250"));
        storeModals.add(new StoreModal("", "100", "50%", "50"));
        storeModals.add(new StoreModal("", "500", "50%", "250"));
        storeAdapter = new StoreAdapter(storeModals, this);
        recyclerView.setAdapter(storeAdapter);

    }
}