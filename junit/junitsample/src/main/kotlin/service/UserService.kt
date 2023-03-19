package service

import dao.UserDao

class UserService {
	// DIされる想定(テストコードでmocを使う想定)
	lateinit var userDao: UserDao

	fun getUserNameList(): List<String> {
		return userDao.getUserList().map { it.name }
	}

	fun existsUserByUserName(name: String): Boolean {
		return userDao.countUserByUserName(name) >= 1
	}
}
