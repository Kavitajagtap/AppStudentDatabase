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

/*
----------------------------------- Output -----------------------------------------------------

        Welcome To
		Student
		Enrollment App
***************************************************
Enter number of new students to enroll: 2
Enter student first name: Kavita
Enter student last name: Jagtap
----------------------------------------
1 - Semester 1
2 - Semester 2
3 - Semester 3
4 - Semester 4
5 - Semester 5
6 - Semester 6
7 - Semester 7
8 - Semester 8
Enter your semester: 6
----------------------------------------
Enter course to enroll (Q to quit when finish.): Os
Enter course to enroll (Q to quit when finish.): DIP
Enter course to enroll (Q to quit when finish.): ST
Enter course to enroll (Q to quit when finish.): CC
Enter course to enroll (Q to quit when finish.): SPM
Enter course to enroll (Q to quit when finish.): OOS&WE
Enter course to enroll (Q to quit when finish.): Q
----------------------------------------


*****************************************
Total payment for the courses is: RM3600
*****************************************
Your current account balance: RM4100
Enter your payment: RM3600

----------------------------------------
Thank you for your payment of RM3600
Your current account balance: RM500
Name: Kavita Jagtap
Semester: 6
Receipt ID: 61001
Courses Enrolled: 
 Os
 DIP
 ST
 CC
 SPM
 OOS&WE
Balance: RM500
----------------------------------------
Enter student first name: Krishna
Enter student last name: Sonawane
----------------------------------------
1 - Semester 1
2 - Semester 2
3 - Semester 3
4 - Semester 4
5 - Semester 5
6 - Semester 6
7 - Semester 7
8 - Semester 8
Enter your semester: 4
----------------------------------------
Enter course to enroll (Q to quit when finish.): CPP
Enter course to enroll (Q to quit when finish.): DS
Enter course to enroll (Q to quit when finish.): COmputer Network
Enter course to enroll (Q to quit when finish.): TOI
Enter course to enroll (Q to quit when finish.): q
----------------------------------------


*****************************************
Total payment for the courses is: RM2400
*****************************************
Your current account balance: RM2900
Enter your payment: RM2400

----------------------------------------
Thank you for your payment of RM2400
Your current account balance: RM500
Name: Krishna Sonawane
Semester: 4
Receipt ID: 41002
Courses Enrolled: 
 CPP
 DS
 COmputer Network
 TOI
Balance: RM500
----------------------------------------

Process finished with exit code 0

