package com.bridgelabz.resumescreeningsystem;

public class ProductManager extends JobRole {
    private String domainExpertise;

    public ProductManager(String candidateName, int experienceYears, String domainExpertise) {
        super(candidateName, experienceYears);
        this.domainExpertise = domainExpertise;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Product Manager Candidate: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Domain Expertise: " + domainExpertise);
    }
}

