package kim.younjune.database

import com.mongodb.client.MongoCollection
import kim.younjune.models.BaseModel
import org.bson.BsonValue
import org.litote.kmongo.getCollection

abstract class BaseService<T : BaseModel>() {
    protected lateinit var col: MongoCollection<T>
    open var model: T? = null

    open fun create(): BsonValue? {
        return col.insertOne(model).insertedId
    }

    open fun update() {
    }

    open fun updateOne() {

    }

    open fun findAll(): List<T> = col.find().toList()

     open fun findOne() {

    }

    fun delete() {

    }

    fun deleteOne() {

    }
}