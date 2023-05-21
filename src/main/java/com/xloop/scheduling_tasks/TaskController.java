package com.xloop.scheduling_tasks;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
@EnableScheduling
public class TaskController {
    
    public TaskController(){
        System.out.println("This is a contructor");
    }

    @GetMapping("/todo")
    public void task(){
        System.out.println("this is a new tasks");
    }


}
