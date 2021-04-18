package com.mony.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {
    @Mock
    TaskRepository taskRepository;

    @InjectMocks
    TaskService taskService;

    @Test
    void findAll_shouldFindAllTasksFromRepositoryWithMockedReturnValue() {
        //Given
        Task task = new Task(1, "task1", "undone");
        List<Task> expectedTasks = new ArrayList<>();
        expectedTasks.add(task);
        when(taskRepository.findAll()).thenReturn(expectedTasks);

        //When
        List<Task> actualTasks = taskService.findAll();

        //Then
        Assertions.assertEquals(expectedTasks.get(0).getId(), actualTasks.get(0).getId());
    }
}