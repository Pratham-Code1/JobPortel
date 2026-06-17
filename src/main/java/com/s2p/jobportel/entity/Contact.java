package com.s2p.jobportel.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "CONTACTS")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",nullable = false)
    private Long id;

    @Column(name = "EMAIL",nullable = false)
    private String email;

    @Lob
    @Column(name = "MESSAGE",nullable = false)
    private String message;

    @Column(name = "NAME",nullable = false)
    private String name;

    @ColumnDefault("'NEW'")
    @Column(name = "STATUS",nullable = false)
    private String status;

    @Column(name = "SUBJECT",nullable = false)
    private String subject;

    @Column(name = "USER_TYPE",nullable = false)
    private String userType;

    @Column(name = "CREATED_AT",nullable = false)
    private  Instant createdAt;

    @Column(name = "CREATED_BY",nullable = false,length = 20)
    private String createdBy;

    @Column(name = "UPDATED_AT",nullable = true)
    private Instant updatedAt;

    @Column(name = "UPDATED_BY",nullable = true)
    private String updatedBy;


}
