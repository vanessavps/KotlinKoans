class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {
        var current: MyDate = start

        override fun next(): MyDate {
            if (hasNext()) {
                val auxVal = current
                current = current.nextDay()
                return auxVal
            }
            else
            {
                throw Exception("error")
            }
        }

        override fun hasNext(): Boolean {
            return current <= end
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
