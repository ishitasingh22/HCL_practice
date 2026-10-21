package org.example.notificationservice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Student {
    private NotificationService notificationService;
    @Autowired
    public Student(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    public void notifyStudent(){
        notificationService.sendMessage("Your assessment is scheduled");
    }
    @PostConstruct
       public void init(){
        System.out.println("Object Created");
    }
    @PreDestroy
      public void destroy(){
        System.out.println("Object Destroyed");
    }
}
