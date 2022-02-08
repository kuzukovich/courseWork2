package com.example.coursework2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        HashSet<Question> questionsExam = new HashSet<>();
        if (questionService.getAll().size() < amount) {
            throw new QuestionException();
        }
        while (questionsExam.size() < amount) {
            Question questionNow = questionService.getRandomQuestion();
            questionsExam.add(questionNow);
        }
        return questionsExam;
    }
}
