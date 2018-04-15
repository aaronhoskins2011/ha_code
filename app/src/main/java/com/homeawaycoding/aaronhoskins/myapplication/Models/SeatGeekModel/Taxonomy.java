
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Taxonomy implements Parcelable
{

    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    public final static Creator<Taxonomy> CREATOR = new Creator<Taxonomy>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Taxonomy createFromParcel(Parcel in) {
            return new Taxonomy(in);
        }

        public Taxonomy[] newArray(int size) {
            return (new Taxonomy[size]);
        }

    }
    ;

    protected Taxonomy(Parcel in) {
        this.parentId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Taxonomy() {
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(parentId);
        dest.writeValue(name);
        dest.writeValue(id);
    }

    public int describeContents() {
        return  0;
    }

}
