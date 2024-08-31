package src.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndividualTest {
    private int number;
    private Date date;
    private String room;
    private String description;
    private List<Candidate> candidates;

    public IndividualTest(int number, Date date, String room, String description) {
        this.number = number;
        this.date = date;
        this.room = room;
        this.description = description;
        this.candidates = new ArrayList<Candidate>();
    }

    public IndividualTest(int number, Date date, String room, String description, List<Candidate> candidates) {
        this.number = number;
        this.date = date;
        this.room = room;
        this.description = description;
        this.candidates = candidates;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRoom() {
        return this.room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addCandidate(Candidate candidate) {
        this.candidates.add(candidate);
    }

    public List<Candidate> getCandidates() {
        return this.candidates;
    }
}
