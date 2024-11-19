package Filter;

import Model.Applicant;

public class InterviewFilter implements AdmissionFilter {
    @Override
    public boolean apply(Applicant applicant) {
        if (applicant.isTestPassed() && applicant.getInterviewScore() >= 70) {
            applicant.addStatus("Cleared Interview");
            return true; // Continue to the merit list
        } else {
            applicant.addStatus("Failed Interview");
            return false; // Stop further processing
        }
    }
}
