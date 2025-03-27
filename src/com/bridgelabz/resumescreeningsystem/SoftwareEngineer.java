package com.bridgelabz.resumescreeningsystem;


public class SoftwareEngineer extends JobRole {
    private String programmingLanguage;

    public SoftwareEngineer(String candidateName, int experienceYears, String programmingLanguage) {
        super(candidateName, experienceYears);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Software Engineer Candidate: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Main Language: " + programmingLanguage);
    }
}
