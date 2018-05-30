package com.framgia.music_17.Utils;

import com.framgia.music_17.BuildConfig;
import com.framgia.music_17.R;

public class Constants {
    public Constants() {
    }

    public static final String API_KEY = BuildConfig.API_KEY;
    public static final String URL = "http://api.soundcloud.com/";
    public static final String TRACKS = "tracks/?";
    public static final String CLIENT_ID = "client_id=";

    public static final String TRACKS_URL = URL + TRACKS + CLIENT_ID + API_KEY;
    public static final String TRACK_GENRES = TRACKS_URL + "&genres=";
    public static final String SEARCH_MUSIC = TRACKS_URL + "&q=";
}
