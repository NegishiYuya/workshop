package com.example.springworkshop.dao

import com.example.springworkshop.dto.CategoryMasterDto
import org.springframework.stereotype.Repository

@Repository
class CategoryMasterDaoImpl : CategoryMasterDao {
	override fun selectList(): List<CategoryMasterDto> {
		return listOf(
			CategoryMasterDto(1, "くさ"),
			CategoryMasterDto(2, "ほのお"),
			CategoryMasterDto(3, "みず")
		)
	}
}
