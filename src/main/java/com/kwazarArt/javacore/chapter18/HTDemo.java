package com.kwazarArt.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("John Dow", 3434.34);
        balance.put("Tom Smit", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tom Hold", 99.22);
        balance.put("Ralf Smit", -19.08);

        names = balance.keys();
        while(names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("John Dow");
        balance.put("John Dow", bal + 1000);
        System.out.println("New sum of money on deposit John Dow is: " + balance.get("John Dow"));

    }
}
