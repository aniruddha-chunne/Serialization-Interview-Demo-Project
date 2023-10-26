package com.serializationInterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@SpringBootApplication
public class SerializationInterviewApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SerializationInterviewApplication.class, args);
		System.out.println(" Serialization and De-Serialization Interview Project ");

		// https://docs.google.com/document/d/1ZIU-1r2RgiJp09iy0kU0KB8vc1mSl4-9HqGD-VJp8PA/edit
		//https://youtu.be/nUFoDfGl1II?si=FTqpDfn2kiRQ7WJ4

	}

}
