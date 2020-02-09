/*
* 자주 쓰는 명령어를 담아 쓰는 느낌으로 사용해서 만들면됩니다.
*
* */

fun main(args: Array<String>):Unit{
    print(aa("장건일"));
    val result:Int = plus(100, 200);
    println(result);
    dan(2);

}

fun aa(name:String): String{
    return "welcome $name"
}

fun plus(a:Int, b:Int):Int{
    return a+b;
}

fun dan(num:Int):Unit{
    for(i in 1 until 10){
        println("$num * $i = "+ num * i);
    }
}

fun dan(num:Int, title: String):Unit{
    println("$title : ");
    for(i in 1 until 10){
        println()
    }
}

