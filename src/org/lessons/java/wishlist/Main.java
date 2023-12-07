package org.lessons.java.wishlist;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> gift = new HashSet<>();

        boolean stop = false;
        while(!stop){
            System.out.println("Insert new gift?(yes/no)");
            String answer = scanner.nextLine();
            switch (answer){
                case "yes":
                    System.out.print("Name of the gift to add: ");
                    String name = scanner.nextLine();
                    if(!gift.contains(name)){
                        gift.add(name);
                        System.out.println("Your gift list contains: " + (gift.size()) + " " + "object");
                    } else {
                        System.out.println("The gift name already exists in the list");
                    }
                    break;
                case "no":
                    stop = true;
                    break;
                default:
                    System.out.println("invalid answer");
                    break;
            }

        }


        System.out.println("Your gift list:");
        for(String element : gift){
            System.out.println(element.toUpperCase());
        }

        scanner.close();
    }
}