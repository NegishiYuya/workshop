package com.example.springworkshop.service

import com.example.springworkshop.entity.CategoryMaster

interface CategoryMasterService {
	fun getList(): List<CategoryMaster>
}
