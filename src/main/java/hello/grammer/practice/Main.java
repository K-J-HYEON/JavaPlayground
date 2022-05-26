package hello.grammer.practice;

import hello.grammer.practice2.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("총 몇 명의 학생이 존재합니까 ?");
        int number = scan.nextInt();
        Student[] students = new Student[number];
        for(int i = 0; i < number; i++)
        {
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double GPA;
        }
    }
}
