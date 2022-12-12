package lesson01;

import java.util.*;

public class ListSetMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ge"); // 0(1) O(n)
        list.get(0);
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        list.addAll(collection);
        List<Integer> t1 =Arrays.asList(1,2);
        System.out.println(list);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("111");

        String li = linkedList.pollFirst();
        System.out.println(linkedList);
        System.out.println(li);

        Queue<String> g1 = new LinkedList<>();
        Deque<String> g2;

        HashSet<String> set = new HashSet<>();
        HashSet<Student> s2 = new HashSet<>();
        Student st1 = new Student();
        st1.name = "ff";

        Student st2 = new Student();
        st2.name = "ff";

        System.out.println(st1.hashCode());
        System.out.println(st1.equals(st2));




/*
создайте класс Cat, создайте публичную переменную String name
переопределите методы hashCode, equals, alt+insert
 */


    }
}
