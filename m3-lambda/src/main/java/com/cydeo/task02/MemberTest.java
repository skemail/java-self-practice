package com.cydeo.task02;

import java.util.ArrayList;
import java.util.List;

import static com.cydeo.task02.Gender.*;

public class MemberTest {

    public static void main(String[] args) {

        List<Member> members = new ArrayList<>();

        members.add(new Member("Kemal", MALE, 25));
        members.add(new Member("Linda", FEMALE, 17));
        members.add(new Member("Mila", FEMALE, 29));
        members.add(new Member("Jonn", MALE, 22));
        members.add(new Member("Sara", FEMALE, 21));
        members.add(new Member("Mark", MALE, 24));

        sendMessage(members,new EligibleMessageImp());


    }
    private static void sendMessage(List<Member> members, MemberPredicate p){

        for (Member member : members) {
            if(p.test(member)){
                System.out.println("Send message to " + member.toString());
            }
        }
    }
}
