
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee employee;
        FileInputStream fileInputStream = new FileInputStream("/home/user/Documents/File/Char.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        employee=(Employee)objectInputStream.readObject();

        System.out.println("DeSerialized");
        System.out.println("Name " + employee.name);
        System.out.println("Address " + employee.address);

        objectInputStream.close();
    }
}
