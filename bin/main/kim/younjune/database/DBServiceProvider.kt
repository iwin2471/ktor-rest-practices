
object DBServiceProvider {
  companion object {
    val client = KMongo.createClient()
    val database = client.getDatabase("test")
    val col = database.getCollection<Jedi>() 
  }
}