package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
    	List<String> list = new ArrayList<String>();
    	
    	list.add(value);
    	for(int i = 1; i <= value.length(); i++)
    	{
    		list.add(value.substring(i));
    	}
    	
        return list;
    }

}
