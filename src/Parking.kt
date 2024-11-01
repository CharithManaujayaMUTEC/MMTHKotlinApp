import java.util.Date

class Parking {
    val parkingSlotIndex: Int
    val availableDateTimes: List<Date>
    val location: String
    val price: Double

    constructor(parkingSlotIndex: Int, availableDateTimes: List<Date>, location: String, price: Double) {
        this.parkingSlotIndex = parkingSlotIndex
        this.availableDateTimes = availableDateTimes
        this.location = location
        this.price = price
    }
}
