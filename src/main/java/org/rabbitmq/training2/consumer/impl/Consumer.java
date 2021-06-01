package org.rabbitmq.training2.consumer.impl;

import org.rabbitmq.training2.consumer.IConsumer;
import org.rabbitmq.training2.entities.Scholar;
import org.rabbitmq.training2.json.Student;
import org.rabbitmq.training2.repositories.ScholarRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Consumer implements IConsumer {

    private ScholarRepository scholarRepository;

    public Consumer(ScholarRepository scholarRepository) {
        this.scholarRepository = scholarRepository;
    }

    @Override
    @RabbitListener(queues = "${udemy.rabbitmq.queue}")
    public void consumerMessage(Student student) {
        Scholar scholar = Scholar.builder().name(student.getName()).firstname(student.getFirstname()).age(student.getAge()).dateReceipt(new Date()).build();
        this.scholarRepository.save(scholar);
        System.out.println("Received message - "+student.toString());
    }
}
