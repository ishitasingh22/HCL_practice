package org.example.day1assignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            StudentService service =
                    context.getBean(StudentService.class);

            service.displayStudentProfile();
        }
    }
}