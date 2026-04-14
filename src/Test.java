import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //stream fixed tasks
//        List<Integer> nums = new ArrayList<>();
//        nums.add(2);
//        nums.add(40);
//        nums.add(-5);
//        nums.add(-6);
//        System.out.println(
//                nums.stream()
//                        .map(n -> n * 2)
//                        .filter(m -> m < 0).toList()
//        );
//        System.out.println(
//                nums.stream()
//                        .filter(m -> m > 10).toList()
//        );
//
//        List<String> strings = new ArrayList<>();
//        strings.add("salam");
//        strings.add("necesen");
//        strings.add("hhaha");
//        strings.add("ezzzzzz");
//        strings.add("A ile baslayan");
//        strings.add("Asadawsda");
//        System.out.println(
//                strings.stream()
//                        .filter(len -> len.length() > 5)
//                        .map(txt -> txt.toUpperCase())
//                        .filter(letterA -> letterA.startsWith("A"))
//                        .map(hi -> "Hello " + hi).toList()
//        );

        //map+stream tasks
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Nihad", 90);
        myMap.put("Elcan", 98);
        myMap.put("Musa", 76);
        myMap.put("Ali", 86);
        Integer max = Integer.MIN_VALUE;
        System.out.println(myMap.entrySet().stream()
                .max((a,b) -> a.getValue().compareTo(b.getValue()))
                .get());

        List<List<Integer>> list = List.of(
                List.of(4, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 4)
        );
        System.out.println(
                list.stream()
                        .flatMap(List::stream)
                        .distinct()
                        .filter(h -> h % 2 == 0).toList()
        );

    }
}
