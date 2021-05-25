package com.openclassrooms.realestatemanager.model;

import android.content.ContentValues;

import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.openclassrooms.realestatemanager.utils.DateConverter;

import java.util.Date;

@Entity(tableName = "realestate")
public class RealEstate {

    @PrimaryKey(autoGenerate = true)
    private long reEstateId;
    private String reEstateType;
    private float reEstatePrice;
    private int reEstateSurface;
    private int reEstateNbRooms;
    private int reEstateNbBedrooms;
    private int reEstateBathrooms;
    private String reEstateDescription;
    private int reEstateNbPhoto;
    private String reEstatePhotoDescription;
    private String reEstateAddress;
    private String reEstatePtInterest;
    private boolean reEstateIsSold;
    @Nullable
    private Date reEstateOnMarketDate;
    @Nullable
    private Date reEstateSaleDate;


    public RealEstate(){}

    public RealEstate(long reEstateId, String reEstateType, float reEstatePrice, int reEstateSurface,
                      int reEstateNbRooms, int reEstateNbBedrooms, int reEstateBathrooms,
                      String reEstateDescription, int reEstateNbPhoto, String reEstatePhotoDescription,
                      String reEstateAddress, String reEstatePtInterest, boolean reEstateIsSold,
                      @Nullable Date reEstateOnMarketDate, @Nullable Date reEstateSaleDate) {
        this.reEstateId = reEstateId;
        this.reEstateType = reEstateType;
        this.reEstatePrice = reEstatePrice;
        this.reEstateSurface = reEstateSurface;
        this.reEstateNbRooms = reEstateNbRooms;
        this.reEstateNbBedrooms = reEstateNbBedrooms;
        this.reEstateBathrooms = reEstateBathrooms;
        this.reEstateDescription = reEstateDescription;
        this.reEstateNbPhoto = reEstateNbPhoto;
        this.reEstatePhotoDescription = reEstatePhotoDescription;
        this.reEstateAddress = reEstateAddress;
        this.reEstatePtInterest = reEstatePtInterest;
        this.reEstateIsSold = reEstateIsSold;
        this.reEstateOnMarketDate = reEstateOnMarketDate;
        this.reEstateSaleDate = reEstateSaleDate;
    }
    public static RealEstate fromContentValues(ContentValues values){
        final RealEstate realEstate = new RealEstate();
        if (values.containsKey("reEstateId")) realEstate.setReEstateId(values.getAsLong("reEstateId"));
        if (values.containsKey("reEstateType")) realEstate.setReEstateType(values.getAsString("reEstateType"));
        if (values.containsKey("reEstatePrice")) realEstate.setReEstatePrice(values.getAsInteger("reEstatePrice"));
        if (values.containsKey("reEstateSurface")) realEstate.setReEstateSurface(values.getAsInteger("reEstateSurface"));
        if (values.containsKey("reEstateNbRooms")) realEstate.setReEstateNbRooms(values.getAsInteger("reEstateNbRooms"));
        if (values.containsKey("reEstateNbBedrooms")) realEstate.setReEstateNbBedrooms(values.getAsInteger("reEstateNbBedrooms"));
        if (values.containsKey("reEstateNbBathrooms")) realEstate.setReEstateBathrooms(values.getAsInteger("reEstateNbBathrooms"));
        if (values.containsKey("reEstateDescription")) realEstate.setReEstateDescription(values.getAsString("reEstateDescription"));
        if (values.containsKey("reEstateIsSold")) realEstate.setReEstateIsSold(values.getAsBoolean("reEstateIsSold"));
        if (values.containsKey("reEstateSaleDate")) realEstate.setReEstateSaleDate(DateConverter.toDate(values.getAsLong("reEstateSaleDate")));
        if (values.containsKey("reEstateOnMarketDate")) realEstate.setReEstateOnMarketDate(DateConverter.toDate(values.getAsLong("reEstateOnMarketDate")));
        if (values.containsKey("reEstatePhotos")) realEstate.setReEstateNbPhoto(values.getAsInteger("reEstateNbPhoto"));
        return realEstate;
    }
    public RealEstate(String reEstateType, float reEstatePrice, int reEstateSurface, int reEstateNbRooms,
                      int reEstateNbBedrooms, int reEstateBathrooms, String reEstateDescription,
                      int reEstateNbPhoto, String reEstatePhotoDescription, String reEstateAddress,
                      String reEstatePtInterest, boolean reEstateIsSold, @Nullable Date reEstateOnMarketDate,
                      @Nullable Date reEstateSaleDate) {
        this.reEstateType = reEstateType;
        this.reEstatePrice = reEstatePrice;
        this.reEstateSurface = reEstateSurface;
        this.reEstateNbRooms = reEstateNbRooms;
        this.reEstateNbBedrooms = reEstateNbBedrooms;
        this.reEstateBathrooms = reEstateBathrooms;
        this.reEstateDescription = reEstateDescription;
        this.reEstateNbPhoto = reEstateNbPhoto;
        this.reEstatePhotoDescription = reEstatePhotoDescription;
        this.reEstateAddress = reEstateAddress;
        this.reEstatePtInterest = reEstatePtInterest;
        this.reEstateIsSold = reEstateIsSold;
        this.reEstateOnMarketDate = reEstateOnMarketDate;
        this.reEstateSaleDate = reEstateSaleDate;

    }




    public long getReEstateId() {
        return reEstateId;
    }

    public void setReEstateId(long reEstateId) {
        this.reEstateId = reEstateId;
    }

    public String getReEstateType() {
        return reEstateType;
    }

    public void setReEstateType(String reEstateType) {
        this.reEstateType = reEstateType;
    }

    public float getReEstatePrice() {
        return reEstatePrice;
    }

    public void setReEstatePrice(float reEstatePrice) {
        this.reEstatePrice = reEstatePrice;
    }

    public int getReEstateSurface() {
        return reEstateSurface;
    }

    public void setReEstateSurface(int reEstateSurface) {
        this.reEstateSurface = reEstateSurface;
    }

    public int getReEstateNbRooms() {
        return reEstateNbRooms;
    }

    public void setReEstateNbRooms(int reEstateNbRooms) {
        this.reEstateNbRooms = reEstateNbRooms;
    }

    public int getReEstateNbBedrooms() {
        return reEstateNbBedrooms;
    }

    public void setReEstateNbBedrooms(int reEstateNbBedrooms) {
        this.reEstateNbBedrooms = reEstateNbBedrooms;
    }

    public int getReEstateBathrooms() {
        return reEstateBathrooms;
    }

    public void setReEstateBathrooms(int reEstateBathrooms) {
        this.reEstateBathrooms = reEstateBathrooms;
    }

    public String getReEstateDescription() {
        return reEstateDescription;
    }

    public void setReEstateDescription(String reEstateDescription) {
        this.reEstateDescription = reEstateDescription;
    }

    public int getReEstateNbPhoto() {
        return reEstateNbPhoto;
    }

    public void setReEstateNbPhoto(int reEstateNbPhoto) {
        this.reEstateNbPhoto = reEstateNbPhoto;
    }

    public String getReEstatePhotoDescription() {
        return reEstatePhotoDescription;
    }

    public void setReEstatePhotoDescription(String reEstatePhotoDescription) {
        this.reEstatePhotoDescription = reEstatePhotoDescription;
    }

    public String getReEstateAddress() {
        return reEstateAddress;
    }

    public void setReEstateAddress(String reEstateAddress) {
        this.reEstateAddress = reEstateAddress;
    }

    public String getReEstatePtInterest() {
        return reEstatePtInterest;
    }

    public void setReEstatePtInterest(String reEstatePtInterest) {
        this.reEstatePtInterest = reEstatePtInterest;
    }

    public boolean isReEstateIsSold() {
        return reEstateIsSold;
    }

    public void setReEstateIsSold(boolean reEstateIsSold) {
        this.reEstateIsSold = reEstateIsSold;
    }

    @Nullable
    public Date getReEstateOnMarketDate() {
        return reEstateOnMarketDate;
    }

    public void setReEstateOnMarketDate(@Nullable Date reEstateOnMarketDate) {
        this.reEstateOnMarketDate = reEstateOnMarketDate;
    }

    @Nullable
    public Date getReEstateSaleDate() {
        return reEstateSaleDate;
    }

    public void setReEstateSaleDate(@Nullable Date reEstateSaleDate) {
        this.reEstateSaleDate = reEstateSaleDate;
    }

}
