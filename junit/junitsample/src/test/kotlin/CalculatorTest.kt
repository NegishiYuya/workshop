import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {

	// それぞれのテストが実行される前に実行したい処理を書く
	@BeforeEach
	fun beforeEach() {
		println("Before Each!!")
	}

	// それぞれのテストが実行された後に実行したい処理を書く
	@AfterEach
	fun afterEach() {
		println("After Each!!!")
	}

	// BeforeAllとAfterAllはクラスに対して1つしか存在できないため、staticで宣言する必要がある
	companion object {

		// すべてのテストが実行される前に実行したい処理を書く
		@JvmStatic
		@BeforeAll
		fun beforeAll() {
			println("Before All!")
		}

		// すべてのテストが実行された後に実行したい処理を書く
		@JvmStatic
		@AfterAll
		fun afterAll() {
			println("After All!!!!")
		}
	}

	@Test
	fun plus() {
		// Arrange: 準備
		val num1 = 1
		val num2 = 2
		val expected = 3
		val target = Calculator()

		// Act: 実行
		val actual = target.plus(num1, num2)

		// Assert: 検証
		assertThat(actual).isEqualTo(expected)
	}

	fun minus() {
		// Arrange: 準備

		// Act: 実行

		// Assert: 検証
	}
}
