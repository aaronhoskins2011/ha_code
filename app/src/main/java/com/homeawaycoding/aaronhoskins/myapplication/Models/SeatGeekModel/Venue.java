
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue implements Parcelable
{

    @SerializedName("display_location")
    @Expose
    private String displayLocation;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("score")
    @Expose
    private Float score;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("extended_address")
    @Expose
    private String extendedAddress;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("name_v2")
    @Expose
    private String nameV2;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("links")
    @Expose
    private List<Object> links = null;
    @SerializedName("has_upcoming_events")
    @Expose
    private Boolean hasUpcomingEvents;
    @SerializedName("popularity")
    @Expose
    private Float popularity;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("num_upcoming_events")
    @Expose
    private Integer numUpcomingEvents;
    public final static Creator<Venue> CREATOR = new Creator<Venue>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Venue createFromParcel(Parcel in) {
            return new Venue(in);
        }

        public Venue[] newArray(int size) {
            return (new Venue[size]);
        }

    }
    ;

    protected Venue(Parcel in) {
        this.displayLocation = ((String) in.readValue((String.class.getClassLoader())));
        this.postalCode = ((String) in.readValue((String.class.getClassLoader())));
        this.score = ((Float) in.readValue((Float.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
        this.extendedAddress = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.nameV2 = ((String) in.readValue((String.class.getClassLoader())));
        this.timezone = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.links, (Object.class.getClassLoader()));
        this.hasUpcomingEvents = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.popularity = ((Float) in.readValue((Float.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.address = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.numUpcomingEvents = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Venue() {
    }

    public String getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(String displayLocation) {
        this.displayLocation = displayLocation;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getExtendedAddress() {
        return extendedAddress;
    }

    public void setExtendedAddress(String extendedAddress) {
        this.extendedAddress = extendedAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameV2() {
        return nameV2;
    }

    public void setNameV2(String nameV2) {
        this.nameV2 = nameV2;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getNumUpcomingEvents() {
        return numUpcomingEvents;
    }

    public void setNumUpcomingEvents(Integer numUpcomingEvents) {
        this.numUpcomingEvents = numUpcomingEvents;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(displayLocation);
        dest.writeValue(postalCode);
        dest.writeValue(score);
        dest.writeValue(country);
        dest.writeValue(slug);
        dest.writeValue(location);
        dest.writeValue(extendedAddress);
        dest.writeValue(name);
        dest.writeValue(nameV2);
        dest.writeValue(timezone);
        dest.writeList(links);
        dest.writeValue(hasUpcomingEvents);
        dest.writeValue(popularity);
        dest.writeValue(city);
        dest.writeValue(url);
        dest.writeValue(id);
        dest.writeValue(address);
        dest.writeValue(state);
        dest.writeValue(numUpcomingEvents);
    }

    public int describeContents() {
        return  0;
    }

}
