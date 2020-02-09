/*
* 코틀린에서는 전역변수와 지역변수의 이름이 중복되는 것을 허용한다.
* 이름이 중복되는 변수에 접근 할 때는
* 현재 실행되고 있는 코드와 가장 가까운 스코프에 있는 변수가 우선적으로 인식 된다.
*
*
*
* */

var x = 100;

fun main(args: Array<String>){
    val x = 30;
    println(x);
    myFun();
}

fun myFun(){
    val x = 100;
    println(x);
}