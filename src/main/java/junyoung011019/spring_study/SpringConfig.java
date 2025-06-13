package junyoung011019.spring_study;

import jakarta.persistence.EntityManager;
import junyoung011019.spring_study.repository.JpaMemberRepository;
import junyoung011019.spring_study.repository.MemberRepository;
import junyoung011019.spring_study.repository.MemoryMemberRepository;
import junyoung011019.spring_study.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new JpaMemberRepository(em);
    }
}
