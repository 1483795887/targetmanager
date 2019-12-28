package com.cheng.targetmanager.mapper;

import com.cheng.targetmanager.entity.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskMapper {
    int getCount();

    void add(Task task);
}
