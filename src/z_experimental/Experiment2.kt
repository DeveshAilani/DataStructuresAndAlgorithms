package z_experimental


fun main() {
    val name1:String = "Devesh"
    val name2:String = "Devesh"

    val str1 = buildString { "string value" }
    val str2 = buildString { "string value" }

    val n1 = Userrrr("Devesh")
    val n2 = Userrrr("Devesh")

    println(n1 === n2)
    println(str1 === str2)
    println(name1 === name2)
    println(name1 == name2)
    println(name1.hashCode())
    println(name2.hashCode())

}

data class Userrrr(val name:String)
