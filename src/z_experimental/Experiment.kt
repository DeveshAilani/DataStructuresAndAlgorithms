package z_experimental

import kotlin.properties.Delegates

fun main() {
    val user = User()
    user.name = "Devesh"
    user.name = "Nikhil"

    
}


class User {
    var name: String by Delegates.observable("initial value") { property, oldValue, newValue ->
        println("$oldValue --> $newValue")
    }

    var balance: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue > oldValue
    }
}