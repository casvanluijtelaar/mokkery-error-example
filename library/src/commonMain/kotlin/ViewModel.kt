class ViewModel(
    private val repository: Repository
) {

    fun bar(): String {
        return repository.foo()
    }
}