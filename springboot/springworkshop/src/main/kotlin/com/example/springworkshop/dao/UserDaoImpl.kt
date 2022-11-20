package com.example.springworkshop.dao

import com.example.springworkshop.entity.User
import org.springframework.stereotype.Repository

@Repository
class UserDaoImpl : UserDao {
  val userList: List<User> = listOf(
    User(id = 1, name = "taro"),
    User(id = 2, name = "jiro")
  )

  override fun selectUserList(): List<User> = userList
  override fun selectUser(id: Int): User? = userList.find { it.id == id }
}