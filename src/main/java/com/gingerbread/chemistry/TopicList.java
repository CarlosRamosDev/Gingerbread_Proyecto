package com.gingerbread.chemistry;

import java.util.Scanner;

public class TopicList {
    public static Topic getList(Scanner scanner) {
        Topic topic = new Topic();
        topic.setName("Temas de la materia");
        topic.setDescription("Selecciona un tema para ver más información");
        topic.addSubtopic(Topic_1.Topic());
        topic.menu(scanner);
        return topic;
    }
}
