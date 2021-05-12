package com.openclassrooms.realestatemanager.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import model.Agent;

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
