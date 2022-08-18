package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor  extends User{ // Subclase heredan atributos de la super clase model.User
    //Atributos

    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email){ //Metodo constructor
        super(name,email); //Del metodo constructor de la clase padre model.User
        System.out.println("El nombre del model.Doctor asignado es: " + name);
        this.speciality = speciality;  //// asignacion de variables
    }

    ArrayList<AvailableAppointment>AvailableAppointment = new ArrayList<>(); // se acumulan las citas en el Arraylist
    public void addAvailableAppointment (Date date, String time){ // Metodo que va a estar añadiendo citas
        AvailableAppointment.add(new Doctor.AvailableAppointment(date,time));

     }
     public ArrayList<AvailableAppointment> getAvailableAppointment(){ // Devuelve la lista completa de citas
        return AvailableAppointment;

     }
    //Sobrescribir

    @Override
    public String toString() { //Este metodo no es propio de la clase user, es un metod extraido de la super clase padre
        return super.toString()+ "\nSpeciality: "+speciality+ "\nAvailable: "  + AvailableAppointment.toString();// Se reutiliza el comportamiento que esta definido en la supérclase (model.User)
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    public static  class AvailableAppointment { // Clase anidada
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
        //Sobrescribir
        @Override //Este metodo no es propio de la clase user, es un metod extraido de la super clase padre
        public String toString() {
            return "Available Appointments \nDate: "+date+ "\nTime" + time; //Imprimir el titulo y los datos solicitados
        }
    }

}
