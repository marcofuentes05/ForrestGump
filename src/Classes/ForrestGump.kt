package Classes

import Interfaces.Candy

class ForrestGump (val caja: BoxOfAny<Candy>) {

    fun pickOne():Candy{
        println(caja.getOne().name())
        return caja.getOne()
    }

    fun talkForrest(){
        if (caja.lista.size > 0){
            println("lifes good")
        }else{
            println("lifes no good")
        }
    }
}