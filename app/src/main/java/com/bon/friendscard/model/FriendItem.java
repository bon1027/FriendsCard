package com.bon.friendscard.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 友だちのデータを持つクラス
 */
public class FriendItem implements Parcelable {
    public String name;
    public String phonetic;
    public String birthday;
    public String favoriteFood;
    public String imagePath;

    protected FriendItem(Parcel in) {
        name = in.readString();
        phonetic = in.readString();
        birthday = in.readString();
        favoriteFood = in.readString();
        imagePath = in.readString();
    }

    // 保存部分
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(phonetic);
        dest.writeString(birthday);
        dest.writeString(favoriteFood);
        dest.writeString(imagePath);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // 復元部分
    public static final Creator<FriendItem> CREATOR = new Creator<FriendItem>() {
        @Override
        public FriendItem createFromParcel(Parcel in) {
            return new FriendItem(in);
        }

        @Override
        public FriendItem[] newArray(int size) {
            return new FriendItem[size];
        }
    };
}
