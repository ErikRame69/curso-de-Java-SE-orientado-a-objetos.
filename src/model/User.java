package model;

public abstract class User {
    private int id = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        if (phoneNumber.length()>8){
            System.out.println("El numero ingresado debe de ser de 8 digitos");
        }
        else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
            System.out.println("Numero del paciente: " + phoneNumber);
        }
    }

    @Override
    public String toString() {
        return  "\n name: " + name +
                "\n email: " + email +
                "\n address: " + address +
                "\n phoneNumber: " + phoneNumber;
    }

    public abstract void showDataUser();
}
 