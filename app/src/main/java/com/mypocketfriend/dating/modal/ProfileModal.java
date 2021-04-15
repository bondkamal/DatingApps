package com.mypocketfriend.dating.modal;

public class ProfileModal {

    String id, name, rank, star, follower;

    public ProfileModal(String id, String name, String rank, String star, String follower) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.star = star;
        this.follower = follower;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }
}
