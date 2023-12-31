package com.example.SpringbootMicroservice1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "suggestion")
public class Suggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;
    @Column(name = "text", length = 255, nullable = false)
    private String text;
}
