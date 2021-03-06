package org.rabbitmq.training2.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student implements Serializable {

    private String name;

    private String firstname;

    private int age;
}
