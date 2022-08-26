fun main(){
    var x = 3
    val name = "Cormoran"
    x = x * 10
    println ("x is $x")
    while (x > 20) {
        x = x - 1
        println ("x is now $x.")
    }

    for (i in 1..10){
        x = x + 1
        println (" x is now $x.")
    }

    if (x == 20) {
        println(" x must be $x.")
    }else{
        println(" x isn't 20.")
    }
    if (name.equals("Cormoran")){
        println ("$name Strike")
    }
}