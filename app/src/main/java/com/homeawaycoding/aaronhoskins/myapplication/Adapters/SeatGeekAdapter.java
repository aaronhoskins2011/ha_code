package com.homeawaycoding.aaronhoskins.myapplication.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Event;
import com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.SeatGeek;
import com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Venue;
import com.homeawaycoding.aaronhoskins.myapplication.R;
import com.homeawaycoding.aaronhoskins.myapplication.Views.DetailsActivity.DetailsActivity;
import com.homeawaycoding.aaronhoskins.myapplication.data.local.FavoriteEventsDatabaseHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SeatGeekAdapter extends RecyclerView.Adapter<SeatGeekAdapter.ViewHolder>  {
    private List<Event> seatGeekEventList;
    public SeatGeekAdapter(SeatGeek seatGeekModel) {
        if (seatGeekModel != null) {
            seatGeekEventList = seatGeekModel.getEvents();
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seat_geek_layout,
                                                                    parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Event currentEvent = seatGeekEventList.get(position);
        if (currentEvent != null) {
            final Venue venue = currentEvent.getVenue();
            holder.setItemEvent(currentEvent);
            holder.seatGeekTitleTextView.setText(currentEvent.getTitle());
            holder.seatGeekDateTextView.setText(currentEvent.getAnnounceDate());
            if (venue != null) {
                holder.seatGeekLocationTextView.setText(venue.getDisplayLocation());
            }
            handleFavorites(holder);

            String imgLocation = currentEvent.getPerformers().get(0).getImages().getHuge();
            if (imgLocation == null || imgLocation.isEmpty()) {
                Glide.with(holder.itemView.getContext())
                        .load(R.drawable.no_cover)
                        .into(holder.seatGeekImageView);

            } else {
                Glide.with(holder.itemView.getContext())
                        .load(imgLocation)
                        .into(holder.seatGeekImageView);
            }

        }
    }

    protected void handleFavorites(ViewHolder holder) {
        FavoriteEventsDatabaseHelper favoriteEventsDatabaseHelper =
                new FavoriteEventsDatabaseHelper(holder.itemView.getContext());
        List<String> listEvents = favoriteEventsDatabaseHelper.queryForAllFavoriteMessageIds();

        if(listEvents.contains(String.valueOf(holder.getItemEvent().getId()))) {
            holder.favoriteIndicator.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        if(seatGeekEventList != null) {
            return seatGeekEventList.size();
        }
        return 0;
    }

    @SuppressWarnings("WeakerAccess")
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_seat_geek_item_image)
        protected ImageView seatGeekImageView;
        @BindView(R.id.tv_seat_geek_item_title)
        protected TextView seatGeekTitleTextView;
        @BindView(R.id.tv_seat_geek_item_date)
        protected TextView seatGeekDateTextView;
        @BindView(R.id.tv_seat_geek_item_location)
        protected TextView seatGeekLocationTextView;
        @BindView(R.id.fav_heart)
        protected ImageView favoriteIndicator;

        private Event itemEvent;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public Event getItemEvent() {
            return itemEvent;
        }

        public void setItemEvent(Event itemEvent) {
            this.itemEvent = itemEvent;
        }

        @OnClick(R.id.layout_seat_geek_item)
        public void onClick() {
            itemView.getContext().startActivity(DetailsActivity.createDetailsIntent(
                    itemView.getContext(),
                    new Gson().toJson(itemEvent, Event.class)));
        }
    }
}
