import java.util.*;

public class Main {
    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static List<String> text = new ArrayList<>(List.of("list", "number", "nums", "nums", "for", "word", "list"));


    public static void main(String[] args) {


        task1(nums);
        task2(nums);
        task3(text);
        task4(text);
    }


    private static void task1(List<Integer> nums) {
        System.out.println("task 1");

        for (int number : nums) {
            if (number % 2 == 1) {
                System.out.print(" " + number);
            }
        }
        System.out.println();
    }


    private static void task2(List<Integer> nums) {
        System.out.println("task 2");

        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.println("четные числа " + number);
            }
        }
    }

    private static void task3(List<String> text) {
        System.out.println("task 3");
        for (String word : text) {
            if (Collections.frequency(text, word) == 1) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }

//        Set<String> newText = new HashSet<>(List.of(text.split("\\s+")));
//        for (String word : newText) {
//            System.out.print(word);
//        }
//        System.out.println(); //// ебля с текстом


    private static void task4(List<String> text) {
        System.out.println("task 4");
        // String text = text.split("\\s+");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : text) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);

            }
        }
        int replaceWords = 0;
        for (Integer q : map.values()) {
            if (q > 1) {
                replaceWords++;
            }
        }
        System.out.println(replaceWords);
    }
}