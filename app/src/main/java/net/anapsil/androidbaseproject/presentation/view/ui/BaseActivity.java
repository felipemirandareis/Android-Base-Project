package net.anapsil.androidbaseproject.presentation.view.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by ana.silva on 12/4/15.
 */
public abstract class BaseActivity<P> extends AppCompatActivity  {
    P presenter;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
