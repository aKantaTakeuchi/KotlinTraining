package io.access.kotlintraining

class Client (val personalInfo: PersonalInfo?){
    val p : PersonalInfo?
    get()
    : PersonalInfo? {
        return this.personalInfo
    }
}