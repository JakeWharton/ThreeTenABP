package com.jakewharton.threetenabp.sample;

import android.os.Parcel;
import android.os.Parcelable;

import org.threeten.bp.ZonedDateTime;

final class TestParcelable implements Parcelable {

    public static final Creator<TestParcelable> CREATOR = new Creator<TestParcelable>() {
        @Override
        public TestParcelable createFromParcel(Parcel source) {
            return new TestParcelable(source);
        }

        @Override
        public TestParcelable[] newArray(int size) {
            return new TestParcelable[size];
        }
    };

    final ZonedDateTime zonedDateTime;

    TestParcelable(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    private TestParcelable(Parcel in) {
        this((ZonedDateTime) in.readSerializable());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(zonedDateTime);
    }
}
