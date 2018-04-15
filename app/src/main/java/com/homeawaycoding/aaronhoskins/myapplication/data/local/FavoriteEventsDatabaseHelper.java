package com.homeawaycoding.aaronhoskins.myapplication.data.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static android.support.constraint.Constraints.TAG;
import static com.homeawaycoding.aaronhoskins.myapplication.Constants.DatabaseConstants.DATABASE_VERSION;
import static com.homeawaycoding.aaronhoskins.myapplication.Constants.DatabaseConstants.FavoritesTable.FAVORITES_FIELD_MESSAGE_ID;
import static com.homeawaycoding.aaronhoskins.myapplication.Constants.DatabaseConstants.FavoritesTable.FAVORITES_TABLE_NAME;
import static com.homeawaycoding.aaronhoskins.myapplication.Constants.DatabaseConstants.SEAT_GEEK_DATABASE_NAME;

public class FavoriteEventsDatabaseHelper extends SQLiteOpenHelper {

    public FavoriteEventsDatabaseHelper(Context context) {
        super(context,SEAT_GEEK_DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String CREATE_FAVORITES_TABLE = "CREATE TABLE " +  FAVORITES_TABLE_NAME + "("
                + FAVORITES_FIELD_MESSAGE_ID + " TEXT)";
        Log.d(TAG, "onCreate: " + CREATE_FAVORITES_TABLE);
        sqLiteDatabase.execSQL(CREATE_FAVORITES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + FAVORITES_TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void saveFavoriteEvent(@NonNull String passedMessageId) {
        final SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        final ContentValues contentValues = new ContentValues();

        contentValues.put(FAVORITES_FIELD_MESSAGE_ID, passedMessageId);
        sqLiteDatabase.insert(FAVORITES_TABLE_NAME, null, contentValues);
        sqLiteDatabase.close();
    }

    public List<String> queryForAllFavoriteMessageIds() {
        final SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        final ArrayList<String> messageIdResults = new ArrayList<>();

        final String query = "Select * FROM " + FAVORITES_TABLE_NAME;
        final Cursor cursor = sqLiteDatabase.rawQuery(query, null);

        if(cursor.moveToFirst()) {
            do {
                messageIdResults.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        sqLiteDatabase.close();
        cursor.close();
        return messageIdResults;
    }

    @SuppressWarnings("unused")
    public boolean isMessageIdInDatabase(@NonNull String messageId) {
        final SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        final String query = "Select * FROM " + FAVORITES_TABLE_NAME
                + " WHERE " + FAVORITES_FIELD_MESSAGE_ID + " = \"" + messageId + "\"";
        final Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        sqLiteDatabase.close();
        cursor.close();
        return cursor.moveToFirst();
    }
}
