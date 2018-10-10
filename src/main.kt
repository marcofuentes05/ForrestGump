import Classes.*

fun main (Args : Array<String>){
    val lista  = ArrayList<Chocolate>()
    lista.add(Chocolate("negro"))
    lista.add(Chocolate("negro"))
    lista.add(Chocolate("negro"))
    lista.add(Chocolate("negro"))
    lista.add(Chocolate("negro"))
    lista.add(Chocolate("negro"))

    val lista1 = ArrayList<BubbleGum>()
    lista1.add(BubbleGum("Helado"))

    val caja = BoxOfAny(lista)
    val caja2 = BoxOfAny(lista1)
    caja.getOne()
    caja2.getOne()


    val forrest = ForrestGump<Chocolate>(caja)
    val forrest2 =ForrestGump<BubbleGum>(caja2)

    forrest.pickOne()
    forrest.talkForrest()

    forrest2.pickOne()
    forrest2.talkForrest()
}