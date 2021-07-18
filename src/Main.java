import static ui.UiMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
    

    Doctor myDoctor = new Doctor("Ximena Valerio", "Psicoanalista");
    myDoctor.addAvailableAppointment(new Date(), "4:00");
    myDoctor.addAvailableAppointment(new Date(), "10:00 am");
    myDoctor.addAvailableAppointment(new Date(), "1:00 pm");
   
    for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
        System.out.println(aA.getDate() + "  " + aA.getTime());
    }

    Patient patient = new Patient("Erik Ramirez", "eramirez@accenture.com");
    patient.setWeight(65);
    System.out.println( patient.getWeight());

    patient.setPhoneNumber("55404458");

    }
}