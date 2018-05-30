package com.framgia.music_17.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {
    private int mId;
    private int mDuation;
    private String mTitle;
    private String mArtWork_url;
    private String mArtist;
    private String mStreamUrl;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getDuation() {
        return mDuation;
    }

    public void setDuation(int duation) {
        mDuation = duation;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getArtWork_url() {
        return mArtWork_url;
    }

    public void setArtWork_url(String artWork_url) {
        mArtWork_url = artWork_url;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }

    public String getStreamUrl() {
        return mStreamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        mStreamUrl = streamUrl;
    }

    public static Creator<Song> getCREATOR() {
        return CREATOR;
    }

    public Song(int id, int duation, String title, String artWork_url, String artist,
            String streamUrl) {
        mId = id;
        mDuation = duation;
        mTitle = title;
        mArtWork_url = artWork_url;
        mArtist = artist;
        mStreamUrl = streamUrl;
    }

    protected Song(Parcel in) {
        mId = in.readInt();
        mDuation = in.readInt();
        mTitle = in.readString();
        mArtWork_url = in.readString();
        mArtist = in.readString();
        mStreamUrl = in.readString();
    }

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mId);
        dest.writeInt(mDuation);
        dest.writeString(mTitle);
        dest.writeString(mArtWork_url);
        dest.writeString(mArtist);
        dest.writeString(mStreamUrl);
    }

    class SongEnty {
        public final String ID = "id";
        public final String TITLE = "title";
        public final String USER = "user";
        public final String ARTWORK_URL = "artwork_url";
        public final String DURATION = "duration";
        public final String STREAM_URL = "stream_url";
    }
}
