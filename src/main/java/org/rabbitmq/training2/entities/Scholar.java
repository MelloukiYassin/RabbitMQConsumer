package org.rabbitmq.training2.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SCHOLAR" )
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Scholar implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idScholar;

    private String name;

    private String firstname;

    private int age;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReceipt;
}
