package studyTwo

class Employee{
    var name = "";
    var age = 0;
    var phone = "";

    //멤버 함수
    fun printInfo(){
        println("이름 ${this.name}")
        println("나이 ${this.age}")
        println("전화번호  ${this.phone}")
    }
}

//위의 프로퍼트와 멤버 함수를 Employee의 멤버라고 한다.

fun main(args: Array<String>) {
     val e1 = Employee();
    e1.name ="gi";
    e1.age = 29;
    e1.phone = "01097315256";

    e1.printInfo();
}