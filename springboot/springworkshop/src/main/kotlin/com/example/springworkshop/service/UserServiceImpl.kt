package com.example.springworkshop.service

import com.example.springworkshop.dao.UserDao
import com.example.springworkshop.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

  @Autowired
  lateinit var userDao: UserDao

  override fun getList(): List<User> = userDao.selectUserList()
  override fun getUser(id: Int): User? = userDao.selectUser(id)
}