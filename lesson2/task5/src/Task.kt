import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate {
    return this.addTimeIntervals(timeInterval,1)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

class MultiTimeInterval(val timeInterval: TimeInterval, val number: Int)
operator fun TimeInterval.times(number:Int) = MultiTimeInterval(this,number)

operator fun MyDate.plus(timeIntervals: MultiTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)



