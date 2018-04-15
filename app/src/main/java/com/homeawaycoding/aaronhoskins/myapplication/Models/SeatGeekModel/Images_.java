
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images_ implements Parcelable
{

    @SerializedName("huge")
    @Expose
    private String huge;
    public final static Creator<Images_> CREATOR = new Creator<Images_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Images_ createFromParcel(Parcel in) {
            return new Images_(in);
        }

        public Images_[] newArray(int size) {
            return (new Images_[size]);
        }

    }
    ;

    protected Images_(Parcel in) {
        this.huge = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Images_() {
    }

    public String getHuge() {
        return huge;
    }

    public void setHuge(String huge) {
        this.huge = huge;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(huge);
    }

    public int describeContents() {
        return  0;
    }

}
