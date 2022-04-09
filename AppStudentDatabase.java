package com.Kavita;
import com.Kavita.StudentInfo;
import com.Kavita.CsOverload;
import com.Kavita.Overrid;

import java.util.Scanner;

public class AppStudentDatabase {

    public static void main (String[]args) {

        //String class
        char welcome[]={'W','e','l','c','o','m','e',' ', 'T','o'};
        //converting char array welcome[] to string welString

        String welStrng = new String(welcome);
        System.out.println("\t\t" + welStrng);//this will print welcome

        // CsOverload file
        CsOverload a = new CsOverload("\t\tStudent");
        CsOverload b = new CsOverload();
        a.printName();
        b.printName();

        // overriding file
        Overrid v = new Overrid();
        v.ovMethod();

        // Ask how many new student you want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        StudentInfo[] students = new StudentInfo[numOfStudents];

        // Create n number of new students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new StudentInfo();
            students[n].enroll();
            students[n].totalpay();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}
