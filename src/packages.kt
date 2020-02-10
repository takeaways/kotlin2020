fun max(vararg numbers: Int):Int{
    var temp = 0;
    for(n in numbers){
        if(temp < n){
            temp = n;
        }
    }
    return temp;
}
fun min(vararg numbers: Int):Int{
    var temp = 200000000;
    for(n in numbers){
        if(temp >= n){
            temp = n;
        }
    }
    return temp;
}

