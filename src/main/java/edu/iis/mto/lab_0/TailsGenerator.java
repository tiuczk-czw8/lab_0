package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> list = new ArrayList<String>();
        list.add(value);
        
        while(value.length() >0) {
        	value = value.substring(1);
        	//System.out.println(value);
        	list.add(value);
        }
        return list;
    }

}
