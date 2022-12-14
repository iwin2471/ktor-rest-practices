package kim.younjune

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kim.younjune.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureHTTP()
        configureSecurity()
        configureRouting()
    }.start(wait = true)
}
