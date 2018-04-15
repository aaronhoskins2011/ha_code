
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class InHand implements Parcelable
{

    public final static Creator<InHand> CREATOR = new Creator<InHand>() {


        @SuppressWarnings({
            "unchecked"
        })
        public InHand createFromParcel(Parcel in) {
            return new InHand(in);
        }

        public InHand[] newArray(int size) {
            return (new InHand[size]);
        }

    }
    ;

    protected InHand(Parcel in) {
    }

    public InHand() {
    }

    public void writeToParcel(Parcel dest, int flags) {
    }

    public int describeContents() {
        return  0;
    }

}
