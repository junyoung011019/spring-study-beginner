# [인프런 독학] 스프링 부트 입문

<br>

## 🌟 소개

- Spring으로 졸업작품 개발을 할 때는 시간이 쫓겨 시간을 투자하지 못했는데, <br>
   작품을 마친 후 부족한 지식을 쌓기 위해 공부하고 기록하기 위해 만들었습니다.

- 2025.06.10 ~ 

- 목표

1. 부족한 스프링 지식 채우기

2. 꾸준하게 기록하며, 코딩 습관 들이기

3. 실무에서 쓰는 기술 많이 익히기

> ### [📁 강의 : 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8/dashboard) 


<br>

## 강의 필기

<details>
<summary> 2025년 06월 10일 </summary>

### 파트 6 : 빌드하고 실행하기
gradlew (clean) build -> 빌드

### 파트 9 : API
ResponseBody로 응답시 <br>
HttpMessageConverter로 전달  <br>
-> (객체면 -> JsonConverter / 문자열이면 -> StringConverter)

### 파트 12 : 회원 리포지토리 테스트 케이스 작성성
테스트 코드 작성 시  <br>
레포지토리에 저장소.clear로 메모리 초기화 메소드 생성  <br>
테스트 코드에서 @AfterEach로 메모리 초기화 메소드 추가  <br>
-> 각 테스트 코드 실행 후 메모리 초기화
 <br> <br>
TDD (테스트 코드 -> 실제 코드 작성)

리포지토리 작명 - 개발 용어 <br>
서비스 - 비즈니스 용어

ctrl + shift +alt + t 메소드 추출


### 파트 14 : 회원 서비스 테스트
ctrl + shift + t 테스트 케이스 만들기 <br>
ctrl + alt + v 생성자 생성 <br>
테스트 코드 메소드는 한글로 작성해도됨 <br>
given (생성) - when (값 주입) - then (검증) 주석

try catch 대체 예외 처리  <br>
assertThrows(IllegalStateException.class, ()-> memberService.join(member2));

@BeforeEach를 통해서 <br>
MemberService와 Test 간 레포지토리 통일 (의존성 주입)

</details>