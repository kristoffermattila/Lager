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
import java.util.stream.Stream;

/**
 *
 * @author kmatil
 */
public class Lager {
//    List<List<Item>> lists;
    List<TV> tvs;
    List<Monitor> monitors;
//    TV tv;
    
    Lager() {
//        lists = new ArrayList<>();
        tvs = new ArrayList<>();
        monitors = new ArrayList<>();
//        tv = new TV("Test", "Test", 2.0, 2.0, Period.ZERO, 2.0, "Test");
//        lists.add(tvs);
    }
    
    /**
     * 
     * @return Stream of all Items
     */
    public Stream getAllLists() {
        return Stream.concat(tvs.stream(), monitors.stream());
    }
    
    public boolean addItem(String s) {
        Scanner sc = new Scanner(s);
        String itemType = sc.next();
        switch (itemType) {
            case "TV" :
                return add(new TV(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(),
                        Period.ofYears(sc.nextInt()), sc.nextDouble(), sc.nextLine()));
            case "Monitor" :
                return add(new Monitor(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(),
                        Period.ofYears(sc.nextInt())));
            default:
                System.out.println("Felaktigt föremål");
            
        }
        return true;
    }
    
    public void addTestItems() {
        addItem("TV OLED BängOlufsen 200 10 1 80 Sämst");
        addItem("TV LED LG 100 50 3 28 Bästa TV");
        addItem("Monitor LCD Shamshung 1000 800 2");
        System.out.println("Testföremål tillagda");
    }
    
    public boolean add(TV tv) {
        return tvs.add(tv);
    }
    
    public boolean add(Monitor monitor) {
        return monitors.add(monitor);
    }

    public static void displayMenu(){
        System.out.println("Menyval:");
        System.out.println("1. Lista typer");
        System.out.println("2. Lista allt");
        System.out.println("9. avsluta");
        System.out.println("0. Lägg till testföremål");
                
    }
    /**
     * @param args the command line arguments
     */
    
    public void listTypes() {
        tvs.forEach( teve -> System.out.println("Föremål: "+teve.getName()+"\n\tTyp:"+teve.getType()) );
    }
    
    private void listEverything() {
        tvs.forEach(tv -> System.out.println(tv));
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
                case 2:
                    theLager.listEverything();
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
    }
    
}
