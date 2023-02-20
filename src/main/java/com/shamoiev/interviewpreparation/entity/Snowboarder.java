package com.shamoiev.interviewpreparation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.OffsetDateTime;

@Entity
public class Snowboarder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    private String name;

    @Column(nullable = false)
    private String password;

    private OffsetDateTime dateOfBirth;

    @Transient
    private String someField;

//    @OneToMany(mappedBy = "snowboarder", fetch = FetchType.EAGER)
//    private List<Board> boards;

    @JsonIgnore
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public OffsetDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(OffsetDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    public List<Board> getBoards() {
//        return boards;
//    }
//
//    public void setBoards(List<Board> boards) {
//        this.boards = boards;
//    }
}
