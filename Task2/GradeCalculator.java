package Task2;

import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //n denotes number of subjects
        int n=sc.nextInt();
        //array marks contains marks of each subject
        int marks[]=new int[n];
        //to check if marks of each subject is >0 and <100
        int cn=0;
        //get input
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
            if(marks[i]>100 || marks[i]<0)
            {
                cn++;
                break;
            }
        }
        if(cn!=0){
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int tot=0;
        for(int i=0;i<n;i++)
        {
            tot+=marks[i];
        }
        int avg=tot/n;
        char c=Grade(avg);
        System.out.println("Total marks obtained: "+tot);
        System.out.println("Average Percentage: "+avg+"%");
        System.out.println("Grade: "+c);
        sc.close();
    }
    //function to calculate grade
    public static char Grade(int avg)
    {
        if(avg>=90)
        return 'A';
        else if(avg>=80)
        return 'B';
        else if(avg>=70)
        return 'C';
        else if(avg>=60)
        return 'D';
        else
        return 'E';
    }
}
