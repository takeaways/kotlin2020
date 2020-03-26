package com.geoniljang.funtion

/*
* 일반 함수를 인자나 반환값으로 사용하는 고차함수
*
* */

fun main() {
    println(myFun())

    //const mul = (x:Int, y:Int) => x+ y
    val mul: (Int, Int) -> Int = { x: Int, y: Int ->
        println("당신이 입력한 값은 $x , $y 입니다.")

        x * y }
    println(mul(2, 10))

    val multi: (Int, Int) -> Int = { x: Int, y: Int ->
        x * 2 + y * 2
    }


    println(multi(100, 2))


    val result = myfun({ name, age -> "만나서 반값습니다. $name , $age" }, 29, "장건일");
    println(result)

    val greet: ()->Unit = {println("Hello world")}
    greet()

    val next: () -> () -> Int= {
        {
            println("안녕하세요 만나서 반가워요!!!")
            102
        }
    }
    println(next()())

}

fun sum1(a: Int, b: Int) = a + b
fun myFun(): Int {
    return sum1(10, 20)
}


fun myfun(f: (String, Int) -> String, age: Int, name: String): String {
    return f(name, age)
}


