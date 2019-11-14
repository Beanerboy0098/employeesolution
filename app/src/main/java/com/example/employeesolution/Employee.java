package com.example.employeesolution;

public class Employee {
    private String fname;
    private String lname;
    private int height_feet;
    private int age;
    private double weight;
    private int height_inches;


    public Employee(String fname, String lname, int height_feet, int age, double weight, int height_inches) {

        this.fname = fname;
        this.lname = lname;
        this.height_feet = height_feet;
        this.age = age;
        this.weight = weight;
        this.height_inches = height_inches;




    }

    public String getFname(){
        return fname;
    }

    public void setFname(String Fname){
        this.fname = Fname;
    }

    public String getLname(){
        return lname;
    }

    public void setLname(String Lname){
        this.fname = Lname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int Age){
        this.age = Age;
    }

    public int getHeight_feet(){
        return height_feet;
    }

    public void setHeight_feet(int Height_feet){
        this.height_feet = Height_feet;
    }


    public double getWeight(){
        return weight;
    }

    public void setWeight(double Weight){
        this.weight = Weight;
    }

    public int getHeight_inches(){
        return height_inches;
    }

    public void setHeight_inches(int Height_inches){
         this.height_inches = Height_inches;
    }



}
