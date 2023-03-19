package com.example.springworkshop.service

import com.example.springworkshop.dao.UserDao
import com.example.springworkshop.dto.UserDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

	@Autowired
	lateinit var userDao: UserDao

	override fun getList(): List<UserDto> {
		return userDao.selectList()
	}

	override fun getUser(userId: Int): UserDto? {
		return userDao.select(userId)
	}

	override fun registerUser(userDto: UserDto) {
		userDao.insert(userDto)
	}
}
