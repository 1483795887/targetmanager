package com.cheng.targetmanager.service;

import com.cheng.targetmanager.entity.Task;

public interface TaskService {
    void add(Task task);
    int getCount();
}
