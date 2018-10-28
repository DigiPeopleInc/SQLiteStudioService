package ru.digipeople.database.sqlitestudioservice;

import android.content.Context;

/**
 * Tool for remote connection to database using SQLiteStudio.
 * Wrapper around {@link pl.com.salsoft.sqlitestudioremote.SQLiteStudioService}.
 *
 * @author Aleksandr Brazhkin
 */
public class SQLiteStudioService {

    private final Context context;
    private final pl.com.salsoft.sqlitestudioremote.SQLiteStudioService delegate;

    public SQLiteStudioService(Context context, int servicePort) {
        this.context = context.getApplicationContext();
        this.delegate = new pl.com.salsoft.sqlitestudioremote.SQLiteStudioService();
        this.delegate.setPort(servicePort);
    }

    public void start() {
        delegate.start(context);
    }

    public void stop() {
        delegate.stop();
    }
}
