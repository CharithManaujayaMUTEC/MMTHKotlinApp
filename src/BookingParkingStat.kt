import java.util.Date

open class BookingParkingStat(
    val availableDateTimes: List<Date>,
    val location: String,
    val price: Double
)

class BookingParkingSlot(
    val parkingSlotIndex: Int,
    val userName: String,
    val purchaseDateTime: Date,
    val arrivalDateTime: Date,
    val departureDateTime: Date,
    val totalPrice: Double,
    val paymentMethod: String,
    val isPaid: Boolean,
    availableDateTimes: List<Date>,
    location: String,
    price: Double
) : BookingParkingStat(
    availableDateTimes = availableDateTimes,
    location = location,
    price = price
)
