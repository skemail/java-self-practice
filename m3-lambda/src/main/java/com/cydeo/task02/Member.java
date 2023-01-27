package com.cydeo.task02;

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
