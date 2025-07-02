import java.util.ArrayList;
import java.util.List;

public class LongPrefixIndex {
    public static void main(String[] args) {

        String[] words ={"flower","flow","flight"};

        StringBuilder prefix = new StringBuilder();

        int count =0;
        for(int i =0; i<words[0].length() ;i++) {
            if (i + 1 < words[1].length()) {
                if (words[0].charAt(i) == words[1].charAt(i)) {
                    count = 0;
                    char c = words[0].charAt(i);
                    for (int j = 1; j < words.length; j++) {
                        if (i + 1 <= words[j].length()) {
                            if (words[j].charAt(i) == c) {
                                count = count + 1;
                            }
                        }
                    }
                    if (count == words.length - 1) {
                        prefix.append(c);
                    }
                }
            }
                else {
                    break;
                }

        }
        System.out.println(prefix);
    }


}
