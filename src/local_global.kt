/*
* 지역과 전역 변수 / 함수
* 스코프 : 유효 범위 - 변수가 인식될 수 있는 범위
* */


var count = 0 ; // 전역 변수 : 모든 함수에서 접근이 가능하다.
fun main(args: Array<String>):Unit{
    val aa = 20; // 블록 안에 선언된 변수는 블록 밖으로 벗어나면 사라진다.
    println(aa);

    outputCount();
    println(count)
}

fun outputCount():Unit{
    println(count);
    count += 10;
}