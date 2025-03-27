package com.bridgelabz.resumescreeningsystem;

public class DataScientist extends JobRole {
    private String preferredTool;

    public DataScientist(String candidateName, int experienceYears, String preferredTool) {
        super(candidateName, experienceYears);
        this.preferredTool = preferredTool;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Data Scientist Candidate: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Preferred Tool: " + preferredTool);
    }
}

