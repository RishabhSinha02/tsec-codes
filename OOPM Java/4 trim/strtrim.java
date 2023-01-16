public class strtrim{
    public static void main(String args[]){
        String str = "Hello   How are   You";
        String tstr = str.trim().replaceAll(" +"," ");
        System.out.println(tstr);
        int vovel=0;
        for (int i = 0; i < tstr.length(); i++) {
            if (tstr.charAt(i)=='A' || tstr.charAt(i)=='a' || tstr.charAt(i)=='E' || tstr.charAt(i)=='e' || tstr.charAt(i)=='I' || tstr.charAt(i)=='i' || tstr.charAt(i)=='O' || tstr.charAt(i)=='o' || tstr.charAt(i)=='U' || tstr.charAt(i)=='u') {
                vovel++;
            }
        }
        System.out.println("Vovels: "+vovel);
    }
}