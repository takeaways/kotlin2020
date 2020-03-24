package studyTwo

//생성자 - (Constructor)
/*
* Constructor 키워드는 생략이 가능하다.
*
* */
            // 있어도 그만 없어도 그만
class Human constructor(name:String, age:Int){
    val name:String
    val age:Int

    init{
        this.name = name;
        this.age = age;
    }

    fun printInfo(){
        println("${this.name} ${this.age}");
    }
}

fun main(args: Array<String>) {
    var human = Human("Hello", 29);
    human.printInfo()
}