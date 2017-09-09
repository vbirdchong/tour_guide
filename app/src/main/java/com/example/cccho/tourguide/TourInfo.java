package com.example.cccho.tourguide;

/**
 * Created by cccho on 2017/9/8.
 */

public class TourInfo {

    private String mBaseTourInfo;
    private String mAdditionalInfo = NO_ADDITIONAL_INFO;
    private int mImageId = NO_IMAGE_RESOURCE;

    private static final int NO_IMAGE_RESOURCE = -1;
    private static final String NO_ADDITIONAL_INFO = null;

    public TourInfo(String baseInfo) {
        mBaseTourInfo = baseInfo;
    }

    public TourInfo(String baseInfo, String additionalInfo) {
        mBaseTourInfo = baseInfo;
        mAdditionalInfo = additionalInfo;
    }

    public TourInfo(String baseInfo, String additionalInfo, int imageId) {
        mBaseTourInfo = baseInfo;
        mImageId = imageId;
        mAdditionalInfo = additionalInfo;
    }

    public String getBaseTourInfo() {
        return mBaseTourInfo;
    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImageResource() {
        return mImageId != NO_IMAGE_RESOURCE;
    }

    public String getAdditionalInfo() {
        return mAdditionalInfo;
    }

    public boolean hasAdditionalInfo() {
        return mAdditionalInfo != NO_ADDITIONAL_INFO;
    }
}
