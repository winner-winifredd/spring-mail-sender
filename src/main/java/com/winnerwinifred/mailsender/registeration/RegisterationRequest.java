package com.winnerwinifred.mailsender.registeration;


import org.hibernate.annotations.NaturalId;

//RECORDS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public record RegisterationRequest(
        String firstName,
        String lastName,
        String email,
        String password,
        String role
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
) {
}
