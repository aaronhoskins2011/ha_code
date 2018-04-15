
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Genre implements Parcelable
{

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("primary")
    @Expose
    private Boolean primary;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("document_source")
    @Expose
    private DocumentSource documentSource;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    public final static Creator<Genre> CREATOR = new Creator<Genre>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Genre createFromParcel(Parcel in) {
            return new Genre(in);
        }

        public Genre[] newArray(int size) {
            return (new Genre[size]);
        }

    }
    ;

    protected Genre(Parcel in) {
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.primary = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.images = ((Images) in.readValue((Images.class.getClassLoader())));
        this.documentSource = ((DocumentSource) in.readValue((DocumentSource.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Genre() {
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public DocumentSource getDocumentSource() {
        return documentSource;
    }

    public void setDocumentSource(DocumentSource documentSource) {
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
        dest.writeValue(slug);
        dest.writeValue(image);
        dest.writeValue(primary);
        dest.writeValue(images);
        dest.writeValue(documentSource);
        dest.writeValue(name);
        dest.writeValue(id);
    }

    public int describeContents() {
        return  0;
    }

}
