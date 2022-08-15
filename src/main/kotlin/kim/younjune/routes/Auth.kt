package kim.younjune.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.locations.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
import kim.younjune.plugins.UserSession

fun Routing.Auth() {
    get<Auth> {
        call.sessions.set(UserSession("asdf", it.name, ""))
        call.response.status(HttpStatusCode.OK)
    }
}

@Location("/login/{name}")
data class Auth(val name: String)