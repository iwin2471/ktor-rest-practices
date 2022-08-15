package kim.younjune.models

import com.mongodb.client.MongoCollection
import kim.younjune.utills.Utils
import kotlinx.serialization.encodeToString

interface DefaultModel {
    fun encodeToString(): String = Utils.json.encodeToString(this)
}