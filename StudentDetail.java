package com.shiva.assignment2;

import java.util.Scanner;

class StudentDetail 
	{
	   public String name;
	   private int biology;
	   private String classname;
	   private int Maths;
	   private int rankposition;
	   private double totalmarks;
	   private String section;
	   private int physics;
	   
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBiology() {
		return biology;
	}
	public void setBiology(int biology) {
		this.biology = biology;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public int getRankposition() {
		return rankposition;
	}
	public void setRankposition(int rankposition) {
		this.rankposition = rankposition;
	}
	public int getTotalmarks() {
		return (int) totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
		public void getInfo()
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter Student name --------: ");
	        name=sc.nextLine();
	        System.out.print("Enter classname  ----------: ");
	        classname=sc.nextLine();
	        System.out.println("Enter Student section----:");
	        section=sc.next();
	        System.out.print("Enter Biology marks -------: ");
	        biology=sc.nextInt();
	        System.out.print("Enter maths marks----------: ");
	        Maths=sc.nextInt();
	        System.out.print("Enter physics marks -------: ");
	        physics=sc.nextInt();
	        totalmarks=Maths+biology+physics;
	        System.out.println("Rank position -----------:");
	        rankposition=sc.nextInt();
	     
	    }
	}

