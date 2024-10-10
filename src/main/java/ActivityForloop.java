/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
        
public class ActivityForloop {
    public static void main(String[] args) {
        Scanner nas = new Scanner(System.in);
        
        double[] grades = new double[5];
        String[] subjects =  {"\nMath", "Science", "English", "History", "Programming"};
        
        System.out.print("Please enter the grade of the following subject: ");
        for(int i = 0; i< subjects.length; i++) {
            System.out.print(subjects[i] + " : ");
            grades[i] = nas.nextDouble();
            
        }
        System.out.println("\nGrades of the subject");
        for (int i = 0; i< subjects.length; i++) {
            System.out.println(subjects[i] + " : " + grades[i]);
            //System.out.print(subjects[i] + " : ");
            //grades[1] = sc.nextDouble();;
            double grade;
            
       do {
           System.out.print(subjects[i] + " : ");
           while (!nas.hasNextDouble()) {
               System.out.println("Invalid Input!");
               nas.next();
           }
           grade = nas.nextDouble();
           if(grade < 65 || grade > 100) {
               System.out.println("Invalid grade");
           }
        }while(grade < 65 || grade > 100);
           grades[i] = grade;        
    }
       
        int totalgrade = 0;
            
        System.out.println("Total no. of Subject: " + subjects.length);
            
        int totalg = 0;
            
        double average = (double)totalgrade / subjects.length;
        System.out.println("The average grade is : " + average);
        
        System.out.println("\nGrade Classification: ");
        for(int i = 0; i < grades.length; i++) {
            char gradesClassification;
            if (grades[i] >= 90){
                gradesClassification = 'A';
            }else if (grades[i] >= 80) {
                gradesClassification = 'B';
            }else if (grades[i] >= 70) {
                gradesClassification = 'C';  
            }else if (grades[i] >= 60) {
                gradesClassification = 'D';
            }else {
                gradesClassification = 'F';
            }
            System.out.println(subjects[i] + ";" + grades[i] + "->" + gradesClassification);
        }
        
        ///Check for the subject below 75
        
        System.out.println("\nSubjects with grades below 75");
            for(int i = 0; i <subjects.length; i++){
               if(grades[i] < 75){
                    System.out.println(subjects[i]+ " : " + grades[i]);
                    
            }
    }
         //Identify the highest and lowest grades
            double maxGrade = grades [0];
            double minGrade = grades [0];
            String maxSubject = subjects [0];
            String minSubject = subjects [0];
            
            for (int i = 1; i < grades.length; i++)
            {
                if (grades [i] > maxGrade){
                    maxGrade = grades[i];
                    maxSubject = subjects[i];
                }
            }
            System.out.println("\nHighest grade:" + maxSubject + " : " + maxGrade);
            System.out.println("\nLowest grade:" + maxSubject + " : " + maxGrade);
        nas.close();  
    } 
}