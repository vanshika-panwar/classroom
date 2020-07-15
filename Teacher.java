// Author Siddhartha Tiwari

import java.util.*;
import java.io.*;

public class Teacher implements Serializable {

    private static final long serialVersionUID = 100L;
    public int num;
    public String name;
    public ArrayList<Student> students;
    private double[] grade;
    private ArrayList<Assignment> assign;

    Teacher() {
        num = 0;
        name = null;
        students = new ArrayList<Student>(5);
    }
    
    Teacher(int n) {
        num = n;
        assign = new ArrayList<Assignment>();
        students = new ArrayList<Student>(n);
        grade = new double[n];
        for (int i = 0; i < n; i++) {
            grade[i] = 0.0;
        }
    }

    Teacher(String name, int n) {
        num = n;
        assign = new ArrayList<Assignment>();
        students = new ArrayList<Student>(n);
        grade = new double[n];
        for (int i = 0; i < n; i++) {
            grade[i] = 0.0;
        }
        this.name = name;
    }

    public boolean assignHomework(Assignment obj) {
        if(check(obj))
            return false;
        assign.add(obj);
        System.out.println(num + " " + assign.size());
        for (int i = 0; i < num; i++) {
            students.get(i).assign.add(obj);
        }
        return true;
    }
    
    public boolean check(Assignment obj) {
        if(assign.isEmpty())
            return false;
        if(obj.fileAddress.equals(assign.get(assign.size() - 1).fileAddress))
            if(obj.textContent.equals(assign.get(assign.size() - 1).textContent))
                return true;
        return false;
    }
}
