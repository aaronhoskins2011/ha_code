
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta implements Parcelable
{

    @SerializedName("took")
    @Expose
    private Integer took;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("geolocation")
    @Expose
    private Geolocation geolocation;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    public final static Creator<Meta> CREATOR = new Creator<Meta>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Meta createFromParcel(Parcel in) {
            return new Meta(in);
        }

        public Meta[] newArray(int size) {
            return (new Meta[size]);
        }

    }
    ;

    protected Meta(Parcel in) {
        this.took = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.total = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.page = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.geolocation = ((Geolocation) in.readValue((Geolocation.class.getClassLoader())));
        this.perPage = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Meta() {
    }

    public Integer getTook() {
        return took;
    }

    public void setTook(Integer took) {
        this.took = took;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(took);
        dest.writeValue(total);
        dest.writeValue(page);
        dest.writeValue(geolocation);
        dest.writeValue(perPage);
    }

    public int describeContents() {
        return  0;
    }

}
