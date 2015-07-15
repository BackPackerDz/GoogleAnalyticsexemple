package com.androidpourtous.googleanalyticsexemple;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by Back Packer
 * Date : 15/07/15
 */
public class App extends Application {

    public static GoogleAnalytics analytics;
    public static Tracker tracker;


    @Override
    public void onCreate() {
        super.onCreate();

        analytics = GoogleAnalytics.getInstance(this);

        tracker = analytics.newTracker(getString(R.string.id_google_analytics));

        // Cela permet de pouvoir récupérer les erreurs
        tracker.enableExceptionReporting(true);

        /**
         *  Pouvoir récupérer des données démographiques et leurs centre d'intêrets
         */
        tracker.enableAdvertisingIdCollection(true);

        tracker.enableAutoActivityTracking(true);


    }
}
