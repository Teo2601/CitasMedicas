package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome"+ UIMenu.doctorLogged.getName());
            System.out.println("1. add Available Appointmen");
            System.out.println("2. My Schefuled appointments");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;


            }

        }while (response !=0);
    }
    private static void showaddAvailableAppointmensMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select A Month");
            for (int i = 0; i < 3; i++) {
                int j = i+1;// Incremento de Meses
                System.out.println(j + ". " + UIMenu.MESES[i]);
            }
            System.out.println("0.Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4){ //Cumplir con la logica de la enumeracion de los meses
               int monthSelected = response;
                System.out.println(monthSelected+". " +UIMenu.MESES[monthSelected]);
                System.out.println("Insert the date available [dd/mm/yyyy]");
                String date= sc.nextLine();
                System.out.println("Your date is:" + date+ "\n1. Correct \n2. change Date");

            } else if (response==0) {
                showDoctorMenu();

            }


        }while (response != 0);

    }
}
