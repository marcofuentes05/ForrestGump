package Classes

class BoxOfAny <Candy>
(val lista : ArrayList<Candy>) {

    fun getOne(): Candy? {
        var b = (0..lista.size - 1).shuffled().first()
        var a = lista[b]
        if (lista.size > 0) {
            lista.removeAt(b)
        }
        return a
    }
}