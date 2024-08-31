package src.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import src.enums.CastingType;

public class Casting {
    private String code;
    private String name;
    private String description;
    private Date hiringDate;
    private double cost;
    private CastingType type; // "in-person" or "online"
    private List<PhaseCasting> phases;
    private CastingAgent agent;

    public Casting() {}

    public Casting(
        String code,
        String name,
        String description,
        Date hiringDate,
        double cost,
        CastingType type,
        CastingAgent agent
    ) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.hiringDate = hiringDate;
        this.cost = cost;
        this.type = type;
        this.phases = new ArrayList<PhaseCasting>();
        this.agent = agent;
    }

    public Casting(
        String code,
        String name,
        String description,
        Date hiringDate,
        double cost,
        CastingType type,
        List<PhaseCasting> phases,
        CastingAgent agent
    ) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.hiringDate = hiringDate;
        this.cost = cost;
        this.type = type;
        this.phases = phases;
        this.agent = agent;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getHiringDate() {
        return this.hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public CastingType getType() {
        return this.type;
    }

    public void setType(CastingType type) {
        this.type = type;
    }

    public List<PhaseCasting> getPhases() {
        return this.phases;
    }

    public void setPhases(List<PhaseCasting> phases) {
        this.phases = phases;
    }

    public CastingAgent getAgent() {
        return this.agent;
    }

    public void setAgent(CastingAgent agent) {
        this.agent = agent;
    }
}