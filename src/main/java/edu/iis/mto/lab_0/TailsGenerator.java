package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        ArrayList<String> tempList = new ArrayList<String>();
        for(int i = 0; i < value.length()+1; i++) {

            tempList.add(value.substring(i));
        }
        return tempList;
    }

}
