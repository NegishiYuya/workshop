package com.example.springworkshop.dao

import com.springworkshop.dbflute.exbhv.UserBhv
import org.springframework.beans.factory.annotation.Autowired
import com.example.springworkshop.dto.UserDto
import org.springframework.stereotype.Repository

@Repository
class UserDaoImpl : UserDao {

	@Autowired
	lateinit var userBhv: UserBhv

	override fun selectList(): List<UserDto> {
		return userBhv.selectList { cb -> cb.query() }
			.map { UserDto(id = it.id, name = it.name, categoryId = it.categoryId) }
	}

	override fun select(userId: Int): UserDto? {
		return userBhv.selectByPK(userId).get().let {
			UserDto(id = it.id, name = it.name, categoryId = it.categoryId)
		}
	}
}
