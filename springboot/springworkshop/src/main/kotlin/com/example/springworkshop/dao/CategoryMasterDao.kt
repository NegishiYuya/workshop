package com.example.springworkshop.dao

import com.example.springworkshop.dto.CategoryMasterDto

interface CategoryMasterDao {
	fun selectList():List<CategoryMasterDto>
}
