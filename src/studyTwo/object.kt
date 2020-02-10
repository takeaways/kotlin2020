package studyTwo
/*
 * 객체 : 눈에 보이는 모든 것 (object)
 * -> 한 번만 만들어서 사용한다면 객체로
 * -> 여러번 사용을 하게된다면 클래스를 사용한다.
 * ex : 사람
 * 이름 , 나이 , 성별 구체적인 특성 : () 속성이라고 한다.
 * 특성을 프로그램의 세계로 가져와 사용하는 것을 말합니다.
 *
 *
 *
 * stack : person : address ====> heap : name + age : value
 *
 */


var personName = "Gi";
var personAge =29;

fun main(args: Array<String>):Unit{
    var person = object{ //heap영역을 사용한다.
        val name: String = "GI"
        val age:Int = 29; //object 내부에 포함된 변수를 프로퍼티 : 속성 이라고 합니다.
    }

    println(person.name + " , " + person.age);
}
