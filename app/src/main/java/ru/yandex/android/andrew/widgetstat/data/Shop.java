package ru.yandex.android.andrew.widgetstat.data;

import java.util.Date;
import java.util.List;

/**
 * Created by Andrew on 28.01.2017.
 */

public class Shop {

    private String remoteId;
    private String name;
    private String urlImg;

    private int buyers;
    private float purchase;
    private float sum;

    public Shop(String remoteId, String name, String urlImg, int buyers, float purchase, float sum) {
        this.remoteId = remoteId;
        this.name = name;
        this.urlImg = urlImg;
        this.buyers = buyers;
        this.purchase = purchase;
        this.sum = sum;
    }

    public Shop(String remoteId, String name, String urlImg) {
        this.remoteId = remoteId;
        this.name = name;
        this.urlImg = urlImg;
    }

    //region Get/Set

    public String getRemoteId() {
        return remoteId;
    }

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public int getBuyers() {
        return buyers;
    }

    public void setBuyers(int buyers) {
        this.buyers = buyers;
    }

    public float getPurchase() {
        return purchase;
    }

    public void setPurchase(float purchase) {
        this.purchase = purchase;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
    //endregion
}
