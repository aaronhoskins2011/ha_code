
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Division implements Parcelable
{

    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("division_level")
    @Expose
    private Integer divisionLevel;
    @SerializedName("display_type")
    @Expose
    private String displayType;
    @SerializedName("taxonomy_id")
    @Expose
    private Integer taxonomyId;
    @SerializedName("slug")
    @Expose
    private String slug;
    public final static Creator<Division> CREATOR = new Creator<Division>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Division createFromParcel(Parcel in) {
            return new Division(in);
        }

        public Division[] newArray(int size) {
            return (new Division[size]);
        }

    }
    ;

    protected Division(Parcel in) {
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.shortName = ((String) in.readValue((String.class.getClassLoader())));
        this.divisionLevel = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.displayType = ((String) in.readValue((String.class.getClassLoader())));
        this.taxonomyId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Division() {
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getDivisionLevel() {
        return divisionLevel;
    }

    public void setDivisionLevel(Integer divisionLevel) {
        this.divisionLevel = divisionLevel;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public Integer getTaxonomyId() {
        return taxonomyId;
    }

    public void setTaxonomyId(Integer taxonomyId) {
        this.taxonomyId = taxonomyId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(displayName);
        dest.writeValue(shortName);
        dest.writeValue(divisionLevel);
        dest.writeValue(displayType);
        dest.writeValue(taxonomyId);
        dest.writeValue(slug);
    }

    public int describeContents() {
        return  0;
    }

}
