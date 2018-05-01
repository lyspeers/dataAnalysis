package com.company;


import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        data test = new data(new File("Apps For Teachers (Responses) - Form Responses 1.tsv"));
        ArrayList<String[]> test1 = test.getList();
        test1 = data.sortBySchool(test1, "Public");
        for (int i = 0;i<test1.size();i++){
            System.out.println(test1.get(i)[5]);
            System.out.println(test1.get(i)[6]);
            System.out.println(" ");
        }
        data.writeFile(test1);

    }
}
