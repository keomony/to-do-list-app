package com.mony.todo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@ActiveProfiles("test")
@DataJpaTest
class TaskRepositoryTest {

    @Autowired
    TaskRepository taskRepository;

    @AfterEach
    void cleanUpDb() {
        taskRepository.deleteAll();
    }

    @Test
    public void findAll_ShouldReturnArrayOfTasksFromDB() {
        //Given
        //When
        List<Task> actualTasks = taskRepository.findAll();

        //Then
        Assertions.assertEquals(3, actualTasks.size());
        Assertions.assertEquals("database set up-test", actualTasks.get(0).getName());
        Assertions.assertEquals("true", actualTasks.get(2).getStatus());
    }

}