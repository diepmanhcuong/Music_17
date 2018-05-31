package com.framgia.music_17.screen.playmusic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.framgia.music_17.R;
import com.framgia.music_17.screen.BaseFragment;

public class PlayMusicFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playmusic, container, false);
        return view;
    }
}
