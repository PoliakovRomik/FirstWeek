package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Wine bolgard = new Wine("Bolgard","Ukraine", 1947);
        Wine apple = new Wine("Apple Wine", "Italy", 2000);
        ArrayList <Wine> catalogWine = new ArrayList<>();
        catalogWine.add(bolgard);
        catalogWine.add(apple);
        seeCatalog(catalogWine);
    }

    public static void seeCatalog(ArrayList catalog){
        System.out.println("Catalog wine: ");
        for(int i = 0; i < catalog.size(); i++){
            System.out.println(catalog.get(i));
        }
    }
}