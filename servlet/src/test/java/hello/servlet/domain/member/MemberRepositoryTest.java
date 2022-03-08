package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void save (){
        //given
        Member member = new Member("cy123",13);

        //when
        Member saveMember = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(saveMember.getMem_seq());
        Assertions.assertThat(findMember).isEqualTo(saveMember);
    }

    @Test
    void findAll (){
        //given
        Member member1 = new Member("cy123",14);
        Member member2 = new Member("cy456",15);
        memberRepository.save(member1);
        memberRepository.save(member2);

        //when
        List<Member> members = memberRepository.findALl();

        //then
        Assertions.assertThat(members.size()).isEqualTo(2);
    }
}
