import java.io.DataInput

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var input = readln().toInt()
    multip(input)
}

fun multip (Number:Int):Int{

    val n =  Number %2
    var multip:Int = 0
    if (n == 0){
        multip = Number * 8
        println("This number is pair= ${multip}")
    }else if (n == 1){
        multip = Number * 9
        println("This number is inpair= ${multip}")
    }

    return  multip
}