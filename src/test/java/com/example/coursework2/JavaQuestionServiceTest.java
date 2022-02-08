package com.example.coursework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Set;

import static com.example.coursework2.JavaQuestionServiceConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    private JavaQuestionService out = new JavaQuestionService();

    @BeforeEach
    public void unit() {
        out = new JavaQuestionService();
    }

    @Test
    void addSimple() {
        Question actual = out.add(QUESTION_V1, ANSWER_V1);
        Question expected = new Question(QUESTION_V1, ANSWER_V1);
        assertEquals(actual, expected);
    }

    @Test
    void addDuplicate() {
        out.add(QUESTION_V1, ANSWER_V1);
        assertThrows(QuestionExistsException.class, () -> out.add(QUESTION_V1, ANSWER_V1));
    }

    @Test
    void removeSimple() {
        out.add(QUESTION_V1, ANSWER_V1);
        Question actual = out.remove(QUESTION_V1, ANSWER_V1);
        Question expected = new Question(QUESTION_V1, ANSWER_V1);
        assertEquals(actual, expected);
    }

    @Test
    void removeAbsent() {
        assertThrows(QuestionExistsException.class, () -> out.remove(QUESTION_V1, ANSWER_V1));
    }

    @Test
    void getAll() {
        out.add(QUESTION_V1, ANSWER_V1);
        out.add(QUESTION_V2, ANSWER_V2);
        Collection<Question> actual = out.getAll();
        Set<Question> expected = Set.of(
                new Question(QUESTION_V1, ANSWER_V1),
                new Question(QUESTION_V2, ANSWER_V2));
        assertEquals(actual.size(), expected.size());
        assertTrue(expected.containsAll(actual));
    }

}