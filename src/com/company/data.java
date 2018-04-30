package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by ls059 on 4/30/18.
 */
public class data {

    private ArrayList<String[]> sorted = new ArrayList<>();
    public data (File data){
        try {
            FileReader gather = new FileReader(data);
            BufferedReader info= new BufferedReader(gather);
            String line = null;
            int count = 0;
            while((line = info.readLine())!= null){
                sorted.add(count, line.split("\t"));
            }
        }catch(FileNotFoundException e){
            System.out.println("The File you were looking for could not be found");
        }catch(IOException e){
            System.out.println("Oops there was an IOException");
        }
    }

    public static ArrayList<String[]> sortByProblem(ArrayList<String[]> data){
        return data;
    }public static ArrayList<String[]> sortByGrade(ArrayList<String[]> data){
        return data;
    }public static ArrayList<String[]> sortBySetting(ArrayList<String[]> data){
        return data;
    }public static ArrayList<String[]> sortBySchool(ArrayList<String[]> data){
        return data;
    }
}
