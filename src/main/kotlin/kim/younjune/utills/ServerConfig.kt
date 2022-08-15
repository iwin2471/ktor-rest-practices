class  ServerConfig private constructor(f: File) {
   init {
        val p = Properties()
        p.load(FileInputStream(f))
    }
    companion object: SingletonHolder<ServerConfig, File>(::ServerConfig)
}