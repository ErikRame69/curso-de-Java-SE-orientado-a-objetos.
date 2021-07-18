import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
    

    Doctor myDoctor = new Doctor("Ximena Valerio", "Psicoanalista");
    System.out.println(myDoctor.name);
    System.out.println(myDoctor.speciality);

    Patient patient = new Patient("Erik Ramirez", "eramirez@accenture.com");
    patient.setWeight(65);
    System.out.println( patient.getWeight());

    patient.setPhoneNumber("55404458");
    //System.out.println(patient.getPhoneNumber());

    }
}