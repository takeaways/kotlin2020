/*
* stack : 지역 => 안드로이드의 뒤로 가기를 생각하면 이해가 빠른다.
* heap : 전역 =>
*
* 지역 변수가 저장되는 메모리는 stack 메모를 이용한다.
* stack은 쌓는다는 개념으로 대표적으로 안드로이드의 어플리
* 케이션 사용법을 생각하면 쉽게 이해 할 수 있다.
*
* stack은 지역변수 뿐만 아니라 함수의 개개변수를 저장했다가 함수가 종료 되면
* 저장된 내용은 자동으로 사라진다.
*
*heap: 전역변수 or 객체 ( 동적인 변수 )
*
* */

fun main(args: Array<String>){
    val aa = -100;
    var result = abs(aa);
    println(">>>>>>>>>>>>  $result");
}

fun abs(num: Int):Int{
    return if(num >= 0 ){
        num
    }else{
        -num
    }
}

/*
* Stack
*
*
*
* main{ : 종료시 전부 사라진다.
    * abs() => num !(함수 종료시 사라진다.)=> result
    * aa
    * args
* }

* */