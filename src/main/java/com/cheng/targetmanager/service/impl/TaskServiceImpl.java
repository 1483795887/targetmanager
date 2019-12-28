package com.cheng.targetmanager.service.impl;

import com.cheng.targetmanager.entity.Task;
import com.cheng.targetmanager.mapper.TaskMapper;
import com.cheng.targetmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskMapper mapper;

    @Autowired
    public TaskServiceImpl(TaskMapper mapper){this.mapper = mapper;}

    @Override
    public void add(Task task) {
        mapper.add(task);
    }

    @Override
    public int getCount() {
        return mapper.getCount();
    }
}
