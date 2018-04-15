
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentSource implements Parcelable
{

    @SerializedName("source_type")
    @Expose
    private String sourceType;
    @SerializedName("generation_type")
    @Expose
    private String generationType;
    public final static Creator<DocumentSource> CREATOR = new Creator<DocumentSource>() {


        @SuppressWarnings({
            "unchecked"
        })
        public DocumentSource createFromParcel(Parcel in) {
            return new DocumentSource(in);
        }

        public DocumentSource[] newArray(int size) {
            return (new DocumentSource[size]);
        }

    }
    ;

    protected DocumentSource(Parcel in) {
        this.sourceType = ((String) in.readValue((String.class.getClassLoader())));
        this.generationType = ((String) in.readValue((String.class.getClassLoader())));
    }

    public DocumentSource() {
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
