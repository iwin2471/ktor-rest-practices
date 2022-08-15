package kim.younjune.routes

import io.ktor.server.application.*
import io.ktor.server.locations.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.routing.get
import io.ktor.server.sessions.*
import kim.younjune.database.DBServiceProvider
import kim.younjune.entities.UserEntity
import kim.younjune.entities.UserLocation
import kim.younjune.plugins.UserSession

fun Routing.user() {
    route("/user") {
        get {
            val allUser = DBServiceProvider.userService.findAll()
            call.respond(call.sessions.get<UserSession>().toString())
        }
        get<UserLocation> {
            call.respond(it.name)
        }

        post("") {

        }
        put {

        }
        delete {

        }
    }
}