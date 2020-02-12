package com.kwazarArt.javacore.chapter18.collectionsStorage;

public interface MainActions {
    void add(int num);
    void delete(int num);
    void searchByNumber(int num);
    void searchByIndex(int index);
    int searchMin();
    int searchMax();
    double searchAverage();
}
