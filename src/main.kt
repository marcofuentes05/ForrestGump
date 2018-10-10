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

//No se porque sale error aqui D:
    //Help
    val forrest = ForrestGump(caja)
    val forrest2 =ForrestGump(caja2)
}