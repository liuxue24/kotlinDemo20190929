package com.example.shein.kotlindemo20180929;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created on 2016/8/15 10:03.
 * Project android_zzkko
 * Copyright (c) 2016 zzkko Inc. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
public class DataBindingRecyclerHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    private final T dataBinding;

    private SparseArrayCompat<View> itemViews = new SparseArrayCompat<>();

    public DataBindingRecyclerHolder(@NonNull T dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
    }

    public T getDataBinding() {
        return dataBinding;
    }

    /*
     *不用这个了，直接使用dataBinding的对象
     */
    @Deprecated
    public <P extends View> P findView(int viewId) {
        P view = (P) itemViews.get(viewId);
        if (view == null) {
            view = dataBinding.getRoot().findViewById(viewId);
            itemViews.put(viewId, view);
        }
        return (P) view;
    }
}
