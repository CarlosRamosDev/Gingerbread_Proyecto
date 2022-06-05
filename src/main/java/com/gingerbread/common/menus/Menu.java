package com.gingerbread.common.menus;

import java.util.Scanner;

public class Menu implements com.gingerbread.common.interfaces.Menu {
    private String title;
    private String[] options;
    private String bottomText;
    private int pauseByEnter;

    public Menu() {
        this.title = "";
        this.options = null;
        this.bottomText = "";
        this.pauseByEnter = 0;
    }

    public Menu(String title, String[] options, String bottomText, int pauseByEnter) {
        this.title = title;
        this.options = options;
        this.bottomText = bottomText;
        this.pauseByEnter = pauseByEnter;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String[] getOptions() {
        return this.options;
    }

    @Override
    public void setOptions(String[] options) {
        this.options = options;
    }

    @Override
    public String getBottomText() {
        return this.bottomText;
    }

    @Override
    public void setBottomText(String bottomText) {
        this.bottomText = bottomText;
    }

    @Override
    public int getPauseByEnter() {
        return this.pauseByEnter;
    }

    @Override
    public void setPauseByEnter(int pauseByEnter) {
        this.pauseByEnter = pauseByEnter;
    }

    public String printMenu(Scanner scanner) {
        String option;
        System.out.println("-------- " + this.title + " --------");
        if (this.options != null) {
            for (int i = 0; i < this.options.length; i++) {
                if (this.options[i] != null) {
                    System.out.println(i + ". " + this.options[i]);
                }
            }
        }
        System.out.print(this.bottomText);
        option = scanner.nextLine();
        if (this.pauseByEnter != 0) {
            for (int i = 0; i < this.pauseByEnter; i++) {
                scanner.nextLine();
            }
        }
        return option;
    }
}
