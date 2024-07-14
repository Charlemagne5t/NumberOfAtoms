import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        List<String> list = new ArrayList();
        for(int i = 0; i < n; i++) {
            char ch = formula.charAt(i);
            if(Character.isLowerCase(ch)) {
                String add =  list.get(list.size() - 1) + ch;
                list.set(list.size() - 1, add);
            }else if(ch == '(') {

            }
        }
    }
}