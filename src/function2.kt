/*
* 매개 변수의 기본값을 같는 함수
*
* */

fun main(args: Array<String>){
    val returnValue = getAvg(10,2, true);
    println("Result : $returnValue");

    val returnValue2 = getAvg(b=10,a=2, print=true);
    println("Result : $returnValue2");
}
fun getAvg(a:Int, b: Int, print:Boolean=false ):Double{
    val result = ( a + b ) / 2.0;
    if(print){
        println(result)
    }
    return result
}