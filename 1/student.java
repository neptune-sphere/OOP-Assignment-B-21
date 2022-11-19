import java.io.*;

class student{
    String roll,name,grade;

    float ass1,ass2,ass3,tot;
    
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    private boolean flag=true;

    public void accept() throws Exception{
        
            do{
                
                System.out.println("Enter student number : ");
                roll = br.readLine();
                if(roll.length() == 0){
                    System.out.println("Student name cannot be empty!!");
                    flag=false;
                }
                else 
                    flag=true;
            }while(flag==false);

            flag=true;
            do{
                System.out.println("Enter student name : ");
                name=br.readLine();
                if(name.length()==0){
                    System.out.println("Name cannot be empty!");
                    flag=false;
                }
                else 
                    flag=true;
            }while(flag==false);
                
                // Assignment 1 marks
                flag=true;
                do{
                    System.out.println("Enter assignment 1 marks : ");
                    ass1=Float.parseFloat(br.readLine());
                    if(ass1 < 0 || ass1 > 20){
                        System.out.println("Marks for assignment 1 should be in the range 0 to 20");
                        flag=false;
                    }
                    else    
                    flag=true;
                }while(flag==false);

                // Assignment 2 marks
                flag=true;
                do{
                    System.out.println("Enter assignment 2 marks : ");
                    ass2=Float.parseFloat(br.readLine());
                    if(ass2 < 0 || ass2 > 30){
                        System.out.println("Marks for assignment 2 should be in the range 0 to 30");
                        flag=false;
                    }
                    else 
                        flag=true;
                }while(flag==false);

                // Assignment 3 marks
                flag=true;
                do{    
                    System.out.println("Enter assignment 3 marks : ");
                    ass3=Float.parseFloat(br.readLine());
                    if(ass3 < 0 || ass3 > 50){
                        System.out.println("Marks for assignment 3 should be in the range 0 to 50");
                        flag = false;
                    }
                    else 
                        flag=true;

                }while(flag==false);

            tot=ass1+ass2+ass3;
    }

    public void display(){
        System.out.println(this.roll+"\t"+this.name+"\t"+this.ass1+"\t"+this.ass2+"\t"+this.ass3+"\t"+this.tot+"\t"+this.grade);
    }

    public void grade(){
 
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
    }



}