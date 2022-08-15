package kim.younjune.models

import kim.younjune.utills.Utils
import kotlinx.serialization.encodeToString

interface BaseModel {
    fun encodeToString(): String = Utils.json.encodeToString(this)
}