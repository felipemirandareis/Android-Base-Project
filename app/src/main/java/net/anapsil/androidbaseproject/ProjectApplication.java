package net.anapsil.androidbaseproject;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by ana.silva on 12/4/15.
 */
public class ProjectApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        configureCalligraphy();
    }

    private void configureCalligraphy() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
