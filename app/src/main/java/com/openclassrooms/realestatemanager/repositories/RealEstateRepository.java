package com.openclassrooms.realestatemanager.repositories;

import com.openclassrooms.realestatemanager.database.dao.RealEstateDao;
import com.openclassrooms.realestatemanager.model.RealEstate;

public class RealEstateRepository {

    private final RealEstateDao reEstateDao;

    public RealEstateRepository(RealEstateDao mRealEstateDao) {
        reEstateDao = mRealEstateDao;
    }

    public long insertRealEstate(RealEstate mRealEstate){
        return reEstateDao.insertRealEstate(mRealEstate);
    }

    public int updateRealEstate(RealEstate mRealEstate){
        return reEstateDao.updateRealEstate(mRealEstate);
    }

    public long deleteRealEstate(RealEstate mRealEstate){
        return reEstateDao.deleteRealEstate(mRealEstate);
    }
}
