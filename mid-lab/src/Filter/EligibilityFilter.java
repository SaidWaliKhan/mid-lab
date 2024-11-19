package Filter;

import Model.Applicant;

public class EligibilityFilter implements AdmissionFilter {
    @Override
    public boolean apply(Applicant applicant) {
        if (applicant.getAge() >= 18 && applicant.getPreviousMarks() >= 50) {
            applicant.addStatus("Eligible");
            return true; // Continue to the next filter
        } else {
            applicant.addStatus("Not Eligible");
            return false; // Stop further processing
        }
    }
}
