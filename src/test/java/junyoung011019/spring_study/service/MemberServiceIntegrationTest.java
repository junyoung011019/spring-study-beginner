package junyoung011019.spring_study.service;

import junyoung011019.spring_study.domain.Member;
import junyoung011019.spring_study.repository.MemberRepository;
import junyoung011019.spring_study.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    void 회원가입() {
        //given
        Member member1 = new Member();
        member1.setName("테스트 유저1");

        //when
        Long saveId = memberService.join(member1);

        //then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(findMember).isEqualTo(member1);
    }

    @Test
    void 중복_회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("테스트 유저1");
        Member member2 = new Member();
        member2.setName("테스트 유저1");

        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다");

//        try{
//            memberService.join(member2);
//            fail();
//        }catch (IllegalStateException e){
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다");
//        }


        //then

    }

    @Test
    void 회원_찾기() {
        Member member3 = new Member();
        member3.setName("테스트 유저3");
        memberService.join(member3);

        Member member4 = new Member();
        member4.setName("테스트 유저4");
        memberService.join(member4);

        List result = memberService.findMembers();
        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void findOne() {
        Member member5 = new Member();
        member5.setName("테스트 유저5");
        memberService.join(member5);

        Member result = memberService.findOne(member5.getId()).get();
        assertThat(member5).isEqualTo(result);
    }
}