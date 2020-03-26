package com.geoniljang.funtion

fun main() {
    val result = callByValue2(lambda2)
    val result2 = callByValue2(::lambda3) // ::을 이용하면 기존의 함수를 람다 함수로 이용할 수 있다. -> 매개변수로 사용가능 리턴으로 사용가능 변수에 할당 가능 3개
    println(">>>>>>>>>>>>> $result2")
    if (result) {
        println("result가 정상 동작합니다.")
    } else {
        println("result false 입니다.")
    }


    mutiply(100, 200)
    muti2(100,200)
    nonReturnValue()
    oneValue("GeonilJang")
}

fun callByValue2(b: () -> Boolean): Boolean {
    println("나는 콜 바이 값이다.")
    return b()
}

val lambda2: () -> Boolean = {
    println("나는 랍다 함수 입니다.");
    true
}

fun lambda3(): Boolean {
    return true
}

fun sumP(x: Int, y: Int): Int = x + y
val mutiply: (Int, Int) -> Int = { x, y -> x * y }
val muti2: (Int, Int) -> Int = { x, y ->
    println("당신이 입력한 값은${x}, $y 입니다.")
    x * y
}
val nonReturnValue : ()->Unit = {println("Hello World")}
val oneValue : (String) -> Unit = {name -> println("Your name is ${name}.")}

