
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Performer implements Parcelable
{

    @SerializedName("home_venue_id")
    @Expose
    private Object homeVenueId;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("genres")
    @Expose
    private List<Genre> genres = null;
    @SerializedName("score")
    @Expose
    private Float score;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("primary")
    @Expose
    private Boolean primary;
    @SerializedName("image_attribution")
    @Expose
    private Object imageAttribution;
    @SerializedName("colors")
    @Expose
    private Object colors;
    @SerializedName("images")
    @Expose
    private Images_ images;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("has_upcoming_events")
    @Expose
    private Boolean hasUpcomingEvents;
    @SerializedName("popularity")
    @Expose
    private Float popularity;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("taxonomies")
    @Expose
    private List<Taxonomy_> taxonomies = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("divisions")
    @Expose
    private Object divisions;
    @SerializedName("image_license")
    @Expose
    private Object imageLicense;
    @SerializedName("num_upcoming_events")
    @Expose
    private Integer numUpcomingEvents;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    public final static Creator<Performer> CREATOR = new Creator<Performer>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Performer createFromParcel(Parcel in) {
            return new Performer(in);
        }

        public Performer[] newArray(int size) {
            return (new Performer[size]);
        }

    }
    ;

    protected Performer(Parcel in) {
        this.homeVenueId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.shortName = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.genres, (com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Genre.class.getClassLoader()));
        this.score = ((Float) in.readValue((Float.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.primary = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.imageAttribution = ((Object) in.readValue((Object.class.getClassLoader())));
        this.colors = ((Object) in.readValue((Object.class.getClassLoader())));
        this.images = ((Images_) in.readValue((Images_.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.hasUpcomingEvents = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.popularity = ((Float) in.readValue((Float.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.taxonomies, (com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Taxonomy_.class.getClassLoader()));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.image = ((Object) in.readValue((Object.class.getClassLoader())));
        this.divisions = ((Object) in.readValue((Object.class.getClassLoader())));
        this.imageLicense = ((Object) in.readValue((Object.class.getClassLoader())));
        this.numUpcomingEvents = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.stats = ((Stats) in.readValue((Stats.class.getClassLoader())));
    }

    public Performer() {
    }

    public Object getHomeVenueId() {
        return homeVenueId;
    }

    public void setHomeVenueId(Object homeVenueId) {
        this.homeVenueId = homeVenueId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public Object getImageAttribution() {
        return imageAttribution;
    }

    public void setImageAttribution(Object imageAttribution) {
        this.imageAttribution = imageAttribution;
    }

    public Object getColors() {
        return colors;
    }

    public void setColors(Object colors) {
        this.colors = colors;
    }

    public Images_ getImages() {
        return images;
    }

    public void setImages(Images_ images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasUpcomingEvents() {
        return hasUpcomingEvents;
    }

    public void setHasUpcomingEvents(Boolean hasUpcomingEvents) {
        this.hasUpcomingEvents = hasUpcomingEvents;
    }

    public Float getPopularity() {
        return popularity;
    }

    public void setPopularity(Float popularity) {
        this.popularity = popularity;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Taxonomy_> getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(List<Taxonomy_> taxonomies) {
        this.taxonomies = taxonomies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getDivisions() {
        return divisions;
    }

    public void setDivisions(Object divisions) {
        this.divisions = divisions;
    }

    public Object getImageLicense() {
        return imageLicense;
    }

    public void setImageLicense(Object imageLicense) {
        this.imageLicense = imageLicense;
    }

    public Integer getNumUpcomingEvents() {
        return numUpcomingEvents;
    }

    public void setNumUpcomingEvents(Integer numUpcomingEvents) {
        this.numUpcomingEvents = numUpcomingEvents;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(homeVenueId);
        dest.writeValue(shortName);
        dest.writeValue(type);
        dest.writeList(genres);
        dest.writeValue(score);
        dest.writeValue(slug);
        dest.writeValue(primary);
        dest.writeValue(imageAttribution);
        dest.writeValue(colors);
        dest.writeValue(images);
        dest.writeValue(name);
        dest.writeValue(hasUpcomingEvents);
        dest.writeValue(popularity);
        dest.writeValue(url);
        dest.writeList(taxonomies);
        dest.writeValue(id);
        dest.writeValue(image);
        dest.writeValue(divisions);
        dest.writeValue(imageLicense);
        dest.writeValue(numUpcomingEvents);
        dest.writeValue(stats);
    }

    public int describeContents() {
        return  0;
    }

}
