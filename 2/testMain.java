import java.io.*;
class testMain{
    public static void main(String args[]){
        int i,cnt=0,ch=0;

        // Local variables 
        String x="",y="";
        double a=0,b=0,c=0;
        // Statisics 
        double min=100,max=0,avg=0;
        // extra variable 
        double ans=0;

        student st[]=new student[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("\n1. Enter Student record \n2. Display all students grade \n3. Display statistics\n4. Exit\n\nEnter choice : ");
            
            try{
                ch=Integer.parseInt(br.readLine());
            }catch(Exception e){
                System.out.println(e);
            }

            switch(ch){

                case 1: st[cnt]=new student();
                        // accept values locally
                        try{
                            System.out.println("Enter Student roll number : ");
                            x=br.readLine();
                            System.out.println("Enter Student name : ");
                            y=br.readLine();
                            System.out.println("Enter Assignment 1 marks : ");
                            a=Double.parseDouble(br.readLine());
                            System.out.println("Enter Assignment 2 marks : ");
                            b=Double.parseDouble(br.readLine());
                            System.out.println("Enter Project marks : ");
                            c=Double.parseDouble(br.readLine());
                        }catch(Exception e){
                            System.out.println(e);
                        }

                        // set values in the student array
                        st[cnt].setRoll(x);
                        st[cnt].setName(y);
                        st[cnt].setAss1(a);
                        st[cnt].setAss2(b);
                        st[cnt].setProj(c);

                        // increment the counter
                        cnt++;

                    break;
                case 2:
                        if(cnt==0){
                            System.out.println("Enter at least one record!!");
                            break;
                        }
                        else{
                                System.out.println("Roll\tName\tAss1\tAss2\tProj\tTotal\tGrade");

                                for(i=0;i<cnt;i++){
                                    System.out.print( (x=st[i].getRoll() )+"\t");
                                    System.out.print( (y=st[i].getName() )+"\t");
                                    System.out.print( (a=st[i].getAss1() )+"\t");
                                    System.out.print( (b=st[i].getAss2() )+"\t");
                                    System.out.print( (c=st[i].getProj() )+"\t");
                                    System.out.print( (st[i].calculate() )+"\t");
                                    System.out.print( (st[i].getGrade()  )+"\t");
                                    System.out.println();
                                }
                                
                                
                            }
                    break;
                case 3: if(cnt==0){
                            System.out.println("Enter at least one record!");
                            break;
                        }
                        else{
                            // Find minumum
                                for(i=0;i<cnt;i++){
                                    if( (ans=st[i].calculate()) < min){
                                        min=ans;
                                        x=st[i].getName();
                                    }
                                }
                                // Find maximum
                                
                                for(i=0;i<cnt;i++){
                                    if( (ans=st[i].calculate()) > max){
                                        max=ans;
                                        y=st[i].getName();
                                    }

                                }
                                // Find average of all students
                                for(i=0;i<cnt;i++){
                                    avg+= st[i].calculate() / cnt;
                                }
                            System.out.println("Minimum marks scored by "+x+" : "+min);
                            System.out.println("Maximum marks scored by "+y+" : "+max);
                            System.out.println("Average marks scored by class : "+avg);
                        }
                        avg=0;
                    break;

            }

        }while(ch!=4);
    }
}