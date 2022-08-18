package model;

public class patient extends User{ // Subclase heredan atributos de la super clase model.User
    //Atributos
    int id;

    private String birthday; //encapsulamiento privado
    private double weight; //encapsulamiento privado
    private double height; //encapsulamiento privado
    private String blood; //encapsulamiento privado

    // asignar estos valores a las variables que estan de manera global
   public patient(String name, String email){
        super(name,email);//Del metodo constructor de la clase padre model.User
        ///////////////////////////////////////
        /*this.name = name;  //// asignacion de variables
        this.email= email;*/
    }
    ////////////////////////////
    public void setWeight (double weight){ // Set poner el dato a la variable
        this.weight = weight;
    }

    //////////////////////////////
    public String getweight(){      ///////get accedo al dato de la variable
        return this.weight + "Kg.";
    }
    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setPhoneNumber(String phoneNumber) {


    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }



    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    //Sobrescribir
    @Override //Este metodo no es propio de la clase user, es un metod extraido de la super clase padre
    public String toString() {
        return super.toString() + "\nAge: " +birthday+ "\n Weight" +getWeight()+ "\n Height"+getHeight()+ "\nBlood"+blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");

    }
}
