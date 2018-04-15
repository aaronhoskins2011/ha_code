
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentSource_ implements Parcelable
{

    @SerializedName("source_type")
    @Expose
    private String sourceType;
    @SerializedName("generation_type")
    @Expose
    private String generationType;
    public final static Creator<DocumentSource_> CREATOR = new Creator<DocumentSource_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public DocumentSource_ createFromParcel(Parcel in) {
            return new DocumentSource_(in);
        }

        public DocumentSource_[] newArray(int size) {
            return (new DocumentSource_[size]);
        }

    }
    ;

    protected DocumentSource_(Parcel in) {
        this.sourceType = ((String) in.readValue((String.class.getClassLoader())));
        this.generationType = ((String) in.readValue((String.class.getClassLoader())));
    }

    public DocumentSource_() {
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getGenerationType() {
        return generationType;
    }

    public void setGenerationType(String generationType) {
        this.generationType = generationType;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(sourceType);
        dest.writeValue(generationType);
    }

    public int describeContents() {
        return  0;
    }

}
