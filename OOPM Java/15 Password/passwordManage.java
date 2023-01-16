import java.util.*;

public class passwordManage {
    public static void main(String args[]){

        String pass = "Hellooooooo1234";  
        int firstLetterAscii = pass.charAt(0);  
        int countInt=0;

        if(pass.length()< 10){
            System.out.print("Invalid Password: Password should contain atleast 10 Character");
        }
        else
        {
            for (int i = 0; i < pass.length(); i++) {
                if (!Character.isLetterOrDigit(pass.charAt(i))){
                    System.out.print("Invalid Password: Password should contain only Alphabets and Numbers.");
                    System.exit(0);
                }
                if (Character.isDigit(pass.charAt(i))) {
                    countInt++;
                }

            }
            if (countInt<2) {
                System.out.print("Invalid Password: Pasword must contain 2 numbers.");
                    System.exit(0);
            }
        }
        if (firstLetterAscii<64 && firstLetterAscii>91) {
            System.out.print("Invalid Password: First letter should be Capital.");
            System.exit(0);
        }
        System.out.println("Your password is a Valid Password.");

    }
}
