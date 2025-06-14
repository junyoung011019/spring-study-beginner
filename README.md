# [인프런 독학] 스프링 부트 입문

<br>

## 🌟 소개

- Spring으로 졸업작품 개발을 할 때는 시간이 쫓겨 시간을 투자하지 못했는데, <br>
   작품을 마친 후 부족한 지식을 쌓기 위해 공부하고 기록하기 위해 만들었습니다.

- 2025.06.10 ~ 

- 목표

1. 섬세하고, 부족한 스프링 지식 채우기

2. 꾸준하게 기록하며, 코딩 습관 들이기

3. 실무에서 쓰는 기술 많이 익히기

> ### [📁 강의 : 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8/dashboard) 


<br>

## 강의 필기

### 2025년 06월 10일 (파트 1 ~ 파트 14)

#### 📌 핵심 요약

- 회원 엔티티 작성
- 메모리 입출력용 레포지토리 작성
- 서비스 레이어에 각 기능(가입, 조회 등) 구현
- 테스트 코드를 통해 검토

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 6 : 빌드하고 실행하기
gradlew (clean) build -> 빌드

#### 파트 9 : API
ResponseBody로 응답시 <br>
HttpMessageConverter로 전달  <br>
-> (객체면 -> JsonConverter / 문자열이면 -> StringConverter)

#### 파트 12 : 회원 리포지토리 테스트 케이스 작성성
테스트 코드 작성 시  <br>
레포지토리에 저장소.clear로 메모리 초기화 메소드 생성  <br>
테스트 코드에서 @AfterEach로 메모리 초기화 메소드 추가  <br>
-> 각 테스트 코드 실행 후 메모리 초기화
 <br> <br>
TDD (테스트 코드 -> 실제 코드 작성)

리포지토리 작명 - 개발 용어 <br>
서비스 - 비즈니스 용어

ctrl + shift +alt + t 메소드 추출


#### 파트 14 : 회원 서비스 테스트
ctrl + shift + t 테스트 케이스 만들기 <br>
ctrl + alt + v 생성자 생성 <br>
테스트 코드 메소드는 한글로 작성해도됨 <br>
given (생성) - when (값 주입) - then (검증) 주석

try catch 대체 예외 처리  <br>
assertThrows(IllegalStateException.class, ()-> memberService.join(member2));

@BeforeEach를 통해서 <br>
MemberService와 Test 간 레포지토리 통일 (의존성 주입)

</details>



### 2025년 06월 11일 (파트 15 ~ 파트 16)

#### 📌 핵심 요약

- @Service, @Repository 등 자동 의존 관계 설정
- @Config 파일을 통해 @Bean에 클래스, 인터페이스 등록을 통한 의존 관계 설정

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 15
@Service, @Controller, @Repository 등 각 클래스 상단에 작성해서 스프링 컨테이너에 등록 (싱글톤으로 등록- [유일하게 하나로] )
-> 모두 @Componet를 활용해서, 메인에서 컴포넌트 스캔이 발생함

@Autowired + 생성자 작성을 통해 의존성 주입
-> @RequiredArgsConstructor를 통해 두가지 작업 병합

#### 파트 : 16
빈으로 직접 등록하기
@Configuration으로 등록된 SpringConfig에
각 클래스, 인터페이스(서비스, 레포지토리 등)를 @Bean으로 설정

사용 이유 : 정형화 되지 않거나, 추후에 구현 클래스를 수정해야하는 경우
설정 파일 일부만 수정하면 됨(생성자 주입 변경 메모리 레포지토리 -> 실제 레포지토리)
ex) 현재 메모리에 저장 -> 추후 DB 연동

의존 주입(필드 - 직접 필드에 @Autowired - 변경 불가로 비추/세터- setter로 주입 - public으로 노출됨/생성자 - 실행 이후 동적으로 변경될 일이 없음 추천)

</details>

### 2025년 06월 12일 (파트 17 ~ 파트 21)

#### 📌 핵심 요약

- 회원 등록 및 조회 기능 구현
- 타임리프를 통한 웹 출력
- DB(H2->MySQL) 연동 및 DB 설정
- (과거) JDBC 작동 과정 조회 -> C++에서 해봄

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 19
model.addAttribute로 html 파일로 전달하면,
타임리프를 통해 값 받아와서 출력
each="i : ${전달 값}" -> 각 리스트 접근 -> getter에서 값 불러와서 출력

#### 파트 : 21
JDBC -> 직접 DB 연결(끊기) 작성 및 쿼리 작성 해야함
객체지향 다형성 특성 덕에 @Bean에서 레포지토리만 바꿔주면 정상 작동
(메모리 -> DB)

</details>

### 2025년 6월 13일 (파트 22, 파트 24) 
// 기말고사 이슈로 많이 진행하지 못했음

#### 📌 핵심 요약
- JDBC -> JPA
- Spring 통합 테스트
- JPA 중점으로 하기 위해 파트 24(JPA)를 선 수강 후, 파트 22(스프링 통합 테스트 수강)

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 24

엔티티 설정
1. strategy = GenerationType. ~
- AUTO : 자동
- IDENTITY : Auto Incremnet 기능 (MySQL)
- SEQUENCE : 별도의 시퀀스 객체 만들어서 활용 (Oracle)
- UUID : 고유 값

2. Column(name= "속성명")

레포지토리
EntityManager로 매핑
em.persist -> 영구저장

서비스
클래스에 @Transactional 작성

JPQL - 객체 지향 클래스 SQL

#### 파트 : 22

작성해둔 테스트 코드 실행
@SpringBootTest
@Transactional(트랜잭션 커밋 X)

단위 테스트 -> 각 기능별 테스트 (각 기능 구현에 대한 테스트)
통합 테스트 -> DB 연동까지 (설계에 대한 테스트)

</details>

### 2025년 6월 14일 (파트 23, 파트 25)

#### 📌 핵심 요약

- JDBC : 직접 쿼리 작성, DB 연결 설정 
- JDBC Template : 직접 쿼리 작성 
- JPA : 위 기능 간단하게 제공(구현 클래스만 작성)
- Spring JPA : 인터페이스만 작성하면됨

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 23

jdbc의 반복 코드 제거 -> jdbc 템플릿
똑같이 SpringConfig에서 (Memory, Jdbc, Jdbc Template, JPA) 갈아끼우면됨
rowMapper에서 검색한 데이터 가져옴 -> 객체 생성해서 세터로 값 설정 -> 리스트 / 객체 리턴
최대한 테스트 케이스 많이 작성하기

#### 파트 : 25

Spring JPA 인터페이스를 통한 기본적인 CRUD 제공
하지만 JPA는 알아야함(Spring JPA로 해결 안되면, JPA나 JDBC Template 혼합 사용)
동적 쿼리 (상황따라 유동적) Querydsl

⭐ 기초로 넘어가기전에 JDBC Template, JPA, Spring JPA 한번 더 공부해보기

</details>



<br><br><br><br>

### 2025년 월 일 (파트  ~ 파트 )

#### 📌 핵심 요약

-

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 1

</details>
