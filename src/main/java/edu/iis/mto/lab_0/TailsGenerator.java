package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> tailsList = new ArrayList<>();
        int emptyList = 0;
        int deleteFirstLetter = 1;
        tailsList.add(value);
        while (value.length() > emptyList) {
            value = value.substring(0, value.length() - deleteFirstLetter);
            tailsList.add(value);
        }
        return tailsList;
    }

}
