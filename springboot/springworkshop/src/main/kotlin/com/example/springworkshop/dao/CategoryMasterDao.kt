package com.example.springworkshop.dao

import com.example.springworkshop.entity.CategoryMaster

interface CategoryMasterDao {
	fun selectList():List<CategoryMaster>
}
