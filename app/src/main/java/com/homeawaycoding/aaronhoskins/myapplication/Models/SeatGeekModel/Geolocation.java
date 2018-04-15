
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geolocation implements Parcelable
{

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("lon")
    @Expose
    private Float lon;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("range")
    @Expose
    private String range;
    public final static Creator<Geolocation> CREATOR = new Creator<Geolocation>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Geolocation createFromParcel(Parcel in) {
            return new Geolocation(in);
        }

        public Geolocation[] newArray(int size) {
            return (new Geolocation[size]);
        }

    }
    ;

    protected Geolocation(Parcel in) {
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.lat = ((Float) in.readValue((Float.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.postalCode = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.lon = ((Float) in.readValue((Float.class.getClassLoader())));
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.range = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Geolocation() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(country);
        dest.writeValue(lat);
        dest.writeValue(state);
        dest.writeValue(postalCode);
        dest.writeValue(city);
        dest.writeValue(lon);
        dest.writeValue(displayName);
        dest.writeValue(range);
    }

    public int describeContents() {
        return  0;
    }

}
