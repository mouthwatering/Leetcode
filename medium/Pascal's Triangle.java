import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(numRows == 0) return list;
        if(numRows == 1){
            List<Integer> num = new LinkedList<Integer>();
            num.add(1);
            list.add(num);
            return list;
        }
        list = generate(numRows-1);
        List num = list.get(list.size()-1);
        int a = 0,b = 1,sum = 0;
        List<Integer> newRow =  new LinkedList<Integer>();
        Iterator iterator = num.iterator();
        iterator.next();
        newRow.add(a+b);
        while(iterator.hasNext()){
            a = b;
            if(iterator.hasNext())
                b = (int)iterator.next();
            else
                b = 0;break;
            sum = a+b;
            newRow.add(sum);
        }
        newRow.add(1);
        list.add(newRow);
        return list;
    }
}
}