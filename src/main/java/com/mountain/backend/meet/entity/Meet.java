package com.mountain.backend.meet.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Meet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Name("meetId")
    private Long id;

    @Column(nullable = false)
    private String title;       // 모임명

    @Column(nullable = false)
    private LocalDateTime departureDate;   // 모임일정

    @Column(nullable = false)
    private int meetSize;        // 모집인원

    @Column(nullable = false)
    private String age;         // 연령대

    @Column(nullable = false)
    private String gender;      // 성별

    @Column(nullable = false)
    private String tag;         // 태그

    @Column(nullable = false)
    private String location;    // 모임위치 - 산일수도 있고 식당일수도 있음

    @Column(nullable = false)
    private String course;       // 등산코스 - 산일경우

    @Column(nullable = false)
    private String content;     // 모임설명

    @Column(nullable = false)
    private LocalDate openDate;    // 모집시작일

    @Column(nullable = false)
    private LocalDate closingDate;     // 모집마감일

}
