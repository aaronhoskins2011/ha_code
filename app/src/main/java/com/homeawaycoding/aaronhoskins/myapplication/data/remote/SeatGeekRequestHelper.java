package com.homeawaycoding.aaronhoskins.myapplication.data.remote;

import android.net.Uri;
import android.util.Log;

import com.google.gson.Gson;
import com.homeawaycoding.aaronhoskins.myapplication.Constants;
import com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.SeatGeek;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SeatGeekRequestHelper {
    public SeatGeek getSeatGeekResponce(String searchText) throws IOException{
        Gson gson = new Gson();
        return gson.fromJson(getSeatGeekJson(searchText), SeatGeek.class);
    }

    protected String getSeatGeekJson(String searchText) throws  IOException {
        final OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(getSeatGeekUrl(searchText))
                .build();
        try (final Response response = okHttpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {throw new IOException("Failed to retrieve response");}
            return response.body().string();
        }
    }

    protected String getSeatGeekUrl(String searchText) {
        Uri.Builder uriBuilder = new Uri.Builder();
        uriBuilder.scheme(Constants.HTTPS_SCHEME)
                .appendPath(Constants.BASE_SEAT_GEEK_URL)
                .appendPath(Constants.VERSION)
                .appendPath(Constants.QUERY_EVENT)
                .appendQueryParameter("q", searchText)
                .appendQueryParameter(Constants.PARAM_CLIENT_ID,Constants.API_KEY);
        Log.d("TAG", uriBuilder.toString());
        return uriBuilder.toString();
    }
}
