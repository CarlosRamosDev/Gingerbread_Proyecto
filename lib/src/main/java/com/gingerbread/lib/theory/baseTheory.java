package com.gingerbread.lib.theory;

import com.gingerbread.lib.theories;

public class baseTheory implements theories {
    private String title;
    private String description;
    private String author;
    private String date;
    private String[][] example;

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getDate() {
        return this.date;
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String[][] getExample() {
        return this.example;
    }

    @Override
    public void setExample(String[][] example) {
        this.example = example;
    }
}
