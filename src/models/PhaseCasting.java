package src.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhaseCasting {
    private int phaseNumber;
    private Date startDate;
    private String phaseId;
    private List<IndividualTest> tests;

    public PhaseCasting() {}

    public PhaseCasting(int phaseNumber, Date startDate, String phaseId) {
        this.phaseNumber = phaseNumber;
        this.startDate = startDate;
        this.phaseId = phaseId;
        this.tests = new ArrayList<IndividualTest>();
    }

    public PhaseCasting(int phaseNumber, Date startDate, String phaseId, List<IndividualTest> tests) {
        this.phaseNumber = phaseNumber;
        this.startDate = startDate;
        this.phaseId = phaseId;
        this.tests = tests;
    }

    public int getPhaseNumber() {
        return this.phaseNumber;
    }

    public void setPhaseNumber(int phaseNumber) {
        this.phaseNumber = phaseNumber;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPhaseId() {
        return this.phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
    }

    public List<IndividualTest> getTests() {
        return this.tests;
    }

    public void setTests(List<IndividualTest> tests) {
        this.tests = tests;
    }
}
