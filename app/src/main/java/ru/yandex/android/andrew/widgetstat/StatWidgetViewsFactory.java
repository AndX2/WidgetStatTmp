package ru.yandex.android.andrew.widgetstat;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import ru.yandex.android.andrew.widgetstat.data.Shop;
import ru.yandex.android.andrew.widgetstat.data.Stat;

/**
 * Created by Andrew on 28.01.2017.
 */
public class StatWidgetViewsFactory implements RemoteViewsService.RemoteViewsFactory {

    private List<Shop> shopList = new ArrayList<>();

    private Context context;
    private Intent intent;
    private int widgetId;

    public StatWidgetViewsFactory(Context context, Intent intent) {
        this.context = context;
        this.intent = intent;
        widgetId = intent.getIntExtra(AppWidgetManager.EXTRA_APPWIDGET_ID,
                AppWidgetManager.INVALID_APPWIDGET_ID);
    }

    @Override
    public void onCreate(){
        Random random = new Random();
        shopList.add(new Shop("1234", "Shop1 address", "http://unpictures.ru/images/1857943_magazin-ekzist-ru.jpg",
                random.nextInt(), random.nextFloat(), random.nextFloat()));
        shopList.add(new Shop("1235", "Shop2 address", "http://unpictures.ru/images/1857943_magazin-ekzist-ru.jpg",
                random.nextInt(), random.nextFloat(), random.nextFloat()));
        shopList.add(new Shop("1236", "Shop3 address", "http://unpictures.ru/images/1857943_magazin-ekzist-ru.jpg",
                random.nextInt(), random.nextFloat(), random.nextFloat()));
        shopList.add(new Shop("1237", "Shop4 address", "http://unpictures.ru/images/1857943_magazin-ekzist-ru.jpg",
                random.nextInt(), random.nextFloat(), random.nextFloat()));
        Log.d("StatWFactory onCreate ", shopList.size() + "");
    }

    @Override
    public void onDataSetChanged() {
        //// TODO: 28.01.2017 data changes
    }

    @Override
    public void onDestroy() {
        shopList.clear();

    }

    @Override
    public int getCount() {
        return shopList.size();
    }

    @Override
    public RemoteViews getViewAt(int i) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.item);
        remoteViews.setTextViewText(R.id.tv_buyer,
                String.valueOf(shopList.get(i).getBuyers()));
        remoteViews.setTextViewText(R.id.tv_purchases,
                String.valueOf(shopList.get(i).getPurchase()));
        remoteViews.setTextViewText(R.id.tv_sum,
                String.valueOf(shopList.get(i).getSum()));
        Log.d("StatWFactory getViewAt ", "called");
//        AppWidgetManager manager = AppWidgetManager.getInstance(context);
//        ComponentName widget = new ComponentName(context, NewAppWidget.class);
//        int[] appWidgetIds = manager.getAppWidgetIds(widget);
//        manager.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.list_shops);
        return remoteViews;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
}
