package lesson_7.additionaltask1;

public class Clinic {
    public static void main(String[] args) {
        Patient p1 = new Patient("Alex", new TreatmentPlan(1));
        Patient p2 = new Patient("Mari", new TreatmentPlan(2));
        Patient p3 = new Patient("Katy", new TreatmentPlan(3));

        p1.assignDoctorAndTreat();
        p2.assignDoctorAndTreat();
        p3.assignDoctorAndTreat();
    }
}
