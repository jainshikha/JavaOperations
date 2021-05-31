import java.io.Serializable;
import java.util.*;


import java.util.ArrayList;

public class Climber extends Emp implements Runnable, AutoCloseable, Serializable {
    public Climber(String name, int id) {
        super(name, id);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        //numbers.stream().map(Climber::divideByZero).forEach(System.out::println);
        dis();
        HashSet hashSet = new HashSet<>();
        hashSet.add("shikha");
        hashSet.add(null);
        hashSet.add(780);
        hashSet.add(null);
        System.out.println(hashSet);
        TreeMap treeMap = new TreeMap<>();
        //  treeMap.put(null, "test");
        //  System.out.println(treeMap);
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        linkedHashMap
                .put(null, "test");
        linkedHashMap.put(null, "test3");
        System.out.println(linkedHashMap);
    }

    public static int divideByZero(int n) {
        return n / 0;
    }

    public static void dis() {
        List<String> list = new ArrayList<String>();

        list.add("Alice");

        list.add("Smith");
        list.add("Smith");
        list.add("Jones");
        list.stream().distinct().forEach(System.out::print);
        for (String str : list) {
            str += "50";
        }
        System.out.println(list);
    }

    @Override
    public void run() {

    }

    @Override
    public void close() throws Exception {

    }
}
