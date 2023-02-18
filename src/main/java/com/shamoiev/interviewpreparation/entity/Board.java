package com.shamoiev.interviewpreparation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    private String name;

    @Column
    private Integer length;

    @Column
    private Integer width;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BoarderType boardType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Snowboarder snowboarder;

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public BoarderType getBoardType() {
        return boardType;
    }

    public void setBoardType(BoarderType boardType) {
        this.boardType = boardType;
    }

    public Snowboarder getSnowboarder() {
        return snowboarder;
    }

    public void setSnowboarder(Snowboarder snowboarder) {
        this.snowboarder = snowboarder;
    }
}
