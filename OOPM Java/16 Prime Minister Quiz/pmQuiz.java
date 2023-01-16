import java.io.*;

class IncorrectAnswer extends Exception{
    public IncorrectAnswer(String e){
        super(e);
    }
}
public class pmQuiz {
    public static void main(String args[])throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

        System.out.println("\nYou have only 3 attempts.");
        System.out.println("Who is the Prime Minister of India?");
        String correctAnswer = "Rishabh Sinha";
        for (int i = 1; i < 4; i++){
            System.out.print("Attempt "+ i +": ");
            
            try{
                String answer = reader.readLine();
                if (answer.equalsIgnoreCase(correctAnswer)) {
                    System.out.println("Correct Answer!");
                    System.exit(0);
                }else{
                    throw new IncorrectAnswer("Try Again :( ");
                }
            }
            catch(IncorrectAnswer e){
                System.out.println(e);
            }
    
        }
        System.out.println("Correct Answer: Rishabh Sinha");


    }
}
