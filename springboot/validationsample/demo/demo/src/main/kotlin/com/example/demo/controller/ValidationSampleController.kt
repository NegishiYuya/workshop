package com.example.demo.controller

import com.example.demo.Utilty.ValidationMessageUtility
import com.example.demo.constants.ViewItemEnum
import com.example.demo.form.ValidationSampleForm
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping
class ValidationSampleController {

    @GetMapping("index")
    fun index(
        model: Model, @ModelAttribute("validationSampleForm") validationSampleForm: ValidationSampleForm
    ): String {
        return "index"
    }

    @PostMapping("postSample")
    fun postSample(
        model: Model,
        @Validated @ModelAttribute("validationSampleForm") validationSampleForm: ValidationSampleForm,
        result: BindingResult
    ): String {
        return if (result.hasErrors()) {
            // エラーメッセージを項目：メッセージのListの形に変換
            model.addAttribute(
                "messageList",
                ValidationMessageUtility.sortErrorMessage(result, ViewItemEnum.VALIDATION_SAMPLE.itemNameList)
            )
            this.index(model, validationSampleForm)
        } else {
            "completePost"
        }
    }
}