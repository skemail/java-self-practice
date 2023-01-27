package com.cydeo.task02;

import static com.cydeo.task02.Gender.*;

public class EligibleMessageImp implements MemberPredicate{
    @Override
    public boolean test(Member member) {
        return member.getAge()>=18&&member.getAge()<=25&&member.getGender()==MALE;
    }
}
