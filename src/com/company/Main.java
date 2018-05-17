package com.company;


import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] setting = {"Urban", "Suburban", "Rural"};
        String[] grade = {"High School", "Middle School", "Elementary"};
        String[] school = {"Private", "Public", "Charter"};
        data organize = new data(new File("Apps For Teachers (Responses) - Form Responses 1 (1).tsv"));
        ArrayList<String[]> responses = organize.getList();
        //responses = data.sortByGrade(responses, grade[0]);
        //responses = data.sortBySchool(responses, school[0]);
        responses = data.sortByProblem(responses, "Discipline");
        //responses = data.sortBySetting(responses, setting[1]);
        data.writeFile(responses);

    }
}
