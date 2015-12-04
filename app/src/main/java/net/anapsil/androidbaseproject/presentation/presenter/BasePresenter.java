package net.anapsil.androidbaseproject.presentation.presenter;

/**
 * Created by ana.silva on 12/4/15.
 */
public abstract class BasePresenter<V> {
    protected V view;
    public abstract void buildView();

    public abstract void destroyView();
}
