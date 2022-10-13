package com.chananya.cookbook;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.Enumeration;
import java.util.Random;

/**
 * Created by חנניה on 12 אוגוסט 2017.
 */

public class Label {
    private static Map<Integer, String> labels = new HashMap<Integer, String>(); //<label's id, label's name>

    public static String removeName(Integer id) { return labels.remove(id); }
    public static Integer removeId(String name) {
        if(! labels.containsValue(name)) {
            return -1;
        }

        for (Map.Entry<Integer, String> entry : labels.entrySet()) {
            if (entry.getValue() == name){
                labels.remove(entry.getKey());
                return entry.getKey();  //TODO: check if works
            }
        }

        return -1;  //failed to find or create label
    }
    public static String getName(Integer id) { return labels.get(id); }
    public static Integer getId(String name) {
        if(! labels.containsValue(name)) {
            int r = (int)(Math.random() * 500000 + 1);
            for (int i = r; labels.containsKey(r); r = (int)((Math.random() * 500000 + 111 * ++i) % 990000 + 10000));  //generating unexisting random key between 10000 and 1000000

            labels.put(r, name);
            return r;
        }

        for (Map.Entry<Integer, String> entry : labels.entrySet()) {
            if (entry.getValue() == name)
                return entry.getKey();
        }

        return -1;  //failed to find or create label
    }
    public static Map<Integer, String> getAll(){
        Map<Integer, String> temp = new HashMap<Integer, String>(labels);
        return temp;
    }
    private Label() { }
}
