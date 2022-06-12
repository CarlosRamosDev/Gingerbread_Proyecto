package com.gingerbread.chemistry;

import com.gingerbread.common.Topic;

import java.util.Scanner;

public class TopicList {
    public static void topicList(Scanner scanner) {
        Topic topic = new Topic();
        topic.setName("Temas de la materia");
        topic.setDescription("Selecciona un tema para ver más información");
        topic.addSubtopic(Topic_1.Topic());
        topic.addSubtopic(Topic_2.Topic());
        topic.addSubtopic(Topic_3.Topic());
        topic.addSubtopic(Topic_4.Topic());
        topic.addSubtopic(Topic_5.Topic());
        topic.addSubtopic(Topic_6.Topic());
        topic.menu(scanner);
    }
}
