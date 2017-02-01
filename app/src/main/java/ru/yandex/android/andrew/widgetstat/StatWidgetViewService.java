package ru.yandex.android.andrew.widgetstat;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by Andrew on 28.01.2017.
 */

public class StatWidgetViewService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StatWidgetViewsFactory(getApplicationContext(), intent);
    }


}
