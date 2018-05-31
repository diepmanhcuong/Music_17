package com.framgia.music_17.screen.listmusiconline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.framgia.music_17.R;
import com.framgia.music_17.screen.BaseFragment;

public class ListMusicOnlineFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playlist_music_online,container,false);
        return view;
    }
}
