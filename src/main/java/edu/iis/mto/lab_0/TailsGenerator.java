package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public List<String> tails(String value) {
		List<String> tails = new ArrayList<>(value.length());
                for(int i=0; i<value.length(); i++){
                    tails.add(value.substring(i, value.length()));
                }
		return tails;
	}
}