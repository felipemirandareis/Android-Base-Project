package net.anapsil.androidbaseproject.presentation.mapper;

/**
 * Created by ana.silva on 12/4/15.
 */
public interface BaseMapper<E,M> {
    M toModel(E entity);
}
