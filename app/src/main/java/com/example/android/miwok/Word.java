package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mMusicFile;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    public Word(String MiwokTranslation,String DefaultTranslation,int MusicFile)
    {
        mMiwokTranslation=MiwokTranslation;
        mDefaultTranslation=DefaultTranslation;
        mMusicFile=MusicFile;
    }
    public Word(String MiwokTranslation,String DefaultTranslation,int ImageResourceID,int MusicFile)
    {
        mMiwokTranslation=MiwokTranslation;
        mDefaultTranslation=DefaultTranslation;
        mImageResourceId=ImageResourceID;
        mMusicFile=MusicFile;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMiwokranTslation()
    {
        return mMiwokTranslation;
    }
    public int getImageResourceId(){ return mImageResourceId;}
    public boolean hasImage(){return mImageResourceId!=NO_IMAGE_PROVIDED;}
    public int getmMusicFile(){return mMusicFile;}

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMusicFile=" + mMusicFile +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
