import java.util.ArrayList;
import java.util.List;

public class OriginalTypedString {
    public static void main(String[] args) {
        String word = "abbcccc";
        int count = possibleStringCount(word);

    }

    public static int possibleStringCount(String word) {
        int count =0;
        String currentWord = word;
        List<String> list= new ArrayList<String>();

        list.add(word);

        for (int i=0 ;i <word.length()-1;i++){
            if(word.charAt(i) == word.charAt(i+1)){
                currentWord = word.substring(0,i) + word.substring(i+1);
                list.add(currentWord);
            }
        }
        System.out.println(list);
        return  count;
    }
}
