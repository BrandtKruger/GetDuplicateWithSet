package com.kruger.brandt;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static private void getDuplicateName(String [] names){

        Set<String> store = new HashSet<>();

        for (String name:names) {
            if (store.add(name) == false){
                System.out.println("Find duplicate entry in array: " + name);
            }
        }
    }

    public static void main(String[] args) {

        String[] names = new String[]{"Java", "C++", "C#", "Java", "Perl", "Ruby"};

        getDuplicateName(names);
    }
}
