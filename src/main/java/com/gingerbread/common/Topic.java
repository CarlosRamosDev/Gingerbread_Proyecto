package com.gingerbread.common;

import java.util.ArrayList;
import java.util.Scanner;

public class Topic {
    private String name;
    private String description;
    private ArrayList<Topic> subtopics;

    public Topic(String name, String description, String[] options, ArrayList<Topic> subtopics) {
        setName(name);
        setDescription(description);
        setSubtopics(subtopics);
    }

    public Topic(String name, String description) {
        setName(name);
        setDescription(description);
        setSubtopics(null);
    }
    public Topic() {
        setName("");
        setDescription("");
        setSubtopics(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Topic> getSubtopics() {
        return subtopics;
    }

    public void setSubtopics(ArrayList<Topic> subtopics) {
        this.subtopics = subtopics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addSubtopic(Topic subtopic) {
        if (subtopics == null) {
            subtopics = new ArrayList<>();
        }
        subtopics.add(subtopic);
    }

    public void print() {
        System.out.println(name);
        System.out.println(description);
        if (subtopics != null) {
            for (Topic subtopic : subtopics) {
                System.out.println("\t" + subtopic.getName());
            }
        }
    }

    public void menu(Scanner scanner) {
        System.out.println("\n" + name);
        System.out.println(description);
        if (subtopics != null) {
            boolean exit = false;
            do {
                System.out.println("\nSubtemas:");
                for (int i = 0; i < subtopics.size(); i++) {
                    System.out.println((i + 1) + ") " + subtopics.get(i).getName());
                    if (i == subtopics.size() - 1) {
                        System.out.println((i + 2) + ") Salir");
                    }
                }
                try {
                    System.out.print("Seleccione un subtema o salir: ");
                    int option = scanner.nextInt();
                    if (option > 0 && option <= subtopics.size()) {
                        subtopics.get(option - 1).menu(scanner);
                    } if (subtopics.size() + 1 == option) {
                        exit = true;
                    }
                } catch (Exception e) {
                    System.out.println("Opción inválida");
                    scanner.nextLine();
                }
            } while (!exit);
            scanner.nextLine();
        }
    }
}
