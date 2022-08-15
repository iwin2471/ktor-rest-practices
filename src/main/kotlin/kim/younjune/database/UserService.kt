package kim.younjune.database

import kim.younjune.entities.UserEntity
import kim.younjune.models.BaseModel
import org.litote.kmongo.Id
import org.litote.kmongo.eq
import org.litote.kmongo.findOne


class UserService: BaseService<UserEntity>() {
    init {
        col = DBServiceProvider.getCollection()
    }
    override var model: UserEntity? = null

    fun findOneById(_id: Id<UserEntity>): BaseModel? = col.findOne(UserEntity::_id eq _id)
}