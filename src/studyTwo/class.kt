package studyTwo

/*
* 클래스 : 객체를 찍어내는 틀( 설계도 )
* */

val person = object{
    val name : String = "GI";
    val age : Int = 29;
}
val person1 = object{
    val name : String = "CI";
    val age : Int = 20;
}
val person2 = object{
    val name : String = "KI";
    val age : Int = 30;
}

class Person{
    var name : String = "";
    var age : Int = 0;
    var color : String = "";
}

fun main(args:Array<String>):Unit{
    val person:Person = Person();
    //person : 인스턴스

    person.name = "GI"
    person.age = 29

    val person2 = Person();
    person2.name ="AM";
    person2.age = 27
    person2.color = "Red";

}