package uaslp.enginering.exam.model;

public class Guest {
    private String name;
    private String add;
    private String conty;
    private String num;

    public void setName(String name) {
        this.name=name;
    }

    public void setAddress(String add) {
        this.add=add;
    }

    public void setCountry(String conty) {
        this.conty=conty;
    }

    public void setPhoneNumber(String num) {
        this.num=num;
    }

    public String getName() {
        return(name);
    }
}
