package com.gingerbread.lib.commons.menu;

public class Menu implements structure {
    private String title;
    private String[] options;

    public Menu() {
        this.title = "";
        this.options = null;
    }

    public Menu(String title, String[] options, String content) {
        this.title = title;
        this.options = options;
    }

    public String getTitle() {
        return this.title;
    }

    public String[] getOptions() {
        return this.options;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void print() {
        System.out.println("-------- " + this.title + " --------");
        if (this.options != null) {
            for (int i = 1; i < this.options.length; i++) {
                if (this.options[i] != null) {
                    System.out.println(i + ". " + this.options[i]);
                }
            }
            System.out.print("Seleccione una opción: ");
        }

    }
}
