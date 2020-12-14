package com.example.miwokapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String defaultTranslation,String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;

    }

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceID){
        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceID=imageResourceID;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceID(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID!=NO_IMAGE_PROVIDED;
    }


}
