package com.framgia.music_17.screen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

public abstract class BaseRecyclerAdaper<V extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<V> {

    private final Context mContext;

    protected BaseRecyclerAdaper(@NonNull Context context) {
        mContext = context;
    }

    protected Context getContext() {
        return mContext;
    }
}
