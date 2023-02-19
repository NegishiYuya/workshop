package com.example.springworkshop.service

import com.example.springworkshop.dto.CategoryMasterDto

interface CategoryMasterService {
	fun getList(): List<CategoryMasterDto>
}
