package com.example.coursework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExaminerServiceImplConstants {
    public static final Question ACTUAL_QUESTION_V1 = new Question("Что такое Java", "Это объектно-ориентированный язык программирования общего назначения высокого уровня");
    public static final Question ACTUAL_QUESTION_V2 = new Question("Что такое интерфейс Java?", "Это шаблон, который содержит только объявления методов, но не их реализации");
    public static final Question ACTUAL_QUESTION_V3 = new Question("Что такое хип?", "Место в памяти, в котором хранятся объекты");
    public static final Collection<Question> EXPECTED_QUESTIONS = new ArrayList<>(List.of(
            new Question("Что такое Java", "Это объектно-ориентированный язык программирования общего назначения высокого уровня"),
            new Question("Что такое интерфейс Java?", "Это шаблон, который содержит только объявления методов, но не их реализации"),
            new Question("Что такое хип?", "Место в памяти, в котором хранятся объекты")
    ));
    public static final int AMOUNT = 3;
}
