package kim.younjune.entities

import io.ktor.server.locations.*
import kim.younjune.models.User
import kotlinx.serialization.Serializable
import org.litote.kmongo.Id
import org.litote.kmongo.newId

@Location("/{name}")
@Serializable
data class UserEntity(override val _id: Id<UserEntity> = newId(), override val name: String, override val password: String) : User<UserEntity>()

@Location("/{name}")
class UserLocation(val name: String)