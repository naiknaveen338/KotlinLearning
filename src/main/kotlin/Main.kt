fun main(args: Array<String>) {
    //For loop
    for (i in 1..10){
        println(i)
    }

    //While loop
    var x = 1;
    println("Before loop x : $x")
    while (x < 5){
        x = x + 1;
        println("After modified x : $x")
    }

    //If statement
    var x1 = 4
    var x2 = 5
    println(if (x1 > x2) "print x1 : $x1" else "print x2 : $x2")


}