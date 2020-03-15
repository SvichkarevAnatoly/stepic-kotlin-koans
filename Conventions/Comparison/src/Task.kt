data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year.compareTo(other.year) != 0) {
            return year.compareTo(other.year)
        }
        if (month.compareTo(other.month) != 0) {
            return month.compareTo(other.month)
        }
        return dayOfMonth.compareTo(other.dayOfMonth)
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
