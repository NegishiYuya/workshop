package com.example.springworkshop.dao

import com.example.springworkshop.entity.CategoryMaster
import org.springframework.stereotype.Repository

@Repository
class CategoryMasterDaoImpl : CategoryMasterDao {
	override fun selectList(): List<CategoryMaster> {
		return listOf(
			CategoryMaster(1, "くさ"),
			CategoryMaster(2, "ほのお"),
			CategoryMaster(3, "みず")
		)
	}
}
