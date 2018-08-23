/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lager;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kmatil
 */
public class Lager {
//    List<List<Item>> lists;
    List<TV> tvs;
//    TV tv;
    
    Lager() {
//        lists = new ArrayList<>();
        tvs = new ArrayList<>();
//        tv = new TV("Test", "Test", 2.0, 2.0, Period.ZERO, 2.0, "Test");
//        lists.add(tvs);
    }
    
    public boolean addItem(String s) {
        Scanner sc = new Scanner(s);
        String itemType = sc.next();
        System.out.println(itemType);
        switch (itemType) {
            case "TV" :
                return add(new TV(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(),
                        Period.ofYears(sc.nextInt()), sc.nextDouble(), sc.nextLine()));
                
            default:
                System.out.println("Felaktigt föremål");
            
        }
        return true;
    }
    
    public void addTestItems() {
        
        addItem("TV OLED BängOlufsen 200 10 1 80 Sämst");
        addItem("TV LED LG 100 50 3 28 Bästa TV");
    }
    
    public boolean add(TV tv) {
        return tvs.add(tv);
    }

    public static void displayMenu(){
        System.out.println("Menyval:");
        System.out.println("1. Lista typer");
        System.out.println("9. avsluta");
        System.out.println("0. Lägg till testföremål");
                
    }
    /**
     * @param args the command line arguments
     */
    
    public void listTypes() {
        /*
        System.out.println("Listar alla typer: ");
        System.out.println();
        skriv ut namnet på rubriken
        loopa igenom listan med TVapparter och skriv ut unika Typer för varje
        
        
        */
  //      tvs.forEach( (TV tv) -> System.out.println(tv.getType()) );
        tvs.forEach( (TV teve) -> System.out.println(teve.getType()) );
        /*
        for(List<Item> l : lists) {
            for(Item i : l) {
                System.out.println(i.getType());
            }
        }*/
    }
            
    
    public static void main(String[] args) {
        Lager theLager = new Lager();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            displayMenu();

            int menuChoice = -1;
            menuChoice = Integer.parseInt(scanner.next());

            switch(menuChoice)
            {
                case 1: 
                    theLager.listTypes();
                    break;
                case 9:
                    System.out.println("Avslutar");
                    return;
                case 0:
                    theLager.addTestItems();
                    break;
                default :
                    System.out.println("FEL");

            }
        }
        // TODO code application logic here
    }
    
}
