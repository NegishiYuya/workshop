package com.example.springworkshop.dao

import com.example.springworkshop.dto.CategoryMasterDto
import com.springworkshop.dbflute.exbhv.MasterCategoryBhv
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class CategoryMasterDaoImpl : CategoryMasterDao {

	@Autowired
	lateinit var categoryMasterCategoryBhv: MasterCategoryBhv

	override fun selectList(): List<CategoryMasterDto> {
		return categoryMasterCategoryBhv.selectList { cb ->
			cb.query()
		}.map { CategoryMasterDto(id = it.id, label = it.label) }
	}
}
