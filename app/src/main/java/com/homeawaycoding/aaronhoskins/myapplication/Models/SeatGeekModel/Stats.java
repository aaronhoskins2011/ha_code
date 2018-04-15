
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats implements Parcelable
{

    @SerializedName("event_count")
    @Expose
    private Integer eventCount;
    public final static Creator<Stats> CREATOR = new Creator<Stats>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Stats createFromParcel(Parcel in) {
            return new Stats(in);
        }

        public Stats[] newArray(int size) {
            return (new Stats[size]);
        }

    }
    ;

    protected Stats(Parcel in) {
        this.eventCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Stats() {
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(eventCount);
    }

    public int describeContents() {
        return  0;
    }

}
