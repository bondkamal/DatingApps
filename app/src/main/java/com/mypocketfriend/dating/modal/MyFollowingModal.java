package com.mypocketfriend.dating.modal;

public class MyFollowingModal {
    String id, profilePic, name, follower;

    public MyFollowingModal(String id, String profilePic, String name, String follower) {
        this.id = id;
        this.profilePic = profilePic;
        this.name = name;
        this.follower = follower;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }
}
