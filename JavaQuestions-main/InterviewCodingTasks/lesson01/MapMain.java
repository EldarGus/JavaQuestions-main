package lesson01;

import java.util.HashMap;

public class MapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Lenina 1", "vasya");
        map.put("Lenina 2", "vasya");

        //map.putAll();
        System.out.println(map.get("Lenina 1"));

    }
}
