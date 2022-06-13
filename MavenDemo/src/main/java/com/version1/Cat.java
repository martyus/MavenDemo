package com.version1;

import java.io.IOException;

public class Cat {

    private String name;
    public Cat(String name) throws NameTooShortException{
        if(name.length() > 3 ){
            this.name = name;
        }else{
            throw new NameTooShortException("The name is too short!", name);
        }
    }

    public String getName() {
        return name;
    }
}
