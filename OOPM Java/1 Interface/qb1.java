import java.util.*;

interface exam{
    boolean pass(int marks);
}
interface classify{
    String division(int average);
}

class result implements exam, classify{

    public String division(int average) {
        if (average > 85) {
            return "First";
        }
        else if (average > 60) {
            return "Second";
        }
        else if (average > 50) {
            return "Third";
        }
        else {
            return "Pass";
        }
        
    }

    public boolean pass(int marks) {
        if (marks > 40) {
            return true;
        }
        else{
            return false;
        }
    }
    
}

public class qb1{
    public static void main(String args[]){
        result r = new result();
        Scanner sc = new Scanner(System.in);
        int eng, maths, sci, avg;
        String res;
        System.out.println("Enter the marks out of 100");
        System.out.println("English: ");
        eng=sc.nextInt();
        System.out.println("Maths: ");
        maths=sc.nextInt();
        System.out.println("Science: ");
        sci=sc.nextInt();

        avg = eng + maths + sci /3;
        if(r.pass(eng) && r.pass(maths) && r.pass(sci)){
            res = r.division(avg);
            System.out.print("Division: "+res);
        }
        else{
            System.out.print("You failed");
        }

    }
}