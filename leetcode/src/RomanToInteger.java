import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCDLXXXVII";//

        HashMap<Character, Integer> romanSet = new HashMap<>();

        romanSet.put('I', 1);
        romanSet.put('V', 5);
        romanSet.put('X', 10);
        romanSet.put('L', 50);
        romanSet.put('C', 100);
        romanSet.put('D', 500);
        romanSet.put('M', 1000);

       int value = 0;
       for (int i = 0 ; i<s.length();i++){
           if(i+1< s.length() && romanSet.get(s.charAt(i))<romanSet.get(s.charAt(i+1))){
               value = value - romanSet.get(s.charAt(i));
           }
           else {
               value = value + romanSet.get(s.charAt(i));
           }
       }
        System.out.println(value);
    }

}

