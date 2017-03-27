package com.example.halimk.contactsapplication;

import java.io.Serializable;

/**
 * Created by HalimK on 1/1/2017.
 */

public class Contact implements Serializable {

    private String mName, mEmail, mNumber;
    private int mImgId;

    public int getImgId() {
        return mImgId;
    }

    public void setImgId(int mImgId) {
        this.mImgId = mImgId;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public Contact(String mEmail, String mName, String mNumber, int mImgId) {
        this.mEmail = mEmail;
        this.mName = mName;
        this.mNumber = mNumber;
        this.mImgId = mImgId;

    }
}
