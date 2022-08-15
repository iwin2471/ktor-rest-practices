package kim.younjune.database

import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import kim.younjune.models.BaseModel
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection

object DBServiceProvider {
    private val client = KMongo.createClient("mongodb://192.168.10.152:27017")
    val database: MongoDatabase = client.getDatabase("test")
    val userService: UserService = UserService()
    inline fun <reified T : BaseModel> getCollection(): MongoCollection<T> {
        return database.getCollection()
    }
}