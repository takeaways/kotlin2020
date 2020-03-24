package studyTwo

// 보조 생성자 : 여러개의 생성자를 정의하는 방법

/*
*주생성자
* class 클래스이름 constructor(매개 변수){
*   //보조 생성자 1
*   constructor(매개 변수 ) : this(인수){...}
*   //보조 생성자 2
*   constructor(매개 변수 ) : this(인수){...}
*
*
* }
*
*
*
* */

class Demo2(val seconds:Int){
    init{
        println("call init");
    }

    //c1
    constructor(minute:Int, seconds:Int):this(minute*60 + seconds);
    //c2
    constructor(hour:Int, minute: Int, seconds: Int):this(hour*60+ minute, seconds){
        println("call init");
    }




}