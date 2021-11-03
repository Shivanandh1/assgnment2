package com.shiva.assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Studentdetails_Show
{
  public void viewFile(String s) throws Exception
  {
	 // StudentDetail student=new StudentDetail();

	      File file = new File("C:\\Users\\thi1\\eclipse-workspace\\assignment2\\src\\com\\shiva\\assignment2\\studentdetails"+s+".txt");
	      Scanner sc = new Scanner(file);

	      while (sc.hasNextLine())
	       {
	         System.out.println(sc.nextLine());
	       }
	     }
	   }
