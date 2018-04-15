package com.homeawaycoding.aaronhoskins.myapplication.Views.DetailsActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Event;
import com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Venue;
import com.homeawaycoding.aaronhoskins.myapplication.R;
import com.homeawaycoding.aaronhoskins.myapplication.data.local.FavoriteEventsDatabaseHelper;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {
    private static final String EVENT_JSON_KEY = "event_json";

    @BindView(R.id.img_seat_geek_item_image)
    protected ImageView seatGeekImageView;
    @BindView(R.id.tv_seat_geek_item_title)
    protected TextView seatGeekTitleTextView;
    @BindView(R.id.tv_seat_geek_item_date)
    protected TextView seatGeekDateTextView;
    @BindView(R.id.tv_seat_geek_item_location)
    protected TextView seatGeekLocationTextView;

    @BindDrawable(R.drawable.action_bar_background)
    protected Drawable actionBarDrawable;

    private Event event;

    public static Intent createDetailsIntent(@NonNull Context passedContext, @NonNull String eventDetailsJson) {
        Intent intent = new Intent(passedContext, DetailsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(EVENT_JSON_KEY, eventDetailsJson);
        intent.putExtras(bundle);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        getEventPassed();
        initActionBar();

        if(event != null) {
            initializeDetails();
        }

    }

    protected void initActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(actionBarDrawable);
        actionBar.setTitle(event.getTitle());
    }

    private void getEventPassed() {
        final Intent intent = getIntent();
        final Bundle bundle = intent.getExtras();
        if(bundle != null) {
            final String eventJson = bundle.getString(EVENT_JSON_KEY);
            if (!eventJson.isEmpty()) {
                event = new Gson().fromJson(eventJson, Event.class);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.details_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favorite:
                FavoriteEventsDatabaseHelper favoriteEventsDatabaseHelper = new FavoriteEventsDatabaseHelper(this);
                favoriteEventsDatabaseHelper.saveFavoriteEvent(String.valueOf(event.getId()));
                Toast.makeText(this, "Saved to Favorites", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected void initializeDetails() {
        final Venue venue = event.getVenue();
        seatGeekTitleTextView.setText(event.getTitle());
        seatGeekDateTextView.setText(event.getAnnounceDate());
        if (venue != null) {
            seatGeekLocationTextView.setText(venue.getDisplayLocation());
        }

        String imgLocation = event.getPerformers().get(0).getImages().getHuge();
        if (imgLocation == null || imgLocation.isEmpty()) {
            Glide.with(this)
                    .load(R.drawable.no_cover)
                    .into(seatGeekImageView);

        } else {
            Glide.with(this)
                    .load(imgLocation)
                    .into(seatGeekImageView);
        }
    }
}
