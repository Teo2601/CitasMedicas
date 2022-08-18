package ui;

import model.Doctor;
import model.patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    //// Variable Constante siempre va a mostar los mismo valores
    public static String [] MESES = {"Enero", "Febrero", "Marzo","Abril", "Mayo","Junio", "Julio","Agosto", "Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static patient patientLogged;
     public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response=0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
    ///////////////Simulando autenticacion
    private static void authUser (int userType) {
        //userType = 1 Doctor
        // userType = 2 Patient
        ArrayList<Doctor> doctors = new ArrayList<>();//Guarda y almacena objetos
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "kare@mail.com"));
        doctors.add(new Doctor("Rocío Gómez", "rocio@mail.com"));

        ArrayList<patient> patients = new ArrayList<>();//Guarda y almacena objetos
        patients.add(new patient("Anahí Salgado", "anahi@mail.com"));
        patients.add(new patient("Roberto Rodríguez", "roberto@mail.com"));
        patients.add(new patient("Carlos Sánchez", "carlos@mail.com"));
        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com] ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                    }

                    emailCorrect = true;
                    //Obtener el usuario logeado
                    doctorLogged = d;
                    //ShowDoctorMenu

                }
            }


            if (userType == 2) {
                for (patient p: patients){
                    if (p.getEmail().equals(email));
                    emailCorrect= true;
                    patientLogged=p;
                    //showPatientMenu
                }


            }
        } while (!emailCorrect);


    }

     static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + "." + MESES [i]);

                    }

                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

}
