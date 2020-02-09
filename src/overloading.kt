/*
* 오버로딩 : 함수의 이름은 같으나 매개변수(parameter)의 갯 수 가 다르기 때문에 오류가 나지 않는다.
* 매개변수를 다르게 한다는 것은 타임이나 갯 수를 다르게 한다는 것이다.
*
* 함수 시그니처 ( Funtion Signiture) 란?
* 다음과 같이 설정하는 것을 말합니다.
* fun avg(one:Int, tow:Int): Double
* fun max(a:Int, b:Int):Int
* */

//다형성.
fun some(str: String){
    println("some(str:String)");
}
fun some(number: Int){
    println("fun some(number:Int)");
}


fun main(args: Array<String>):Unit{
    some("Hello world");
    some(100)
}
