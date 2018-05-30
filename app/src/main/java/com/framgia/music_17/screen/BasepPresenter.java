package com.framgia.music_17.screen;

public interface BasepPresenter<T> {
    void setView(T view);

    void onStart();

    void onStop();
}
