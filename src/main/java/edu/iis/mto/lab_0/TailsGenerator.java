package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> tailsList = new ArrayList<>();
        tailsList.add(value);
        while (value.length() > 0) {
            value = value.substring(0, value.length() - 1);
            tailsList.add(value);
        }
        return tailsList;
    }

}
