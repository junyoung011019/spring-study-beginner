package junyoung011019.spring_study.controller;

import junyoung011019.spring_study.domain.Member;
import junyoung011019.spring_study.service.MemberService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MemberForm {

    @Getter
    @Setter
    private String name;

}
