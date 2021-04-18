package com.mony.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
    private List<Task> allTasks = new ArrayList<>();

    public List<Task> findAll() {
        if (taskRepository.findAll().size() > 0) {
            allTasks = taskRepository.findAll();
        }
        return allTasks;
    }
}
