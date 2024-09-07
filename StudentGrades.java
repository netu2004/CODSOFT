import java.util.Scanner;
public class StudentGrades{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects=scanner.nextInt();
        int[] marks=new int[numSubjects];
        for(int i=0;i<numSubjects;i++){
            System.out.println("Enter marks for subjects"+(i+1)+":");
            marks[i]=scanner.nextInt();
        }
        int totalMarks=calTotMarks(marks);
        double avgPercent=calAvgPercent(totalMarks,numSubjects);
        String grade=calGrade(avgPercent);
        displayResults(totalMarks,avgPercent,grade);
    }
    private static int calTotMarks(int[] marks){
        int total=0;
        for(int mark:marks){
            total+=mark;
        }
        return total;
    }
    private static double calAvgPercent(int totalMarks,int numSubjects){
        return (int)totalMarks/numSubjects;
    }
    private static String calGrade(double avgPercent){
        if(avgPercent>=90){
            return "A";
        }
        if(avgPercent>=80){
            return "B";
        }
        if(avgPercent>=70){
                return "C";
        }
        if(avgPercent>=60){
                return "D";
        }else{
            return "F";
        }
    }
    private static void displayResults(int totalMarks,double avgPercent,String grade){
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+avgPercent+"%");
        System.out.println("Grade "+grade);
    }
}

