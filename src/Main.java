import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
    

    Doctor myDoctor = new Doctor("Ximena Valerio", "ximenava@dav.com");
    myDoctor.addAvailableAppointment(new Date(), "4:00");
    myDoctor.addAvailableAppointment(new Date(), "10:00 am");
    myDoctor.addAvailableAppointment(new Date(), "1:00 pm");

        System.out.println(myDoctor);
    /*
    for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
        System.out.println(aA.getDate() + "  " + aA.getTime());
    }
    */
    

    Patient patient = new Patient("Erik Ramirez", "eramirez@accenture.com");
        System.out.println(patient);

    }

}