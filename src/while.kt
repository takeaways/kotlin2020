/*
* 반복문 학습 :)
* while
* for
*
* */


fun main(agrs: Array<String>):Unit{
    var i = 0 ;
    while(i < 10){
        println(i);
        i++;
    }

    var j = 0 ;
    do{
        if(j == 0 ){
            println("무조건 한 번 실행 하는 부분 입니다.");
        }else{
            println(j);
            if(j == 5){
                j++;
                continue;
            }
            if(j == 8) {
                break;
            }
        }
        j++;
    }while(j < 10 )
}


