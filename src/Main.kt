import java.io.DataInput

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    multip(2)

}
fun multip (Number:Int):Int{

    if (Number % 2 == 0) {
        println("${Number * 8}")
        return Number * 8
    } else {
        println("${Number * 8}")
        return Number * 9
    }
}