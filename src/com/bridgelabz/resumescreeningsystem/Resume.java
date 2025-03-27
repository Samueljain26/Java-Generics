package com.bridgelabz.resumescreeningsystem;


import java.util.List;


public class Resume<T extends JobRole> {
    private T candidateDetails;

    public Resume(T candidateDetails) {
        this.candidateDetails = candidateDetails;
    }

    public T getCandidateDetails() {
        return candidateDetails;
    }

    public void processResume() {
        candidateDetails.displayJobDetails();
    }
}


class ResumeScreeningUtils {
    public static void screenCandidates(List<? extends JobRole> candidates) {
        System.out.println("Screening Candidates:");
        for (JobRole candidate : candidates) {
            candidate.displayJobDetails();
        }
    }
}

