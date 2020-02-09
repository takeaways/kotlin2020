/*
 * 가변인수
 * vararg 키워드를 이용하여 가변적으로 매개변수를 사용가능
 */

fun main(args: Array<String>):Unit{
    val result = getTotal(10,20,3,40,40);
    println("Result : $result");
}

fun getTotal(vararg number:Int):Int{
    val cnt = number.size;
    var result = 0;
    for(i in number){
        print(i);
        result += i;
    }

    return result;
};


/*
*
* vararg 기본 값은 0으로 전달 해준다.
*
* 가변 인수와 일발 변수를 같이 사용할 수 있다.
*
* 가변인수는 일반 변수 보다 오른 쪽에 배치 되어 있어야 한다.
* */