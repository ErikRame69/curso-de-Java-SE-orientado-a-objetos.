import ui.UiMenu;

import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Ximena Valerio";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();

        UiMenu.showMenu();
    }
}