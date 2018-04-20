package io.access.kotlintraining

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {


    if(client == null || message == null){
        return
    }
    val personalInfo = client.p
    val email = personalInfo!!.e

    mailer.sendMessage(email, message)


}

