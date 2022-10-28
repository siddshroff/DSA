package Arrays;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        char[] arr = {'a','a','c','f','j' };


        uniqueCharacters(arr);
    }

    private static void uniqueCharacters(char[] arr) {
        Map arrayMap = new HashMap();
        Set arraySet = new HashSet();
        for(int i=0;i<=arr.length-1;i++){
//            if(arraySet.contains(arr[i]))
//                    continue;
//            else
                arraySet.add(arr[i]);
//            if(arrayMap.containsKey(arr[i]))
//                continue;
//            else
//                arrayMap.put(arr[i],arr[i]);
        }
//        arrayMap.forEach((key,value)-> System.out.println(key));
        arraySet.forEach((key)->{
            System.out.println(key);
        });
    }
}
