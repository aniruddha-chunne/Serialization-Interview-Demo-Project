package com.serializationInterview;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("run");

        // https://docs.google.com/document/d/1ZIU-1r2RgiJp09iy0kU0KB8vc1mSl4-9HqGD-VJp8PA/edit
        //https://youtu.be/nUFoDfGl1II?si=FTqpDfn2kiRQ7WJ4

        // Serialize

        Employee e = new Employee();
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
        Employee ef = (Employee) ois.readObject();

        System.out.println(ef.getId());
        System.out.println(ef.getName());

        fis.close();
        ois.close();


    }
}
