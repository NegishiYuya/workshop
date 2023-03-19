package service

import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import dao.UserDao
import dto.UserDto
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class UserServiceTest {

	@Test
	fun getUserNameList() {
		// Arrange: 準備
		// その1 UserDaoのモックインスタンスを作る
		val userDaoMock = mock<UserDao>()
		doReturn(
			listOf(
				UserDto(id = 1, name = "登戸太郎"),
				UserDto(id = 2, name = "溝の口次郎"),
				UserDto(id = 3, name = "新城三郎")
			)
		).`when`(userDaoMock).getUserList()
		// その2 実行対象を定義
		val target = UserService().also {
			// userDaoにモックインスタンスを設定
			it.userDao = userDaoMock
		}
		// その3 期待値
		val expected = listOf(
			"登戸太郎",
			"溝の口次郎",
			"新城三郎"
		)

		// Act: 実行
		val actual = target.getUserNameList()

		// Assert: 検証
		assertThat(actual).isEqualTo(expected)
	}

	@Test
	fun existsUserByUserName_存在する場合はtrueを返す() {

	}
	@Test
	fun existsUserByUserName_存在しない場合はfalseを返す() {

	}
}
