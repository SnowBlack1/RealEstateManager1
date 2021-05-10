package model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Arrays;
import java.util.List;

@Entity(tableName = "agent")
 public class Agent {

    @PrimaryKey(autoGenerate = true)
    private long agentId;
    private String agentLastName;
    private String agentFirstName;

    public List<Agent> mAgentList = Arrays.asList(
            new Agent(1,"Gardena","Felixan"),
            new Agent(2,"Paprika","Yaki"),
            new Agent(3,"Lilinen","Milkyway")
    );

    public Agent(long agentId, String agentLastName, String agentFirstName) {
        this.agentId = agentId;
        this.agentLastName = agentLastName;
        this.agentFirstName = agentFirstName;
    }


    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }

    public String getAgentLastName() {
        return agentLastName;
    }

    public void setAgentLastName(String agentLastName) {
        this.agentLastName = agentLastName;
    }

    public String getAgentFirstName() {
        return agentFirstName;
    }

    public void setAgentFirstName(String agentFirstName) {
        this.agentFirstName = agentFirstName;
    }

}
