import dev.mokkery.mock
import kotlin.test.Test
import kotlin.test.assertEquals

class ViewModelTest {

    private val repository = mock<Repository>()

    @Test
    fun testBar() {
        repository.generateMocks()

        val viewModel = ViewModel(repository)
        assertEquals("test", viewModel.bar())
    }
}