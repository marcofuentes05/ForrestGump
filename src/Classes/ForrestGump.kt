package Classes

class ForrestGump<T: Candy>(val caja : BoxOfAny<T>) {

    fun pickOne():T?{
        println(caja.getOne().toString())
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