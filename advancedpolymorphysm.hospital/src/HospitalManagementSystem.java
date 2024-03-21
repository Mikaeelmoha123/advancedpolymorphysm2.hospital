
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient = new Patient();

        try {
            patient.setAge(27);
            System.out.println("Patient's age set successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            patient.setAge(132);
            System.out.println("Patient's age set successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
