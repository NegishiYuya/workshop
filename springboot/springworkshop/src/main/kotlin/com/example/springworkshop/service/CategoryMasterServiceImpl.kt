package com.example.springworkshop.service

import com.example.springworkshop.dao.CategoryMasterDao
import com.example.springworkshop.entity.CategoryMaster
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryMasterServiceImpl : CategoryMasterService {

	@Autowired
	lateinit var categoryMasterDao: CategoryMasterDao;

	override fun getList(): List<CategoryMaster> {
		return categoryMasterDao.selectList()
	}
}
