package com.version1;

public class NameTooShortException extends Exception {

    private String name;

    public NameTooShortException(String message, String name){
        super(message);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
