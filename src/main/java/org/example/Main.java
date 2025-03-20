package org.example;
import java.util.Arrays;
import java.util.List;
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
            if (monsterName.equalsIgnoreCase("exit")){
                System.out.println("Closing program.");
                System.exit(0);
            }
            boolean found = false;
            for (Monster wantedMonster : monsters) {
                if (wantedMonster.Name.toLowerCase().contains(monsterName)) {
                    System.out.println("Monster found!");
                    displayTable(wantedMonster);// Case-insensitive search
                    found = true;
                    break; // Stop searching after finding the first match
                }
            }

            if (!found) {
                System.out.println("Monster not found.");
            }

        }
    }


    static void displayTable(Monster wantedMonster) {
        // Header row
        System.out.println("|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|");

        System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |\n",
                "Name", "***", "**", "*", "X");

        System.out.println("|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|");

        // Split long name at spaces within 15 characters
        List<String> nameLines = splitByLength(wantedMonster.Name);

        // Split weaknesses by spaces
        List<String> weak3StarLines = splitBySpace(wantedMonster.ElementWeak3Star);
        List<String> weak2StarLines = splitBySpace(wantedMonster.ElementWeak2Star);
        List<String> weak1StarLines = splitBySpace(wantedMonster.ElementWeak1Star);
        List<String> nulledLines = splitBySpace(wantedMonster.ElementNulled);

        // Determine max number of rows needed
        int maxRows = Math.max(nameLines.size(), Math.max(weak3StarLines.size(),
                Math.max(weak2StarLines.size(), Math.max(weak1StarLines.size(), nulledLines.size()))));

        // Print rows dynamically
        for (int i = 0; i < maxRows; i++) {
            String namePart = i < nameLines.size() ? nameLines.get(i) : "";
            String weak3Part = i < weak3StarLines.size() ? weak3StarLines.get(i) : "";
            String weak2Part = i < weak2StarLines.size() ? weak2StarLines.get(i) : "";
            String weak1Part = i < weak1StarLines.size() ? weak1StarLines.get(i) : "";
            String nulledPart = i < nulledLines.size() ? nulledLines.get(i) : "";

            System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s |\n",
                    namePart, weak3Part, weak2Part, weak1Part, nulledPart);
        }

        System.out.println("|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|–––––––––––––––––|");
    }



    // Splits a string into chunks of a specified length
    static List<String> splitByLength(String text) {
        List<String> result = new ArrayList<>();
        int start = 0;

        while (start < text.length()) {
            int end = Math.min(start + 15, text.length());

            // If the substring reaches the max length and isn't at the end of the text
            if (end < text.length() && text.charAt(end) != ' ') {
                int lastSpace = text.lastIndexOf(' ', end);
                if (lastSpace > start) {
                    end = lastSpace; // Move end to the last space before the limit
                }
            }

            result.add(text.substring(start, end).trim());
            start = end + 1; // Move past the space
        }

        return result;
    }


    // Splits a string by spaces to fit table rows dynamically
    static List<String> splitBySpace(String text) {
        return Arrays.asList(text.split(" "));
    }
}