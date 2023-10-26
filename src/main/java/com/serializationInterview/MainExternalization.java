package com.serializationInterview;

import java.io.*;

public class MainExternalization
{

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        EmployeeExternalization e = new EmployeeExternalization();
        e.setId(10);
        e.setName(20);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\Downloads\\SerializationInterview\\SerializedFile\\CodeDecode.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);

        fos.close();
        oos.close();

        System.out.println("Completed");


        //Deserialization

        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Downloads\\SerializationInterview\\SerializedFile\\CodeDecode.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        EmployeeExternalization ef = (EmployeeExternalization) ois.readObject();

        fis.close();
        ois.close();

        System.out.println(ef.getName());
        System.out.println(ef.getId());



    }

}
