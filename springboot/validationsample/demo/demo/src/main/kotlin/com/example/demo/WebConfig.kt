package com.example.demo

import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.validation.Validator
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun getValidator(): Validator? {
        return LocalValidatorFactoryBean().also { validator ->
            validator.setValidationMessageSource(ReloadableResourceBundleMessageSource().also {
                it.setBasename("classpath:ValidationMessages")
                it.setDefaultEncoding("UTF-8")
            })
        }
    }
}