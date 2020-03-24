# kotlin2020

# 코틀린 study

## 코틀린이란?

1. 코틀린은 인텔리제이를 만든 젯브레인에서 만든 언어로 17년 구글 i/o에서 안드로이드 공식 언어로 채택.
2. 안드로이드를 위해 만들어진 언어가 아님
3. 안드로이드 공식 언어로 소개되기 전부터 java언어의 대체 언어로 주목
4. 현재 많은 java프로젝트가 kotlin으로 개발중
5. jvm에서 동작 즉, 소스 코드가 자바 바이트 코드로 빌드됨
   100% 자바와 호환이 되기 때문에 안드로이드 뿐만 아니라 java로 개발하는 모든 개발 분야, 모든 프레인워크에서 동작

### 자바 vs 코틀린

1. 최신 페러다임
2. 생산성
3. 안드로이드 공식 지원언어

### 사용가능 분야

1. 코틀린 팀은 안드로이드, 자바로 개발되던 서버 측 웹 어플리케이션 분야 외에도 자바스크림트로 개발 되던 프론트엔드 웹 어플리케이션 분야에도 사용할 수 있도록 하는 것이 목표
2. MaxOS, Ios, iot/임메비드 시스템과 같은 다른 플랫폼에서 실행되는 에이티브 어플리케이션 분야에서도 활용할 수 있도록 연구중.

## 환경설정

1. jdk : 환경변수 설정. bin 위치까지
2. 인텔리제이 : 64bit/ kt/java 설정

### 001

1. 패키지 레벨 함수

   <pre>
   <code>
   fun main(args: Array<String>):Unit{
     println("Hello world"); //줄바꿈 포함 하는 함수
   }
   
   
   </code>
   </pre>

### 002

1. val (변경불가 : const) and var (변경가능 : let)

   <pre>
   <code>
       typealias moon = String;
   
       fun main(args: Array<String>):Unit{
       var ch:Char= 'A';
       var str:String ="Hello World";
   
             println("안녕 $ch , $str");
   
             //typealias
   
             var h:moon = "String";
             println(h)
   
       }

</code>
</pre>

### 003

<pre>
<code>
fun main(args: Array<String>):Unit{
    var ch:Char= 'A';
    var str:String ="Hello World";


    println("안녕 $ch , $str");

    //typealias

}
</code>
</pre>

### 003

<pre>
<code>
if(a<10) "he;;p" else "Sdd" //3항 연산자 대신 if사용
</code>
</pre>

### 003

<pre>
<code>
when으로 swich 케이스 문을 대신한다.

val result:String = when(jumsu/10){
  7-> {
    println("ddd")
  }
  9-> {
  println("2")
  }
  2-> {
    println("2")
  }
  else -> {
    println("Ddd)
  }
}
</code>
</pre>

### 003

<pre>
<code>
변수 : 메모리 -> 공간을 의미 한다. -> RAM
지역 변수 ? -> stack
전역 변수 ? -> heap

객체의 변수는 스택 영역(참조변수)에 있으면서 heap 영역으 주소 값을 가지고 있다.
객체 내부의 값은 heap 영역에 저장되어 있는 것이다.
</code>
</pre>

# Class

1. 객체를 찍어내는 틀과 같다고 할 수 있다.

   <pre>
   <code>
     class Person{
       var name : String = "";
       var age : Int = 0;
       var phone : String = ""
     }
   
     val person: Person =
   </code>
   </pre>

## heap 영역을 사용하는 이유.

1. stack -> 함수에서 사용하는 매개변수 / 지역 변수 / 객체의 주소
2. heap -> 객체의 key + value / 문자열                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
3. 참조 변수로 위치 값을 공유하고 있게 된다.
