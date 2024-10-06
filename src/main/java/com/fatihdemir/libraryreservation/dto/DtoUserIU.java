package com.fatihdemir.libraryreservation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoUserIU {

    private String name;

    private String email;

    private Date birtOfDate;

    private String studNum;

    private String university;

    private String department;

    private String grade;

    private Long phoneNum;

}
