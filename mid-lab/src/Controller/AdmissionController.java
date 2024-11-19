package Controller;

import Filter.AdmissionFilter;
import Model.Applicant;

import java.util.ArrayList;
import java.util.List;

public class AdmissionController {
    private final List<Applicant> applicants = new ArrayList<>();
    private final List<AdmissionFilter> filters = new ArrayList<>();

    public void addApplicant(Applicant applicant) {
        applicants.add(applicant);
    }

    public void addFilter(AdmissionFilter filter) {
        filters.add(filter);
    }

    public void processAdmissions() {
        for (Applicant applicant : applicants) {
            System.out.println("Processing Applicant: " + applicant.getName());
            boolean proceed = true;

            for (AdmissionFilter filter : filters) {
                if (!proceed) break;
                proceed = filter.apply(applicant); // Stop processing if a filter returns false
            }

            System.out.println("Final Status: " + applicant.getStatus() + "\n");
        }
    }
}
