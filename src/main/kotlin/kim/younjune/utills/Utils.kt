package kim.younjune.utills

import kotlinx.serialization.json.Json
import org.litote.kmongo.id.serialization.IdKotlinXSerializationModule

object Utils {
    val json = Json { serializersModule = IdKotlinXSerializationModule }
}