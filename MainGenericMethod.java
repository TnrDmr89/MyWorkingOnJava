import java.util.*;

public class MainGenericMethod {

    public static void main(String[] args) {
        List<Integer> myint = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 7, 1);
        List<String> myString = Arrays.asList("a", "b", "b", "c", "w", "r", "w");
        for (Integer val : myint)
            System.out.print(val + " ");
        System.out.println();
        for (String val : myString)
            System.out.print(val + " ");
        System.out.println("\n" + "Nonduplicate :");
        System.out.println(nonDuplicate(myint));
        System.out.println(nonDuplicate(myString));
        System.out.println("List :");
        System.out.println(totalValue(myint));
        System.out.println(totalValue(myString));
        System.out.println();
        numberOfElement(myint);
        numberOfElement(myString);
    }

    public static <T> List<T> nonDuplicate(List<T> myvalue) {
        List<T> myNonDuplicateValue = new ArrayList<>();
        for (int i = 0; i < myvalue.size(); i++) {
            int count = 0;
            for (int k = 0; k < myvalue.size(); k++) {
                if (myvalue.get(i) == myvalue.get(k)) {
                    count++;
                }
            }
            if (count == 1) {
                myNonDuplicateValue.add(myvalue.get(i));
            }

        }
        return myNonDuplicateValue;

    }

    public static <T> List<T> totalValue(List<T> myvalues) {
        List<T> totalValue = new ArrayList<>();
        for (T val : myvalues)
            if (!totalValue.contains(val))
                totalValue.add(val);


        return totalValue;
    }

    public static <T> void numberOfElement(List<T> myvalue) {
        Map<T , Integer> map= new LinkedHashMap<>();
        for (int i = 0; i < myvalue.size(); i++) {
            int count = 0;
            for (int k = 0; k < myvalue.size(); k++) {
                if (myvalue.get(i) == myvalue.get(k)) {
                    count++;
                }

            }
            if(!map.containsKey(myvalue.get(i))){
                map.put(myvalue.get(i),count);
            }
        }
        for(T key : map.keySet()){
            System.out.println(key + " den " + map.get(key) + " tane var");

        }
    }
}