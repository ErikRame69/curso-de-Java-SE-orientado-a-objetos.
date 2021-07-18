public class Patient {

    int id = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    String blood;
    
    public Patient(String name, String email ){
        this.name = name;
        this.email = email;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + "KG.";
    }

    //==============================================================
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //==============================================================
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //==============================================================
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //==============================================================
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //==============================================================
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length()>8){
            System.out.println("El numero ingresado debe de ser de 8 digitos");
        }
        else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
            System.out.println(phoneNumber);
        }
    }

    //==============================================================
    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    //==============================================================
    public String getHeight() {
        return height +  " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //==============================================================
    public String getBlood() {
        return this.blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }



        
    
}
