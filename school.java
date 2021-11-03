package com.shiva.assignment2;

import java.util.*;
import java.io.*;

class MainMenu
{
  public void menu()
  {
    System.out.println("\n----------------------------------");
    System.out.println("Press 1 : To Add an student Details");
    System.out.println("Press 2 : To See an Student Details ");
    System.out.println("Press 3 : To Exit the Portal");

  }
}
class CodeExit
{
  public void out()
  {
	  System.out.println("\n*****************************************");

    System.exit(0);
  }
}

 public class school
{
  public static void main(String arv[]) throws Exception
  {
   
    Scanner sc=new Scanner(System.in);
    Studentdetails_Show epv =new Studentdetails_Show();
      // epv.viewFile("studentdetails.txt");
    int i=0;
    MainMenu obj1 = new MainMenu();
    obj1.menu();

    while(i<6)
    {

      System.out.print("Please Enter choice :");
      i=Integer.parseInt(sc.nextLine());


      switch(i)
      {
        case 1:
        {

        Student_Add ep =new Student_Add();
        ep.createFile();

        System.out.print("-----");
        obj1.menu();
        break;
        }
        case 2:
        {
          System.out.print("Please Enter Student name :");
          String s=sc.nextLine();
          try
          { epv.viewFile(s);
          }
            catch(Exception e)
          {System.out.println(e);}

            System.out.print("\nPress Enter to Continue...");
            sc.nextLine();
            System.out.print("------");
            obj1.menu();
            break;
          }
        
        case 3:
        {
          CodeExit obj = new CodeExit();
          obj.out();
        }
      }
    }
  }
}

 








 
