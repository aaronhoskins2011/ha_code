
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event implements Parcelable
{

    @SerializedName("is_open")
    @Expose
    private Boolean isOpen;
    @SerializedName("datetime_utc")
    @Expose
    private String datetimeUtc;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("score")
    @Expose
    private Float score;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("announce_date")
    @Expose
    private String announceDate;
    @SerializedName("date_tbd")
    @Expose
    private Boolean dateTbd;
    @SerializedName("datetime_local")
    @Expose
    private String datetimeLocal;
    @SerializedName("links")
    @Expose
    private List<Object> links = null;
    @SerializedName("popularity")
    @Expose
    private Float popularity;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("time_tbd")
    @Expose
    private Boolean timeTbd;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("taxonomies")
    @Expose
    private List<Taxonomy> taxonomies = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("short_title")
    @Expose
    private String shortTitle;
    @SerializedName("performers")
    @Expose
    private List<Performer> performers = null;
    @SerializedName("visible_until_utc")
    @Expose
    private String visibleUntilUtc;
    @SerializedName("venue")
    @Expose
    private Venue venue;
    @SerializedName("datetime_tbd")
    @Expose
    private Boolean datetimeTbd;
    @SerializedName("stats")
    @Expose
    private Stats_ stats;
    public final static Creator<Event> CREATOR = new Creator<Event>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Event createFromParcel(Parcel in) {
            return new Event(in);
        }

        public Event[] newArray(int size) {
            return (new Event[size]);
        }

    }
    ;

    protected Event(Parcel in) {
        this.isOpen = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.datetimeUtc = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.score = ((Float) in.readValue((Float.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.announceDate = ((String) in.readValue((String.class.getClassLoader())));
        this.dateTbd = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.datetimeLocal = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.links, (Object.class.getClassLoader()));
        this.popularity = ((Float) in.readValue((Float.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.timeTbd = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.taxonomies, (com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Taxonomy.class.getClassLoader()));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.shortTitle = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.performers, (com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel.Performer.class.getClassLoader()));
        this.visibleUntilUtc = ((String) in.readValue((String.class.getClassLoader())));
        this.venue = ((Venue) in.readValue((Venue.class.getClassLoader())));
        this.datetimeTbd = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.stats = ((Stats_) in.readValue((Stats_.class.getClassLoader())));
    }

    public Event() {
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getDatetimeUtc() {
        return datetimeUtc;
    }

    public void setDatetimeUtc(String datetimeUtc) {
        this.datetimeUtc = datetimeUtc;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnnounceDate() {
        return announceDate;
    }

    public void setAnnounceDate(String announceDate) {
        this.announceDate = announceDate;
    }

    public Boolean getDateTbd() {
        return dateTbd;
    }

    public void setDateTbd(Boolean dateTbd) {
        this.dateTbd = dateTbd;
    }

    public String getDatetimeLocal() {
        return datetimeLocal;
    }

    public void setDatetimeLocal(String datetimeLocal) {
        this.datetimeLocal = datetimeLocal;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
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

    public Boolean getTimeTbd() {
        return timeTbd;
    }

    public void setTimeTbd(Boolean timeTbd) {
        this.timeTbd = timeTbd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Taxonomy> getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(List<Taxonomy> taxonomies) {
        this.taxonomies = taxonomies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public List<Performer> getPerformers() {
        return performers;
    }

    public void setPerformers(List<Performer> performers) {
        this.performers = performers;
    }

    public String getVisibleUntilUtc() {
        return visibleUntilUtc;
    }

    public void setVisibleUntilUtc(String visibleUntilUtc) {
        this.visibleUntilUtc = visibleUntilUtc;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Boolean getDatetimeTbd() {
        return datetimeTbd;
    }

    public void setDatetimeTbd(Boolean datetimeTbd) {
        this.datetimeTbd = datetimeTbd;
    }

    public Stats_ getStats() {
        return stats;
    }

    public void setStats(Stats_ stats) {
        this.stats = stats;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isOpen);
        dest.writeValue(datetimeUtc);
        dest.writeValue(createdAt);
        dest.writeValue(type);
        dest.writeValue(score);
        dest.writeValue(status);
        dest.writeValue(announceDate);
        dest.writeValue(dateTbd);
        dest.writeValue(datetimeLocal);
        dest.writeList(links);
        dest.writeValue(popularity);
        dest.writeValue(url);
        dest.writeValue(timeTbd);
        dest.writeValue(title);
        dest.writeList(taxonomies);
        dest.writeValue(id);
        dest.writeValue(shortTitle);
        dest.writeList(performers);
        dest.writeValue(visibleUntilUtc);
        dest.writeValue(venue);
        dest.writeValue(datetimeTbd);
        dest.writeValue(stats);
    }

    public int describeContents() {
        return  0;
    }

}
