package lesson_7.additionaltask1;

public class Patient {
    private final String name;
    private final TreatmentPlan plan;

    public Patient(String name, TreatmentPlan plan) {
        this.name = name;
        this.plan = plan;
    }

    public void assignDoctorAndTreat() {
        Doctor doctor = switch (plan.getCode()) {
            case 1 -> new Surgeon();
            case 2 -> new Dentist();
            default -> new Therapist();
        };

        System.out.println("Patient: " + name);
        doctor.treat();
    }
}
