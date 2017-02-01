package ru.yandex.android.andrew.widgetstat.data;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Andrew on 28.01.2017.
 */

public class Stat {

    private int dayOfYear;

    private long buyers;
    private float purchase;
    private float sum;

    public Stat(Calendar calendar, long buyers, float purchase, float sum) {
        this.dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        this.buyers = buyers;
        this.purchase = purchase;
        this.sum = sum;
    }

    //region Getters/Setters


    public int getDayOfYear() {
        return dayOfYear;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public long getBuyers() {
        return buyers;
    }

    public void setBuyers(long buyers) {
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
