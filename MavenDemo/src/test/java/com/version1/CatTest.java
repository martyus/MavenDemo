package com.version1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CatTest {

    Cat cat;

    @Test
    public void testNameLongEnough(){
        try {
            cat = new Cat("Martina");
            assertTrue(cat.getName().equals("Martina"));
        }catch(NameTooShortException e){
            fail("The Exception should not have been raised!!");
        }

    }

    @Test
    public void testNameNotLongEnough(){
        try {
            cat = new Cat("AB");

        }catch(NameTooShortException e){
            assertTrue(e.getName().equals("AB"));
        }
    }

    @Test(expected = NameTooShortException.class)
    public void testNameTooShortRaisesException() throws NameTooShortException{
        cat = new Cat("AB");
    }
}
