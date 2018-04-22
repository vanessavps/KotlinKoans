fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    for (item: Int in collection) {
        if (item % 2 == 0)
            return true
    }
    return false
}
