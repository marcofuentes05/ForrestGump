package Classes

abstract class BoxOfAny<T : Any> (var lista : ArrayList<T>) {

    fun getOne(): T{
        var b = (0..lista.size).shuffled().first()
        var a = lista[b]
        if (lista.size >0){
            lista.removeAt(b)
        }
        return a
    }
}