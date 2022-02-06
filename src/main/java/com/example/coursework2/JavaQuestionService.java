package com.example.coursework2;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions;
    public JavaQuestionService() {
        questions = new HashSet<>();
//        questions.add(new Question("Что такое Java?",
//                "Это объектно-ориентированный язык программирования общего назначения высокого уровня"));
//        questions.add(new Question("Что такое интерфейс Java",
//                "Это шаблон, который содержит только объявления методов, но не их реализации"));
//        questions.add(new Question("Что такое модификатор доступа?",
//                "Ключевое слово в Java, используемое для ограничения доступа"));
//        questions.add(new Question("Какой метод запускает программу на Java",
//                "Метод main"));
//        questions.add(new Question("Как называется оператор увеличения, который увеличивает значение переменной на единицу?",
//                "Инкремент"));
//        questions.add(new Question("Какая сущность веб-приложения на Spring отвечает за обработку запросов?",
//                "Класс-контроллер"));
//        questions.add(new Question("Какая сущность в веб-приложении на Spring отвечает за логику?",
//                "Сервис"));
//        questions.add(new Question("Что такое хип",
//                "Место в памяти, в котором хранятся объекты"));
//        questions.add(new Question("Что такое геттеры",
//                "Это метод, который возвращает значение поля/свойства объекта"));
//        questions.add(new Question("Какой тип ошибок выбрасывается JVM в случае критических ситуаций",
//                "Error"));
    }

    @Override
    public Question add(String question, String answer) {
        Question questions = new Question(question, answer);
        return add(questions);
    }

    @Override
    public Question add(Question question) {
        if (questions.contains(question)) {
            throw new QuestionExistsException();
        }
        questions.add(question);
        return question;
    }

    public Question remove(String question, String answer) {
        Question questions = new Question(question, answer);
        return remove(questions);
    }

    @Override
    public Question remove(Question question) {

        if (questions.contains(question)) {
            questions.remove(question);
        } else {
            throw new QuestionExistsException();
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return new ArrayList<>(questions);
    }

    @Override
    public Question getRandomQuestion() {
        ArrayList<Question> questionsList = new ArrayList<>(questions);
        Random random = new Random();
        return questionsList.get(random.nextInt(questionsList.size()));
    }
}
