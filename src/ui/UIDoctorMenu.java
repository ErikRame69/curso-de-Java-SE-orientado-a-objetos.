package ui;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome" + UiMenu.doctorLogged.getName();
            System.out.println("1. Add Available");
            System.out.println("2. My Schedule Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UiMenu.showMenu();
                    break;
            }

        } while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UiMenu.MONTHS[i];
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4){
                int monthSelected = response;
                System.out.println(monthSelected +" . "+UiMenu.MONTHS[monthSelected]);
                System.out.println("Insert the day available: [dd/mm/aaaa]");
                String date = sc.nextLine();

                System.out.println("Your date is: " +date+"\n1. Correct \n2.Change Date");
                
            }
            else if (response == 0){
                showDoctorMenu();
            }
            
        }while (response != 0);
    }
}
