package quanduong.com.demodatabinding.model;

public class MyContactModel {

    private String phone;
    private String name;

    public MyContactModel(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public MyContactModel() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
