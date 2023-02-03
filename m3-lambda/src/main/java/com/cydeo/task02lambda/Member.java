package com.cydeo.task02lambda;


import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Member {
    private String name;
    private Gender gender;
    private int age;
}
