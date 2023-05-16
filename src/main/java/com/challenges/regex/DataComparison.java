/*
Task
Consider a database table, Emails, which has the attributes First Name and Email ID.
Given N rows of data simulating the Emails table, print an alphabetically-ordered list
of people whose email address ends in @gmail.com .
 */

package com.challenges.regex;

import java.util.*;

public class DataComparison {

    public List<String> execute(HashMap<String, String> data) {

        List<String> names = new ArrayList<>();

        for(String key : data.keySet()){
            if(key.contains("@gmail.com")){
                names.add(data.get(key));
            }
        }

        Collections.sort(names);
        return names;
    }
}
