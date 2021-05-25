package com.openclassrooms.realestatemanager.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.openclassrooms.realestatemanager.database.dao.AgentDao;
import com.openclassrooms.realestatemanager.database.dao.RealEstateDao;
import com.openclassrooms.realestatemanager.model.Agent;
import com.openclassrooms.realestatemanager.model.RealEstate;
import com.openclassrooms.realestatemanager.utils.DateConverter;

@Database(entities = {RealEstate.class, Agent.class}, version = 2, exportSchema = false)
@TypeConverters({DateConverter.class})
public abstract class RealEstateDatabase extends RoomDatabase {

    private static RealEstateDatabase INSTANCE;
    public abstract RealEstateDao mRealEstateDao();
    public abstract AgentDao mAgentDao();

    public static RealEstateDatabase getInstance(Context pContext) {
        if (INSTANCE == null) {
            synchronized (RealEstateDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(pContext.getApplicationContext(),
                            RealEstateDatabase.class, "RealEstate.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
