
package com.homeawaycoding.aaronhoskins.myapplication.Models.SeatGeekModel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images implements Parcelable
{

    @SerializedName("1200x525")
    @Expose
    private String _1200x525;
    @SerializedName("criteo_400_300")
    @Expose
    private String criteo400300;
    @SerializedName("800x320")
    @Expose
    private String _800x320;
    @SerializedName("mongo")
    @Expose
    private String mongo;
    @SerializedName("1200x627")
    @Expose
    private String _1200x627;
    @SerializedName("fb_600_315")
    @Expose
    private String fb600315;
    @SerializedName("criteo_205_100")
    @Expose
    private String criteo205100;
    @SerializedName("136x136")
    @Expose
    private String _136x136;
    @SerializedName("fb_100x72")
    @Expose
    private String fb100x72;
    @SerializedName("huge")
    @Expose
    private String huge;
    @SerializedName("banner")
    @Expose
    private String banner;
    @SerializedName("ipad_event_modal")
    @Expose
    private String ipadEventModal;
    @SerializedName("500_700")
    @Expose
    private String _500700;
    @SerializedName("criteo_130_160")
    @Expose
    private String criteo130160;
    @SerializedName("square_mid")
    @Expose
    private String squareMid;
    @SerializedName("ipad_mini_explore")
    @Expose
    private String ipadMiniExplore;
    @SerializedName("block")
    @Expose
    private String block;
    @SerializedName("criteo_170_235")
    @Expose
    private String criteo170235;
    @SerializedName("ipad_header")
    @Expose
    private String ipadHeader;
    @SerializedName("triggit_fb_ad")
    @Expose
    private String triggitFbAd;
    public final static Creator<Images> CREATOR = new Creator<Images>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Images createFromParcel(Parcel in) {
            return new Images(in);
        }

        public Images[] newArray(int size) {
            return (new Images[size]);
        }

    }
    ;

    protected Images(Parcel in) {
        this._1200x525 = ((String) in.readValue((String.class.getClassLoader())));
        this.criteo400300 = ((String) in.readValue((String.class.getClassLoader())));
        this._800x320 = ((String) in.readValue((String.class.getClassLoader())));
        this.mongo = ((String) in.readValue((String.class.getClassLoader())));
        this._1200x627 = ((String) in.readValue((String.class.getClassLoader())));
        this.fb600315 = ((String) in.readValue((String.class.getClassLoader())));
        this.criteo205100 = ((String) in.readValue((String.class.getClassLoader())));
        this._136x136 = ((String) in.readValue((String.class.getClassLoader())));
        this.fb100x72 = ((String) in.readValue((String.class.getClassLoader())));
        this.huge = ((String) in.readValue((String.class.getClassLoader())));
        this.banner = ((String) in.readValue((String.class.getClassLoader())));
        this.ipadEventModal = ((String) in.readValue((String.class.getClassLoader())));
        this._500700 = ((String) in.readValue((String.class.getClassLoader())));
        this.criteo130160 = ((String) in.readValue((String.class.getClassLoader())));
        this.squareMid = ((String) in.readValue((String.class.getClassLoader())));
        this.ipadMiniExplore = ((String) in.readValue((String.class.getClassLoader())));
        this.block = ((String) in.readValue((String.class.getClassLoader())));
        this.criteo170235 = ((String) in.readValue((String.class.getClassLoader())));
        this.ipadHeader = ((String) in.readValue((String.class.getClassLoader())));
        this.triggitFbAd = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Images() {
    }

    public String get1200x525() {
        return _1200x525;
    }

    public void set1200x525(String _1200x525) {
        this._1200x525 = _1200x525;
    }

    public String getCriteo400300() {
        return criteo400300;
    }

    public void setCriteo400300(String criteo400300) {
        this.criteo400300 = criteo400300;
    }

    public String get800x320() {
        return _800x320;
    }

    public void set800x320(String _800x320) {
        this._800x320 = _800x320;
    }

    public String getMongo() {
        return mongo;
    }

    public void setMongo(String mongo) {
        this.mongo = mongo;
    }

    public String get1200x627() {
        return _1200x627;
    }

    public void set1200x627(String _1200x627) {
        this._1200x627 = _1200x627;
    }

    public String getFb600315() {
        return fb600315;
    }

    public void setFb600315(String fb600315) {
        this.fb600315 = fb600315;
    }

    public String getCriteo205100() {
        return criteo205100;
    }

    public void setCriteo205100(String criteo205100) {
        this.criteo205100 = criteo205100;
    }

    public String get136x136() {
        return _136x136;
    }

    public void set136x136(String _136x136) {
        this._136x136 = _136x136;
    }

    public String getFb100x72() {
        return fb100x72;
    }

    public void setFb100x72(String fb100x72) {
        this.fb100x72 = fb100x72;
    }

    public String getHuge() {
        return huge;
    }

    public void setHuge(String huge) {
        this.huge = huge;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getIpadEventModal() {
        return ipadEventModal;
    }

    public void setIpadEventModal(String ipadEventModal) {
        this.ipadEventModal = ipadEventModal;
    }

    public String get500700() {
        return _500700;
    }

    public void set500700(String _500700) {
        this._500700 = _500700;
    }

    public String getCriteo130160() {
        return criteo130160;
    }

    public void setCriteo130160(String criteo130160) {
        this.criteo130160 = criteo130160;
    }

    public String getSquareMid() {
        return squareMid;
    }

    public void setSquareMid(String squareMid) {
        this.squareMid = squareMid;
    }

    public String getIpadMiniExplore() {
        return ipadMiniExplore;
    }

    public void setIpadMiniExplore(String ipadMiniExplore) {
        this.ipadMiniExplore = ipadMiniExplore;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getCriteo170235() {
        return criteo170235;
    }

    public void setCriteo170235(String criteo170235) {
        this.criteo170235 = criteo170235;
    }

    public String getIpadHeader() {
        return ipadHeader;
    }

    public void setIpadHeader(String ipadHeader) {
        this.ipadHeader = ipadHeader;
    }

    public String getTriggitFbAd() {
        return triggitFbAd;
    }

    public void setTriggitFbAd(String triggitFbAd) {
        this.triggitFbAd = triggitFbAd;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(_1200x525);
        dest.writeValue(criteo400300);
        dest.writeValue(_800x320);
        dest.writeValue(mongo);
        dest.writeValue(_1200x627);
        dest.writeValue(fb600315);
        dest.writeValue(criteo205100);
        dest.writeValue(_136x136);
        dest.writeValue(fb100x72);
        dest.writeValue(huge);
        dest.writeValue(banner);
        dest.writeValue(ipadEventModal);
        dest.writeValue(_500700);
        dest.writeValue(criteo130160);
        dest.writeValue(squareMid);
        dest.writeValue(ipadMiniExplore);
        dest.writeValue(block);
        dest.writeValue(criteo170235);
        dest.writeValue(ipadHeader);
        dest.writeValue(triggitFbAd);
    }

    public int describeContents() {
        return  0;
    }

}
