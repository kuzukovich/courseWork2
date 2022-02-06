package com.example.coursework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.coursework2.ExaminerServiceImplConstants.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionService javaQuestionServiceMock;

    @InjectMocks
    private ExaminerServiceImpl out;

    @BeforeEach
    public void initTestService() {
        out = new ExaminerServiceImpl(javaQuestionServiceMock);
    }


    @Test
    void getQuestionsTest() {
        when(javaQuestionServiceMock.getRandomQuestion()).thenReturn(ACTUAL_QUESTION_V1, ACTUAL_QUESTION_V2, ACTUAL_QUESTION_V3);
        when(javaQuestionServiceMock.getAll()).thenReturn(EXPECTED_QUESTIONS);
        assertTrue(EXPECTED_QUESTIONS.containsAll(out.getQuestions(AMOUNT)));
    }

    @Test
    void getQuestionsTestQuestionException() {
        assertThrows(QuestionException.class, () -> out.getQuestions(AMOUNT));

    }
}