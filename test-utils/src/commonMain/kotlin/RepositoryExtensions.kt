import dev.mokkery.answering.returns
import dev.mokkery.every


fun Repository.generateMocks() {
    every { foo() }.returns("test")
}