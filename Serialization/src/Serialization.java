import java.io.*;


public class Serialization {

    public static void main(String[] args) throws IOException {
        Employee emp =new Employee();
        emp.name="Ama";
        emp.address="Kandy";



        try{

            FileOutputStream fileOut= new FileOutputStream("/home/user/Documents/File/Char.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.println("Serialized");


        }
        catch (IOException e){
            e.printStackTrace();
        }

//        FileReader fileReader = new FileReader("/usr/desktop");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//        while ((line=bufferedReader.readLine())!=null){
//            System.out.println(line);
//        }
//        bufferedReader.close();
    }

}
