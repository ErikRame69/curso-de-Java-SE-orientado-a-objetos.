import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
    

    Doctor myDoctor = new Doctor("Ximena Valerio", "Psicoanalista");
    System.out.println(myDoctor.name);
    System.out.println(myDoctor.speciality);

    Patient patient = new Patient("Erik Ramirez", "eramirez@accenture.com");
    System.out.println(patient.name + "  " + patient.email);
    
    patient.weight = 63.3;
    patient.height = 1.71;

    System.out.println(patient.weight);
    System.out.println(patient.height);

    patient.weight = 60;
    patient.name = "Abelardo Jimeno";

    System.out.println(patient.weight);
    System.out.println(patient.name);


    }
}