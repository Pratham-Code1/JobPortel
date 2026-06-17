package com.s2p.jobportel.entity;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "COMPANIES")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "LOGO",length = 200)
    private String logo;

    @Column(name = "INDUSTRY",nullable = false,length = 200)
    private String industry;

    @Column(name = "SIZE",nullable = false,length = 20)
    private String size;

    @Column(name = "RATING",nullable = false,precision = 3,scale = 2)
    private BigDecimal rating;

    @Column(name = "LOCATIONS",nullable = false,length = 1000)
    private String locations;

    @Column(name = "FOUNDED",nullable = false)
    private String founded;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "EMPLOYEES")
    private String employees;

    @Column(name = "WEBSITE",length = 200)
    private String website;

    @Column(name = "Created_AT",nullable = true)
    private Instant createdAt;

    @Column(name="CREATED_BY",nullable = true)
    private String createdBy;

    @Column(name = "UPDATED_AT",nullable = true)
    private Instant updatedAt;

    @Column(name="UPDATED_BY",nullable = true)
    private String updatedBy;

}
