fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    message ?: return
    client?.personalInfo?.email?.let {
        mailer.sendMessage(client.personalInfo.email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
