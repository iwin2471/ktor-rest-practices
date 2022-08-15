package kim.younjune


import io.ktor.server.application.*
import io.ktor.server.netty.*
import io.ktor.server.sessions.*
import io.ktor.util.*
import kim.younjune.plugins.*

fun main(args: Array<String>): Unit =  EngineMain.main(args)

fun Application.module(){
    configureSerialization()
    configureHTTP()
    configureSecurity()
    configureRouting()
    install(Sessions) {
        val secretEncryptKey = hex("00112233445566778899aabbccddeeff")
        val secretSignKey = hex("6819b57a326945c1968f45236589")
        cookie<UserSession>("user_session") {
            cookie.path = "/"
            cookie.maxAgeInSeconds = 10
            transform(SessionTransportTransformerEncrypt(secretEncryptKey, secretSignKey))
        }
    }
}