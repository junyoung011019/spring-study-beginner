package junyoung011019.spring_study;

import jakarta.persistence.EntityManager;
import junyoung011019.spring_study.aop.TimeTraceAop;
import junyoung011019.spring_study.repository.JpaMemberRepository;
import junyoung011019.spring_study.repository.MemberRepository;
import junyoung011019.spring_study.repository.MemoryMemberRepository;
import junyoung011019.spring_study.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final JpaMemberRepository memberRepository;

    @Autowired
    public SpringConfig(JpaMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

}
