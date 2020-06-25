package com.example.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }


    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int mimageResourceId,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        imageResourceId=mimageResourceId;
        mAudioResourceId=audioResourceId;
    }
    public boolean hasImage()
    {
        return imageResourceId!=NO_IMAGE_PROVIDED;
    }

}

