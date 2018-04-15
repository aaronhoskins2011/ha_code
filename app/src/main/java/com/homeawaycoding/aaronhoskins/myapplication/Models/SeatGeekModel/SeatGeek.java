
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SeatGeek implements Parcelable
{

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("in_hand")
    @Expose
    private InHand inHand;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    public final static Creator<SeatGeek> CREATOR = new Creator<SeatGeek>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SeatGeek createFromParcel(Parcel in) {
            return new SeatGeek(in);
        }

        public SeatGeek[] newArray(int size) {
            return (new SeatGeek[size]);
        }

    }
    ;

    protected SeatGeek(Parcel in) {
        this.meta = ((Meta) in.readValue((Meta.class.getClassLoader())));
        this.inHand = ((InHand) in.readValue((InHand.class.getClassLoader())));
        in.readList(this.events, (com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Event.class.getClassLoader()));
    }

    public SeatGeek() {
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public InHand getInHand() {
        return inHand;
    }

    public void setInHand(InHand inHand) {
        this.inHand = inHand;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(meta);
        dest.writeValue(inHand);
        dest.writeList(events);
    }

    public int describeContents() {
        return  0;
    }

}
