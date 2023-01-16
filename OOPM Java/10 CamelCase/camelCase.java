// WAP to accept a sentence from the user. Display the accepted sentence in a camel case form.

public class camelCase{
    public static void main(String args[]){

        String str = "hello world rishabh";
        
        char arr[] = new char[str.length()];

        arr[0] = convert(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1)==' ') {
                arr[i]=convert(str.charAt(i));
            }
            else{
                arr[i]=str.charAt(i); 
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(arr[i]);
        }        
        
    }
    public static char convert(char ch){
        int ascii = ch;
        if(ascii > 91){
            ascii-=32;
            ch = (char)ascii;
        }
        return ch;
    }

}
