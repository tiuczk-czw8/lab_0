package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> myArray = new ArrayList<>(value.length());
        myArray.add(value);
        for (int i = 1; i<value.length();i++)
        {
            myArray.add("Ram");
        }
        myArray.add("");
        return myArray;
    }

}
