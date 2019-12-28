package com.cheng.targetmanager.controller;

import com.cheng.targetmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/task", method = RequestMethod.POST)
public class TaskController {
    private TaskService service;

    @Autowired
    public TaskController(TaskService service){this.service = service;}

}
