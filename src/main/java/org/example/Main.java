package org.example;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(new Chatacabra());
        monsters.add(new Quematrice());
        monsters.add(new LalaBarina());
        monsters.add(new Congalala());
        monsters.add(new Balahara());
        monsters.add(new Doshaguma());
        monsters.add(new UthDuna());
        monsters.add(new Rompopolo());
        monsters.add(new ReyDau());
        monsters.add(new Nerscylla());
        monsters.add(new Hirabami());
        monsters.add(new Ajarakan());
        monsters.add(new NuUdra());
        monsters.add(new GuardianDoshaguma());
        monsters.add(new GuardianRathalos());
        monsters.add(new GuardianEbonyOdoragon());
        monsters.add(new XuWu());
        monsters.add(new GuardianArkveld());
        monsters.add(new ZohShia());
        monsters.add(new GuardianFulgurAnjanath());
        monsters.add(new YianKutKu());
        monsters.add(new Gypceros());
        monsters.add(new Rathian());
        monsters.add(new Rathalos());
        monsters.add(new Gravios());
        monsters.add(new Blangonga());
        monsters.add(new JinDahaad());
        monsters.add(new GoreMagala());
        monsters.add(new Arkveld());

        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Monster Name:");

            String monsterName = myScanner.nextLine().toLowerCase();
            boolean found = false;
            for (Monster wantedMonster : monsters) {
                if (wantedMonster.Name.toLowerCase().contains(monsterName)) {
                    displayTable(wantedMonster);// Case-insensitive search
                    System.out.println("Monster found!"
                            + "\n Monster Name: " + wantedMonster.Name
                            + "\n ⭐⭐⭐ " + wantedMonster.ElementWeak3Star
                            + "\n ⭐⭐ " + wantedMonster.ElementWeak2Star
                            + "\n ⭐ " + wantedMonster.ElementWeak1Star
                            + "\n ❌ " + wantedMonster.ElementNulled);
                    found = true;
                    break; // Stop searching after finding the first match
                }
            }

            if (!found) {
                System.out.println("Monster not found.");
            }

        }
    }
    static void displayTable(String wantedMonster){
        // Header row
        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s |\n",
                "Name", "⭐⭐⭐", "⭐⭐", "⭐", "❌");
        System.out.println("|------------|------------|------------|------------|------------|");

        // Data rows
            System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s |\n",
                wantedMonster.Name,
                    wantedMonster.ElementWeak3Star,
            wantedMonster.ElementWeak2Star,
            wantedMonster.ElementWeak1Star,
            wantedMonster.ElementNulled);
            System.out.println("|------------|------------|------------|------------|------------|");

        System.out.println();
    }

    }

