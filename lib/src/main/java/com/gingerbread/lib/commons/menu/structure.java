package com.gingerbread.lib.commons.menu;
/**
 * @author Carlos Ramos;
 */

public interface structure {
    public String getTitle();
    public String[] getOptions();
    public void setTitle(String title);
    public void setOptions(String[] options);
    public void print();
}
