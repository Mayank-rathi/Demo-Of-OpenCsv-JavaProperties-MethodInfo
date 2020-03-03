package com.propertiesInJava;

import java.io.FileWriter;
import java.util.Properties;

public class CodeToCreatOwnProperties {
    public static void main(String[] args)throws Exception{

        Properties p=new Properties();
        p.setProperty("name","Mayank rathi");
        p.setProperty("email","mayankrathi33@gmail.com");

        p.store(new FileWriter("info.properties"),"Created By Own Properties Example");

    }
}
