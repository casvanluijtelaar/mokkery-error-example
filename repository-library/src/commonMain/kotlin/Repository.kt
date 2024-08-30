interface Repository {
    fun foo(): String
}

class RepositoryImpl : Repository {
    override fun foo(): String {
        return "test"
    }
}