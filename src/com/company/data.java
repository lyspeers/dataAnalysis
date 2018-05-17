package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by ls059 on 4/30/18.
 */
public class data {

    private static File data;
    private static ArrayList<String[]> sorted = new ArrayList<>();
    public data (File data1){
        try {
            data = data1;
            FileReader gather = new FileReader(data);
            BufferedReader info= new BufferedReader(gather);
            String line = null;
            int count = 0;
            while((line = info.readLine())!= null){
                sorted.add(count, line.split("\t"));
                count++;
            }
        }catch(FileNotFoundException e){
            System.out.println("The File you were looking for could not be found");
        }catch(IOException e){
            System.out.println("Oops there was an IOException");
        }
    }

    public static ArrayList<String[]> getList(){return sorted;}


    @Override
    public boolean contains(CharSequence s, String c) {
        return c.indexOf(s.toString()) > -1 || c.indexOf(s.toString().toLowerCase()) > -1;
    }


    public static ArrayList<String[]> sortByProblem(ArrayList<String[]> data, String keyword){
        ArrayList<String[]> sorted = new ArrayList<>();
        for(int i = 0;i<data.size();i++){
            if(data.get(i)[5].contains(keyword))
                sorted.add(data.get(i));
        }
        return sorted;
    }
    public static ArrayList<String[]> sortByGrade(ArrayList<String[]> data, String keyword){
        ArrayList<String[]> sorted = new ArrayList<>();
        for(int i = 0;i<data.size();i++){
            if(data.get(i)[2].contains(keyword))
                sorted.add(data.get(i));
        }
        return sorted;
    }
    public static ArrayList<String[]> sortBySetting(ArrayList<String[]> data, String keyword){
        ArrayList<String[]> sorted = new ArrayList<>();
        for(int i = 0;i<data.size();i++){
            if(data.get(i)[3].contains(keyword))
                sorted.add(data.get(i));
        }
        return sorted;
    }
    public static ArrayList<String[]> sortBySchool(ArrayList<String[]> data, String keyword){
        ArrayList<String[]> sorted = new ArrayList<>();
        for(int i = 0;i<data.size();i++){
            if(data.get(i)[1].contains(keyword))
                sorted.add(data.get(i));
        }
        return sorted;
    }
    public static void writeFile(ArrayList<String[]> info){
        try {
            FileWriter write = new FileWriter("Sorted.txt");
            BufferedWriter work = new BufferedWriter(write);
            //int count= 0;
            for(int i = 0;i<info.size();i++) {
                work.write(info.get(i)[5]);
                //System.out.println("pro");
                work.write("\n");
                if((info.get(i).length > 6)  &&  !(info.get(i)[6].contains("@"))) {
                    work.write(info.get(i)[6]);
                    //System.out.println("hi");
                }
                work.write("\n");
                work.write("\n");
                //System.out.println(count);
            }work.close();
        }catch(FileNotFoundException e){
            System.out.println("You managed to not find a file you already accessed");
        }catch(IOException e) {
            System.out.println("oops its an IOException");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Out of Bounds happened");
        }

    }
}
