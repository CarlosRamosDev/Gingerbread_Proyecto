package com.gingerbread.common.interfaces;

public interface Menu {
    String getTitle();

    void setTitle(String title);

    String[] getOptions();

    void setOptions(String[] options);

    String getBottomText();

    void setBottomText(String bottomText);

    int getPauseByEnter();

    void setPauseByEnter(int pauseByEnter);
}
