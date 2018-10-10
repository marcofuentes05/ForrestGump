package Classes

import Interfaces.Candy

open class Chocolate (override var nombre : String) : Candy {
    override fun name():String{
        return nombre
    }
}