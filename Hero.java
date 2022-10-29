package com.dicoding.picodiploma.mylistview;

import android.os.Parcel;
import android.os.Parcelable;

class Hero implements Parcelable {
private int photo;
private String name;
private String description;

public Hero(){

}
    protected Hero(Parcel in) {
        photo = in.readInt();
        name = in.readString();
        description = in.readString();
    }

    public static final Creator<Hero> CREATOR = new Creator<Hero>() {
        @Override
        public Hero createFromParcel(Parcel in) {
            return new Hero(in);
        }

        @Override
        public Hero[] newArray(int size) {
            return new Hero[size];
        }
    };

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
       this.photo = photo;
       }

    public String getName() {
       return name;
       }

    public void setName(String name) {
         this.name = name;
      }

    public String getDescription() {
        return description;
      }

    public void setDescription(String description) {
        this.description = description;
      }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(photo);
        parcel.writeString(name);
        parcel.writeString(description);
    }
}