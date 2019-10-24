package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList newList = new ArrayList();
        for (int i = 0; i < value.length() + 1; i++) {
            newList.add(value.substring(i));
        }
        return newList;
    }

}
