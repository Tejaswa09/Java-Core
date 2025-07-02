public class Pallindrome {
    public static void main(String[] args) {
        int x= 121;

        boolean isPalindrome = false;
        String intToString = String.valueOf(x);
        String[] revString = new String[intToString.length()];
        int j= intToString.length()-1;
        for (int i=0 ;i< (intToString.length()) ;i++){
            revString[i] = String.valueOf(intToString.charAt(j));
            j= j-1;
        }
        for (String k : revString){
        System.out.println(k);
        }
        System.out.println(String.join("",revString));
        if (intToString.equals(String.join("",revString))){
            isPalindrome = true;
        }
        System.out.println(isPalindrome);
    }
}
