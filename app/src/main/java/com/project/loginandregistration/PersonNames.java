package com.project.loginandregistration;

import android.os.Parcel;
import android.os.Parcelable;

public class PersonNames implements Parcelable {
    private String name;

    public PersonNames(Parcel in) {
        name = in.readString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonNames(String name) {
        this.name = name;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PersonNames> CREATOR = new Creator<PersonNames>() {
        @Override
        public PersonNames createFromParcel(Parcel in) {
            return new PersonNames(in);
        }

        @Override
        public PersonNames[] newArray(int size) {
            return new PersonNames[size];
        }
    };
}