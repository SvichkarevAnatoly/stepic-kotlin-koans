import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)
data class TimeIntervalFactor(val interval: TimeInterval, val amount: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun TimeInterval.times(amount: Int) =
        TimeIntervalFactor(this, amount)

operator fun MyDate.plus(timeInterval: TimeInterval) =
        addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervalFactor: TimeIntervalFactor) =
        addTimeIntervals(timeIntervalFactor.interval, timeIntervalFactor.amount)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
