package Classes

abstract class Candy (var name: String, var isOpen: Boolean = false) {
    fun openCandy(){
        isOpen = true
    }

    override fun toString(): String {
        return name
    }
}