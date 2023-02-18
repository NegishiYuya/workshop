package com.example.springworkshop.form

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class UserForm(
	@field:NotNull(message = "idを入力してください")
	val id: Int?,
	@field:NotBlank(message = "名前を入力してください")
	@field:Size(min = 1, max = 10, message = "名前は{min}文字から{max}文字までで入力してください")
	val name: String?,
	@field:NotNull(message = "分類を入力してください")
	val categoryId: Int?,
)
