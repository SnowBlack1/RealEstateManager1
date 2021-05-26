package com.openclassrooms.realestatemanager.repositories;

import com.openclassrooms.realestatemanager.database.dao.AgentDao;
import com.openclassrooms.realestatemanager.model.Agent;

public class AgentRepository {

    private final AgentDao mAgentDao;

    public AgentRepository(AgentDao agentDao){
        mAgentDao = agentDao;
    }

    public long insertAgent(Agent agent){
        return mAgentDao.insertAgent(agent);
    }

    public int updateAgent(Agent agent){
        return mAgentDao.updateAgent(agent);
    }

    public int deleteAgent(Agent agent){
        return mAgentDao.deleteAgent(agent);
    }
}
