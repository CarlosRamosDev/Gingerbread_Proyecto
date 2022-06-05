package com.gingerbread.common.interfaces;

public interface Menu {
    public String getTitle();

    public void setTitle(String title);

    public String[] getOptions();

    public void setOptions(String[] options);

    public String getBottomText();

    public void setBottomText(String bottomText);

    public int getPauseByEnter();

    public void setPauseByEnter(int pauseByEnter);
}
