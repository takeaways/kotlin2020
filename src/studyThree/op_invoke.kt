package studyThree

class Product(val code: Int, val name:String)
{
    operator fun invoke(value:Int)
    {
        println(value);
        println("code : $code\nname:$name");
    }
}

fun main(args: Array<String>) {
    val prod = Product(201801, "노트북");
    prod(200) // 실제 처리되는 코드 prod.invoke(200);
}