package Classes

open class BubbleGum (var nombre : String) : Candy(nombre) {
    fun name() : String{
        return nombre
    }
}