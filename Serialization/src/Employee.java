import java.io.Serializable;

public class Employee implements Serializable{

    private static final long serialVersionUID =2L;
    public String name;
    public String address;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
