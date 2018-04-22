class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy{
        this.initializer()
    }
}

