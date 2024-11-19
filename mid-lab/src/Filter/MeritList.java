package Filter;

import Model.Applicant;

public class MeritList implements AdmissionFilter {
    @Override
    public boolean apply(Applicant applicant) {
        if (applicant.isInterviewCleared()) {
            applicant.addStatus("Selected for Merit List");
            return true;
        } else {
            applicant.addStatus("Not Selected for Merit List");
            return false;
        }
    }
}
