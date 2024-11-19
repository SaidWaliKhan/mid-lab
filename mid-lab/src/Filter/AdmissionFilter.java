package Filter;

import Model.Applicant;

public interface AdmissionFilter {
    boolean apply(Applicant applicant);
}
