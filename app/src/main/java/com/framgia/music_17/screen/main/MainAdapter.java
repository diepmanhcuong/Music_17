package com.framgia.music_17.screen.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.framgia.music_17.R;
import com.framgia.music_17.screen.listmusicoffline.ListMusicOfflineFragment;
import com.framgia.music_17.screen.playlistoffline.PlaylistOfflineFragment;
import com.framgia.music_17.screen.playmusic.PlayMusicFragment;

import static com.framgia.music_17.Utils.Constants.TabLayout.TAB_HOME;
import static com.framgia.music_17.Utils.Constants.TabLayout.TAB_MUSIC;
import static com.framgia.music_17.Utils.Constants.TabLayout.TAB_PLAY_LIST;

public class MainAdapter extends FragmentPagerAdapter {

    private static final int TAB_COUNT = 3;

    private Context mContext;

    public MainAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case TAB_HOME:
                return new PlayMusicFragment();
            case TAB_PLAY_LIST:
                return new PlaylistOfflineFragment();
            case TAB_MUSIC:
                return new ListMusicOfflineFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case TAB_HOME:
                return mContext.getString(R.string.play_list_online);
            case TAB_PLAY_LIST:
                return mContext.getString(R.string.play_list_offline);
            case TAB_MUSIC:
                return mContext.getString(R.string.music);
        }
        return null;
    }
}
