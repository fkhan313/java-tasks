package io;

import java.io.*;
import java.util.Properties;

public class PropertiesClassExample {

    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("config.properties");
        //write to properties file
        p.setProperty("url", "https://www.google.com/");
        p.setProperty("username", "khan313");
        p.setProperty("password","test1234");
        p.store(os, null);
        System.out.println("Properties file created !");

        //read from properties file
        InputStream is = new FileInputStream("config.properties");
        p.load(is);
        //System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        
        //print all properties
        //p.list(System.out);


    }





}
