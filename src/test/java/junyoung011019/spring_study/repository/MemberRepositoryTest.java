package junyoung011019.spring_study.repository;

import junyoung011019.spring_study.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");
        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();
        assertThat(member1).isEqualTo(result);
    }

    @Test
    public void findAll(){

        List<Member> store = new ArrayList<>();

        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);
        store.add(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);
        store.add(member2);

        List result = repository.findAll();
        assertThat(store).isEqualTo(result);
    }

}
