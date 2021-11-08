package Casetudy.model;

import java.io.IOException;

public interface GeneralManager<T> {
    void add (T t);
    void editByName(String name , T t);
    void deleteByName (String name);
    void print();
    int find(String name);
    void printcsv() throws IOException;
}
