package com.cydeo.task02lambda;


import com.cydeo.task01lambda.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.cydeo.task02lambda.Gender.*;

public class MemberTest {

    public static void main(String[] args) {

        List<Member> members = new ArrayList<>();

        members.add(new Member("Kemal", MALE, 25));
        members.add(new Member("Linda", FEMALE, 17));
        members.add(new Member("Mila", FEMALE, 29));
        members.add(new Member("Jonn", MALE, 22));
        members.add(new Member("Sara", FEMALE, 21));
        members.add(new Member("Mark", MALE, 24));

        System.out.println("/////////////////////////PREDICATE//////////////////////////////");

        Predicate<Member> memberPredicate = member -> member.getAge()>=18&&member.getAge()<=25&&member.getGender()==MALE;

        for (Member member : members) {
            if(memberPredicate.test(member)){
                System.out.println("Send message to " + member);
            }
        }

        System.out.println("/////////////////////////CONSUMER//////////////////////////////");

        Consumer<List<Member>> memberConsumer = p ->{

            for (Member member : p) {
                if(member.getAge()>=18&&member.getAge()<=25&&member.getGender()==MALE){
                    System.out.println("Send message to " + member);
                }
            }
        };

        memberConsumer.accept(members);

        System.out.println("/////////////////////////FUNCTION//////////////////////////////");

        Function<List<Member>,String> memberFunction = p -> {
            String result = "";
            for (Member member : p) {
                if(member.getAge()>=18&&member.getAge()<=25&&member.getGender()==MALE){
                    result+=  ("Send message to " + member+"\n");
                }
            }
           return result;
        };

        System.out.println(memberFunction.apply(members));;

    }
}
