import java.io.*;
class student{
    String name,roll;
    double ass1,ass2,proj,tot;
    String grade;

    public student(){

    }

    public student(String x,String y,double a,double b,double c){
        this.roll=x;
        this.name=y;
        this.ass1=a;
        this.ass2=b;
        this.proj=c;
    }

    // setters
    public void setRoll(String x){
        this.roll=x;
    }
    public void setName(String y){
        this.name=y;
    }

    public void setAss1(double a){
        this.ass1=a;
    }
    public void setAss2(double b){
        this.ass2=b;
    }
    public void setProj(double c){
        this.proj=c;
    }

    // getters
    public String getRoll(){
        return this.roll;
    }
    
    public String getName(){
        return this.name;
    }

    
    public double getAss1(){
        return this.ass1;
    }
    
    public double getAss2(){
        return this.ass2;
    }

    public double getProj(){
        return this.proj;
    }

    // calculate total marks
    public double calculate(){
        tot=this.ass1+this.ass2+this.proj;
        return tot;
    }

    public String getGrade(){
        if(tot < 50)
            grade="F";
        else if(tot >=50 && tot <65)
            grade = "P";
        else if(tot >=65 && tot <75)
            grade = "C";
        else if(tot >=75 && tot <85)
            grade = "D";
        else if(tot >=85)
            grade="HD";
        
        return grade;
    }


}