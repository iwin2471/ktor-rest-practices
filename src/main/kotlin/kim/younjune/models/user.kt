interface User {
  @BsonId val id: Id<User> = newId(), 
  val name: String
  val password: String
}