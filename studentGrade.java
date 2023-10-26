import java.util.*;

public class studentGrade {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t***Student Grade Calculator***\n");
        System.out.println("Enter the total number of subjects:");
        int num=sc.nextInt();
        int marks[]=new int[num];
        System.out.println("Enter the marks of each subject:");
        int sum=0,j;
        for(int i=0;i<num;i++)
        {
            j=i+1;
            System.out.print("Subject "+j+" : "); 
            marks[i]=sc.nextInt();
            sum+=marks[i];
        }
        float avgPercent=(sum/num);

        studentGrade obj=new studentGrade();
        System.out.println("\nTotal Marks :"+sum);
        System.out.println("Average Percentage :"+avgPercent);
        System.out.println("Obtained Grade :"+obj.grade(avgPercent));
        sc.close();
    }
    private char grade(float num)
    {
        if(num>=85){
            return 'A';
        }
        else if(num<85 && num>=70){
            return 'B';
        }
        else if(num<70 && num>=60){
            return 'C';
        }
        else if (num<60 && num>=50)
            return 'D';
        else if(num<50 && num>=35)
            return 'E';
        else
            return 'F';
    }
}
