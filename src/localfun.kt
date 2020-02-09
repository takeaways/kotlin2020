/*
같은 지역대에서 함수가 실행될 경우에는 함수의 순서가 중요하다.
*
* */
fun main(args: Array<String>):Unit{

    // local function : 보통 이렇게 사용경우는 많지 않다.
    fun aa() {
        println("aa 함수 내부 입니다.");
    }

    aa();
}



