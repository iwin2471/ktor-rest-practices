package kim.younjune.models
import kotlinx.serialization.Contextual
import org.litote.kmongo.Id

abstract class User<T>: BaseModel {
  @Contextual
  abstract val _id: Id<T>
  abstract val name: String
  abstract val password: String
}