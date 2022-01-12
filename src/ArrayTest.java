import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ArrayTest {

    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(11,"Nati");
        hashMap.put(2,"Robert");
        hashMap.put(7,"Beauty");
        hashMap.put(9,"Shivashish");
        hashMap.put(null,"null");
        System.out.println(hashMap.size());
        System.out.println(hashMap);
}
}
//List<String> strList = new ArrayList<>();
//        strList.add("Anna"); 
//        strList.add("Ada"); 
//        strList.add("Ada"); 
//        strList.add("Bob"); 
//        strList.add("Bob"); 
//        strList.add("Adda");
//        for (int i = 0; i < strList.size(); /* empty */) {
//        if (strList.get(i).length() <= 3) {
//        strList.remove(i);
//        } else {
//        ++i;
//        }
//        }
//        System.out.println(strList);
 //           }

//List<String> strList = new ArrayList<>();
//strList.add(“Anna”); strList.add(“Ada”); strList.add(null);
//strList.add(“Bob”); strList.add(“Bob”); strList.add(“Adda”);
//while(strList.remove(“Bob”));
//System.out.println(strList);
//}
//       List<String> strList = new ArrayList<>();
//        strList.add("Anna"); 
//        strList.add("Ada"); 
//        strList.add("Bob"); 
//        strList.add("Bob"); 
//     
//        for (int i = 0; i < strList.size(); /* empty */) {
//        if (strList.get(i).equals("Bob")) {
//        strList.remove(i);
//        } else {
//        ++i;
//        }
//        }
//        System.out.println(strList);
//    List<String> strList = new ArrayList<>();
//            strList.add("Anna"); 
//            strList.add("Ada"); 
//            strList.add(null);
//            strList.add("Bob"); 
//            strList.add("Bob"); 
//            strList.add("Adda");
//            while(strList.remove("Bob"));
////            System.out.println(strList);
//        List<Integer> list=new ArrayList<Integer>();
//        list.add(2);
//        list.add(3);
//        System.out.println(sum(list));
//    }
//        public static double sum(List<? extends Number> list){
//            double sum=0;
//            for(Number num:list) {
//            sum+=num.doubleValue();
//            }
//            return sum;
//        }