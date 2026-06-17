package com.s2p.jobportel.dto;
import lombok.*;
import java.math.BigDecimal;
import java.time.Instant;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public class CompanyDto
    {
        private Long id;
        private String name;
        private String logo;
        private String industry;
        private String size;
        private BigDecimal rating;
        private String locations;
        private String founded;
        private String description;
        private String employees;
        private String website;
        private Instant createdAt;

}
