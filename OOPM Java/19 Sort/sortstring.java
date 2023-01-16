import java.util.*;
class sortstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String mainstr = sc.nextLine();
        String str = mainstr;
        String str_lower = str.toLowerCase();
        char arr[] = new char[str_lower.length()];
        int vovel=0;
        int consonent=0;
        for(int i=0; i<arr.length;i++){
            arr[i] = str_lower.charAt(i);

            // For finding vovel
            if (arr[i]== 'a' || arr[i]== 'e' || arr[i]== 'i' || arr[i]== 'o' || arr[i]== 'u') {
                vovel = vovel +1;
            }
            else{
                if (arr[i]== ' ') {
                    continue;
                }
                consonent = consonent +1;
            }
        }
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] != ' '){
                    if(arr[i] > arr[j]){
                        char temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }else{
                    break;
                }    
            }
        }
        System.out.print("Sorted: ");
        for(int i=0; i<arr.length;i++){
             System.out.print(arr[i]);
        }
        System.out.println("\nTotal Vovels: "+ vovel);
        System.out.println("Total Consonent: "+ consonent);
    }
}