package net.anapsil.androidbaseproject.presentation.view.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.anapsil.androidbaseproject.presentation.model.BaseModel;
import net.anapsil.androidbaseproject.presentation.presenter.BasePresenter;

import butterknife.ButterKnife;

/**
 * @author ana.silva
 * @since 12/4/15
 */
public abstract class BaseFragment<P extends BasePresenter, M extends BaseModel> extends Fragment {
    P presenter;
    M model;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        instanciatePresenter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResource(),container,false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        presenter.buildView();
    }

    @Override
    public void onDestroyView() {
        presenter.destroyView();
        super.onDestroyView();
    }

    protected abstract int getLayoutResource();
    protected abstract void instanciatePresenter();

}
