import model.*;

import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        showMenu();

    }



}




/*model.Doctor myDoctor = new model.Doctor();*/ //Metodo constructor



       /* Doctor mydoctor = new Doctor("Mateo Siachoque Passos", "mateo@mateo.com"); //Metodo constructor
        mydoctor.addAvailableAppointment(new Date(), "4pm");
        mydoctor.addAvailableAppointment(new Date(), "10am");
        mydoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(mydoctor);
        User user = new Doctor("Mateo", "teo@gmail.com");
        user.showDataUser();
        User userpa = new patient("Mateo", "teo@gmail.com");
        userpa.showDataUser();
        User user1 = new User("mateo", "Mateo@outlook.es") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz verde");
                System.out.println("Departamento: Geriatria");

            }
        };
        user1.showDataUser();
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void shedule(Date date, String time) {

            }
        };

        /*
        for (model.Doctor.AvailableAppointment availableAppointment : mydoctor.getAvailableAppointment()) { // Mostrar citas disponibles que el doctor tiene
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/
       /* System.out.println();
        System.out.println();
        patient patient= new patient("alejandra", "alejandra@gamil.com");
        System.out.println(patient);*/









