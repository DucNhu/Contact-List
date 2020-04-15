package caseStudy;

public class contact {
    private  String name;
//    private String name;
    private String phone;

    //    Constructor

    public contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return name +", " + phone;
    }
}
