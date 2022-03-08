package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    long mem_seq;
    String id;
    int age;

    public Member(){
    }

    public Member(String id ,int age){
        this.id = id;
        this.age = age;
    }

}
