open class VendorSlot(
    val isBooked: Boolean,
    val rent: Double,
    val location: String
)

class VendorSlotSubscription(
    val vendorSlotIndex: String,
    val isPaid: Boolean,
    val vendorName: String,
    val mktMaterial: String,
    isBooked: Boolean,
    rent: Double,
    location: String
) : VendorSlot(
    isBooked = isBooked,
    rent = rent,
    location = location
)
