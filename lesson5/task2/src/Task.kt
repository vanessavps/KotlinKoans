import java.util.HashMap

fun buildMap(build: MutableMap<Int,String>.() -> Unit) : Map<Int,String> {
    val mapBuilder = HashMap<Int,String>()
    mapBuilder.build()
    return mapBuilder
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
