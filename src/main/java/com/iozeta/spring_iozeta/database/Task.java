package com.iozeta.spring_iozeta.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Tasks")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "branch_name")
    private String branchName;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @OneToMany(mappedBy = "task")
    private Set<Checkpoint> checkpoints = new HashSet<>();

    @OneToMany(mappedBy = "task")
    private Set<Session> sessions = new HashSet<>();
}
