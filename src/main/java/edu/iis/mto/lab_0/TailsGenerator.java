package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

import java.util.Collections;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> myList = new ArrayList<>(Collections.nCopies(value.length() + 1, ""));
        myList.set(0, value);
        return myList;
    }

}
