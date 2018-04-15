
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats_ implements Parcelable
{

    @SerializedName("lowest_price_good_deals")
    @Expose
    private Object lowestPriceGoodDeals;
    @SerializedName("lowest_price")
    @Expose
    private Float lowestPrice;
    @SerializedName("listing_count")
    @Expose
    private Integer listingCount;
    @SerializedName("highest_price")
    @Expose
    private Float highestPrice;
    @SerializedName("average_price")
    @Expose
    private Float averagePrice;
    public final static Creator<Stats_> CREATOR = new Creator<Stats_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Stats_ createFromParcel(Parcel in) {
            return new Stats_(in);
        }

        public Stats_[] newArray(int size) {
            return (new Stats_[size]);
        }

    }
    ;

    protected Stats_(Parcel in) {
        this.lowestPriceGoodDeals = ((Object) in.readValue((Object.class.getClassLoader())));
        this.lowestPrice = ((Float) in.readValue((Float.class.getClassLoader())));
        this.listingCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.highestPrice = ((Float) in.readValue((Float.class.getClassLoader())));
        this.averagePrice = ((Float) in.readValue((Float.class.getClassLoader())));
    }

    public Stats_() {
    }

    public Object getLowestPriceGoodDeals() {
        return lowestPriceGoodDeals;
    }

    public void setLowestPriceGoodDeals(Object lowestPriceGoodDeals) {
        this.lowestPriceGoodDeals = lowestPriceGoodDeals;
    }

    public Float getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Float lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public Integer getListingCount() {
        return listingCount;
    }

    public void setListingCount(Integer listingCount) {
        this.listingCount = listingCount;
    }

    public Float getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Float highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(lowestPriceGoodDeals);
        dest.writeValue(lowestPrice);
        dest.writeValue(listingCount);
        dest.writeValue(highestPrice);
        dest.writeValue(averagePrice);
    }

    public int describeContents() {
        return  0;
    }

}
