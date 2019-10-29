package com.home.development.reminder.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String noteText;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "noteCreator_id")
    private User noteCreator;

    public Note(String noteText, User noteCreator) {
        this.noteText = noteText;
        this.noteCreator = noteCreator;
    }

    public Note(String noteText) {
        this.noteText = noteText;
    }
}
