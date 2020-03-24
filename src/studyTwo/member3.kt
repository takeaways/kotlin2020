package studyTwo

class Demo{
    var num = 100;
    fun demoFunc(num: Int){
        println(num);
        println(this.num) //프로퍼티를 (속성)을 출력하고 싶으면, this 키워드를 사용한다.
    }
}

fun main(args: Array<String>) {
    val demo = Demo();
    demo.demoFunc(200);
}