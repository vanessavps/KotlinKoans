class LazyProperty(val initializer: () -> Int) {
    private val lazyAux: Int? = null
    get(){
        if(field == null)
            field = this.initializer()

        return field
    }

    val lazy: Int
    get(){
        return this.lazyAux!!
    }
}
