package com.kwazarArt.javacore.chapter18;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("C:\\Users\\user\\Desktop\\Phonebook.txt");
        } catch (FileNotFoundException e) {

        }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IIOException e) {
            System.out.println("Ошибка чтения файла");
        }

        do {
            System.out.println("Введите имя ('выход' для завершения):");
            name = br.readLine();
            if (name.equals("выход")) continue;
            System.out.println("Введите номер:");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("выход"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Desktop\\Phonebook.txt");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }

        do {
            System.out.println("Введите имя для поиска ('выход' для поиска):");
            name = br.readLine();
            if (name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}
