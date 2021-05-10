package model;

import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

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
