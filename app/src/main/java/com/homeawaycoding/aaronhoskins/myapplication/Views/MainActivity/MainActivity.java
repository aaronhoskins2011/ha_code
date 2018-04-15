package com.homeawaycoding.aaronhoskins.myapplication.Views.MainActivity;

import android.app.SearchManager;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;

import com.homeawaycoding.aaronhoskins.myapplication.Adapters.SeatGeekAdapter;
import com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.SeatGeek;
import com.homeawaycoding.aaronhoskins.myapplication.data.remote.SeatGeekRequestHelper;
import com.homeawaycoding.aaronhoskins.myapplication.R;

import java.io.IOException;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.seat_geek_recycle_view)
    protected RecyclerView seatGeekRecycleView;

    @BindDrawable(R.drawable.action_bar_background)
    protected Drawable actionBarDrawable;

    protected SeatGeekAdapter seatGeekAdapter;
    SeatGeek seatGeek;
    Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        initActionBar();
        initializeSeatGeekModel("");
    }

    protected void initActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(actionBarDrawable);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                initializeSeatGeekModel(newText);
                return false;
            }
        });

        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        initializeSeatGeekModel("");
    }

    protected void initializeRecyleView () {
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        seatGeekAdapter = new SeatGeekAdapter(seatGeek);
        seatGeekRecycleView.setLayoutManager(linearLayoutManager);
        seatGeekRecycleView.setAdapter(seatGeekAdapter);
    }

    protected void initializeSeatGeekModel(String searchText) {
        Thread seatGeekInitializationThread = new Thread(initializeSeatGeekModelRunnable(searchText));
        seatGeekInitializationThread.start();
        try {
            seatGeekInitializationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        initializeRecyleView();
    }

    protected Runnable initializeSeatGeekModelRunnable(final String searchText) {
        final SeatGeekRequestHelper seatGeekRequestHelper = new SeatGeekRequestHelper();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    seatGeek = seatGeekRequestHelper.getSeatGeekResponce(searchText);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        return runnable;
    }
}
