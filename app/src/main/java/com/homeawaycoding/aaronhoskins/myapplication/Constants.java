package com.homeawaycoding.aaronhoskins.myapplication;

public class Constants {
    public static final String HTTPS_SCHEME = "https";
    public static final String BASE_SEAT_GEEK_URL = "api.seatgeek.com";
    public static final String VERSION = "2";
    public static final String QUERY_EVENT = "events";
    public static final String PARAM_CLIENT_ID = "client_id";
    public static final String API_KEY = "MTEyMjIwMjB8MTUyMzcyOTk2MS42NQ";

    public class DatabaseConstants {

        public static final String SEAT_GEEK_DATABASE_NAME = "seatGeekDatabase";
        public static final int DATABASE_VERSION = 1;

        public class FavoritesTable {
            public static final String FAVORITES_TABLE_NAME = "FavoriteTable";
            public static final String FAVORITES_FIELD_MESSAGE_ID = "MessagesId";
        }
    }
}
