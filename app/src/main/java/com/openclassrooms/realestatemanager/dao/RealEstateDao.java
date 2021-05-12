package com.openclassrooms.realestatemanager.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import model.RealEstate;

@Dao
public interface RealEstateDao {

    @Query("SELECT * FROM RealEstate")
    LiveData<List<RealEstate>> getAllRealEstates();

    @Insert
    long insertRealEstate(RealEstate realEstate);

    @Update
    int updateRealEstate(RealEstate realEstate);

    @Delete
    int deleteRealEstate(RealEstate realEstate);
}
