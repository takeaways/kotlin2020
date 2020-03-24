package studyTwo

class Point(var x:Int = 0 , var y:Int = 0){
    //operator 키워드를 이용
    operator fun plus(obj:Point):Point{
        return Point(x + obj.x, y + obj+y);
    }
}

fun main(args: Array<String>) {
    var point1 = Point(10 , 20);
    var point2 = Point(20, 5);

    val point3 = point1 + point2;
}