package com.geoniljang.funtion

fun main() {
    val result = callByValue(lambda())
    if(result){
        println("result가 정상 동작합니다.")
    }else{
        println("result false 입니다.")
    }
}

fun callByValue(b:Boolean):Boolean{
    println("나는 콜 바이 값이다.")
    return b
}

val lambda : () -> Boolean = {
    println("나는 랍다 함수 입니다.");
    true
}