package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Monster[] monsters = {
                new Chatacabra(),
                new Quematrice(),
                new LalaBarina(),
                new Congalala(),
                new Balahara(),
                new Doshaguma(),
                new UthDuna(),
                new Rompopolo(),
                new ReyDau(),
                new Nerscylla(),
                new Hirabami(),
                new Ajarakan(),
                new NuUdra(),
                new GuardianDoshaguma(),
                new GuardianRathalos(),
                new GuardianEbonyOdoragon(),
                new XuWu(),
                new GuardianArkveld(),
                new ZohShia(),
                new GuardianFulgurAnjanath(),
                new YianKutKu(),
                new Gypceros(),
                new Rathian(),
                new Rathalos(),
                new Gravios(),
                new Blangonga(),
                new JinDahaad(),
                new GoreMagala(),
                new Arkveld()
        };

        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Monster Name:");

            String monsterName = myScanner.nextLine().toLowerCase();
            boolean found = false;
            for (Monster wantedMonster : monsters) {
                if (wantedMonster.Name.toLowerCase().contains(monsterName)) { // Case-insensitive search
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
    }

