package com.s2p.jobportel.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContactDto {

    @NotBlank(message = "Email cannot be Empty")
    @Email(message = "Email is not valid")
    private String email;

    @NotBlank(message = "Message cannot be Empty")
    @Size(min=5,max = 500, message = "Message must be 5 and 500 characters")
    private String message;

    @NotBlank(message = "Name cannot be Empty")
    @Size(min=2,max = 100, message = "Name must be 2 and 100 characters")
    private String name;

    @NotBlank(message = "Subject cannot be Empty")
    @Size(min=2,max = 100, message = "Subject must be 2 and 100 characters")
    private String subject ;

    @NotBlank(message = "User Type cannot be Empty")
    @Pattern(regexp = "(Job Seeker|Employer|Other)", message = "User Type must be : Job Seeker, Employer or Other")
    private String userType;

}
