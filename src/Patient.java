public class Patient extends User{

    private String birthday;
    private double weight;
    private double height;
    private String blood;
    
    public Patient(String name, String email){
        super(name,email);
    }

    //==============================================================
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + "KG.";
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
