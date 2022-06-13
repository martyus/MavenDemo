package com.version1;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            Cat cat = new Cat("AB");
        }catch (NameTooShortException e){
            System.out.println(e.getMessage());
            System.out.println("This name is not okay " + e.getName());
        }

//        try {
//            myMethod();
//        }catch(MalformedURLException e ){
//            System.out.println(e.getMessage());
//        }



    }

    public static void myMethod() throws MalformedURLException{
        URL url;
        url = new URL("https://version1.co.uk");
        //InputStream is = url.openStream();
        System.out.println("Martina");

    }
}
