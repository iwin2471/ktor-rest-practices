package kim.younjune.utills

open class SingletonHolder<out T: Any, in A>(creator: (A) -> T)  {
  private var creator: ((A) -> T)? = creator
  @Volatile private var instance: T? = null

  fun getInstance(arg: A): T {
    val checkInstance = instance
    if(checkInstance != null) {
      return checkInstance
    }

    return synchronized(this) {
      val created = creator!!(arg)
      instance = created
      creator = null
      created
    }
  }
}