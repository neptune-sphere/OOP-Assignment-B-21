class testMain{
    public static void main(String args[]) throws Exception{
        
        float min=100,max=0,avg=0;
        String x="",y="";
        int n=3,i;
        student st[]=new student[n];
        for(i=0;i<n;i++){
                st[i]=new student();
                st[i].accept();
                st[i].grade();
            }
        
        System.out.println("Roll\tName\tAss1\tAss2\tAss3\tTotal\tGrade");
        for(i=0;i<3;i++)
            st[i].display();
    
        // find the minimum marks
        for(i=0;i<3;i++){
            if(st[i].tot < min){
                min=st[i].tot;
                x=st[i].name;
            }
        }
        // find the maximum marks
        for(i=0;i<3;i++){
            if(st[i].tot > max){
                max=st[i].tot;
                y=st[i].name;
            }
        }
        // find the average of all
        for(i=0;i<3;i++){
            avg = avg + ( (max+min)/3 );
        }

        System.out.println("Minimum marks are scored by "+x+": "+min);
        System.out.println("Maximum marks are scored by "+y+": "+max);
        System.out.println("Average marks scored : "+avg);

    }

}