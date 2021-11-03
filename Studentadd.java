package com.shiva.assignment2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student_Add
{
    public void createFile() throws IOException
    {
    	
       Scanner sc=new Scanner(System.in);
       
        StudentDetail student=new StudentDetail();
        student.getInfo();
        
        BufferedWriter bw = null;
    	try {

			bw = new BufferedWriter(new FileWriter("C:\\Users\\thi1\\eclipse-workspace\\assignment2\\src\\com\\shiva\\assignment2\\studentdetails"+student.getName()+".txt",true));
         bw.write("Student classname----:"+student.getClassname()+"\n"
	             +"Student Name ------- :"+student.getName()+"\n"+
                  "Biology marks--------:"+student.getBiology()+"\n"+
	              "Student section------:"+student.getSection()+"\n"+
                  "Maths marks ---------:"+student.getMaths()+"\n"+
                  "Physics marks ------ :"+student.getPhysics()+"\n"+
 student.getName()+"Rankposition-------:"+student.getRankposition()+"\n"+
                  "Total marks of student:"+student.getTotalmarks());
         
        bw.close();
        System.out.println("\nStudent has been Added :)\n");

        System.out.print("\nPress Enter to Continue...");
        sc.nextLine();
		
		} catch (IOException e) {
			e.printStackTrace(); 
		} finally {
			bw.close();
		}
	}
}
