package com.mypocketfriend.dating.modal;

import android.widget.ImageView;

public class BannerHomePageModal {
    String id, bannerName, bannerType,bannerOwner, bannerOwnerName;
    ImageView bannerImage;

    public BannerHomePageModal(String id, String bannerName, String bannerType, String bannerOwner, String bannerOwnerName) {
        this.id = id;
        this.bannerName = bannerName;
        this.bannerType = bannerType;
        this.bannerOwner = bannerOwner;
        this.bannerOwnerName = bannerOwnerName;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public String getBannerOwner() {
        return bannerOwner;
    }

    public void setBannerOwner(String bannerOwner) {
        this.bannerOwner = bannerOwner;
    }

    public String getBannerOwnerName() {
        return bannerOwnerName;
    }

    public void setBannerOwnerName(String bannerOwnerName) {
        this.bannerOwnerName = bannerOwnerName;
    }
}
