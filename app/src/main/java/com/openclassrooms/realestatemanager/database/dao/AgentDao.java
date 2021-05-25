package com.openclassrooms.realestatemanager.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.openclassrooms.realestatemanager.model.Agent;

import java.util.List;

@Dao
public interface AgentDao {

    @Query("SELECT * FROM Agent")
    LiveData<List<Agent>> getAllAgents();

    @Insert
    long insertAgent(Agent agent);

    @Update
    int updateAgent(Agent agent);

    @Delete
    int deleteAgent(Agent agent);
}
