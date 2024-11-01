import java.util.*

data class TimeOfDay(
    val hour: Int,
    val minute: Int
)

class TimeTable(
    val index: Int,
    val date: Date,
    val regNo: String,
    val arrivalTime: TimeOfDay,
    val departureTime: TimeOfDay
)
