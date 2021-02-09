package com.mypocketfriend.dating.modal;

public class StoreModal {

    String image;
    String cut_price;
    String cut_persen;
    String final_amount;

    public StoreModal(String image, String cut_price, String cut_persen, String final_amount) {
        this.image = image;
        this.cut_price = cut_price;
        this.cut_persen = cut_persen;
        this.final_amount = final_amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCut_price() {
        return cut_price;
    }

    public void setCut_price(String cut_price) {
        this.cut_price = cut_price;
    }

    public String getCut_persen() {
        return cut_persen;
    }

    public void setCut_persen(String cut_persen) {
        this.cut_persen = cut_persen;
    }

    public String getFinal_amount() {
        return final_amount;
    }

    public void setFinal_amount(String final_amount) {
        this.final_amount = final_amount;
    }
}
