package Classes

class BoxOfAny <Candy>
(val lista : ArrayList<Candy>) {

    fun getOne(): Candy? {
        if (lista.size > 0) {
            var b = (0..lista.size - 1).shuffled().first()
            var a = lista[b]
            lista.removeAt(b)
            return a
        }else{
            return null
        }

    }
}