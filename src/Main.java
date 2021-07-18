import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
    

    Doctor myDoctor = new Doctor("Ximena Valerio", "ximenava@dav.com");
    myDoctor.addAvailableAppointment(new Date(), "4:00");
    myDoctor.addAvailableAppointment(new Date(), "10:00 am");
    myDoctor.addAvailableAppointment(new Date(), "1:00 pm");

    System.out.println(myDoctor);

    User user = new Doctor("Dolores", "Dolores@hosangeles.com");
    user.showDataUser();

    User userPa = new Patient("Cuasimodo", "Cuasimodo@fotos.com");
    userPa.showDataUser();
    /*
    for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
        System.out.println(aA.getDate() + "  " + aA.getTime());
    }
    */
    

    Patient patient = new Patient("Erik Ramirez", "eramirez@accenture.com");
        System.out.println(patient);

    }

}