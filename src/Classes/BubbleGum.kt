package Classes

import Interfaces.Candy

class BubbleGum (override var nombre : String) : Candy {
    override fun name() : String{
        return nombre
    }
}