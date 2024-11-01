import SignUp as SignUp1

open class SignUp1(
    val userIndex: Int,
    val userName: String,
    val email: String,
    val password: String,
    val role: String
)

class VehicleRegistry(
    userIndex: Int,
    userName: String,
    val regNo: String,
    val routeNo: String,
    val routePermitNo: String,
    val subscriptionNo: String
) : SignUp1(
    userIndex = userIndex,
    userName = userName,
    email = "",
    password = "",
    role = ""
)
