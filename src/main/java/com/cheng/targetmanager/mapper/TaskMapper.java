package com.cheng.targetmanager.mapper;

import com.cheng.targetmanager.entity.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TaskMapper {
    int getCount();

    void add(Task task);

    List<Task> getTasks(Map<String,Object> map);
}
