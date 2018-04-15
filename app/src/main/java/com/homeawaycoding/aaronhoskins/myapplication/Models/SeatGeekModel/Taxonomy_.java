
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Taxonomy_ implements Parcelable
{

    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("document_source")
    @Expose
    private DocumentSource_ documentSource;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    public final static Creator<Taxonomy_> CREATOR = new Creator<Taxonomy_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Taxonomy_ createFromParcel(Parcel in) {
            return new Taxonomy_(in);
        }

        public Taxonomy_[] newArray(int size) {
            return (new Taxonomy_[size]);
        }

    }
    ;

    protected Taxonomy_(Parcel in) {
        this.parentId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.documentSource = ((DocumentSource_) in.readValue((DocumentSource_.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Taxonomy_() {
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public DocumentSource_ getDocumentSource() {
        return documentSource;
    }

    public void setDocumentSource(DocumentSource_ documentSource) {
        this.documentSource = documentSource;
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
        dest.writeValue(documentSource);
        dest.writeValue(name);
        dest.writeValue(id);
    }

    public int describeContents() {
        return  0;
    }

}
