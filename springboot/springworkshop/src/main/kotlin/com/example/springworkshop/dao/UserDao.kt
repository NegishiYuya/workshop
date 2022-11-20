package com.example.springworkshop.dao

import com.example.springworkshop.entity.User

interface UserDao {
  fun selectUserList(): List<User>
  fun selectUser(id: Int): User?
}