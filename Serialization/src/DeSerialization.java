import java.io.*;

public class DeSerialization {

    public static void main(String[] args)throws IOException, ClassNotFoundException {

        Employee emp =null;


        try {
            FileInputStream filein = new  FileInputStream("/home/user/Documents/File/Char.txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            emp=(Employee) in.readObject();
            in.close();
            filein.close();
        }
        finally {
            System.out.println("DeSerialized");
            System.out.println("Name " + emp.name);
            System.out.println("Address " + emp.address);
        }




    }

}
