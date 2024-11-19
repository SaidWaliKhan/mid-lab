package Filter;

import Model.Applicant;

public class TestFilter implements AdmissionFilter {
    @Override
    public boolean apply(Applicant applicant) {
        if (applicant.isEligible() && applicant.getTestScore() >= 60) {
            applicant.addStatus("Passed Test");
            return true; // Continue to the next filter
        } else {
            applicant.addStatus("Failed Test");
            return false; // Stop further processing
        }
    }
}
