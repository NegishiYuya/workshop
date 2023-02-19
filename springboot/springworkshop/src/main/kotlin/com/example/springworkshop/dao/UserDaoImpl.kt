package com.example.springworkshop.dao

import com.example.springworkshop.entity.User
import com.springworkshop.dbflute.exbhv.UserBhv
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class UserDaoImpl : UserDao {

	@Autowired
	lateinit var userBhv: UserBhv

	private val userList: List<User> = listOf(
		User(
			id = 1, name = "ニャオハ", categoryId = 1
		),
		User(
			id = 2, name = "ニャローテ", categoryId = 1
		),
		User(
			id = 3, name = "マスカーニャ", categoryId = 1
		),
		User(
			id = 4, name = "ホゲータ", categoryId = 2
		),
	)

	override fun selectList(): List<User> {
		return userBhv.selectList { cb ->
			cb.query()
		}.map { User(id = it.id, name = it.name, categoryId = it.categoryId) }
	}

	override fun select(userId: Int): User? {
		return userBhv.selectByPK(userId).get().let {
			User(id = it.id, name = it.name, categoryId = it.categoryId)
		}
	}
}
