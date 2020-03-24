package studyTwo

class Product{
    var name : String = "";
    var price : Int = 0;
}

fun main(args: Array<String>):Unit{
    val product: Product
    product = createProduct();

}

fun createProduct():Product{
    val banana = Product();
    banana.name = "Banana";
    banana.price = 5000;
    return banana
}

fun raisePrice(product: Product){
    product.price += 500;
}


