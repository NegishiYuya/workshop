package com.example.demo.form

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import org.hibernate.validator.constraints.Length

data class ValidationSampleForm(
    @field: NotNull(message = "ID入れてね！")
    val id: Int?,
    @field: NotBlank
    @field: Length(min = 1, max = 5)
    @field: Pattern(regexp = "[a-zA-Z]+")
    val name: String?,
    @field: NotBlank
    @field: Email
    val email: String?
)
