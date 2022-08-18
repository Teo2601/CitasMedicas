package model;

public abstract class User {  //Super Clase
    private int id;
    private  String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) { // Metodo constructor
        this.name = name;   // asignacion de variables
        this.email = email;
    }

    public int getId() { // get accediendo al  dato de la variable
        return id;
    }

    public void setId(int id) { // set poner  el valor a la variable
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("El número telefonico debe ser de 8 digitos ");
        } else if (phoneNumber.length() == 8) {

        }
    }
    //Aplicacion sobrescritura
    @Override //Este metodo no es propio de la clase user, es un metod extraido de la super clase padre
    public String toString() {
        return "model.User: "+ name + ",Email: "+email+
                "\nAddreess: "+address+".Phone: "+phoneNumber;

    }
    public abstract void showDataUser ();
}
