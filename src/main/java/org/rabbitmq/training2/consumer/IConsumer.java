package org.rabbitmq.training2.consumer;

import org.rabbitmq.training2.json.Student;

public interface IConsumer {
    void consumerMessage(Student student);
}
