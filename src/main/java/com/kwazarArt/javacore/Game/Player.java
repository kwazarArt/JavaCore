package main.java.com.kwazarArt.javacore.Game;

import java.io.*;

public interface Player {
    String name = "Computer";
    Variant choiceVariant() throws IOException;
    String getName();

    default String input() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }
}
