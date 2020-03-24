package studyTwo

class Car(val name:String, val speed:Int = 300)

fun main(args: Array<String>) {
    var car = Car("Benz", speed = 300);
    println(car.name);
    println(car.speed);


}