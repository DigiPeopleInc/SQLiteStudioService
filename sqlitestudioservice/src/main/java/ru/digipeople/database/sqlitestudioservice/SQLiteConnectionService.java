package ru.digipeople.database.sqlitestudioservice;

import android.content.Context;

import pl.com.salsoft.sqlitestudioremote.SQLiteStudioService;

/**
 * Tool for remote connection to database using SQLiteStudio.
 *
 * @author Aleksandr Brazhkin
 */
public class SQLiteConnectionService {

    private final Context context;
    private final int servicePort;

    public SQLiteConnectionService(Context context, int servicePort) {
        this.context = context;
        this.servicePort = servicePort;
    }

    public void start() {
        SQLiteStudioService.instance().setPort(servicePort);
        SQLiteStudioService.instance().start(context);
    }

    public void stop() {
        SQLiteStudioService.instance().stop();
    }
}
