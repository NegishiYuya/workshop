package com.example.demo.constants

/**
 * 画面項目の定義順を表現するEnum.
 * @param 画面項目のプロパティ名(Formの変数名と合わせること)
 */
enum class ViewItemEnum(val itemNameList: List<String>) {
    VALIDATION_SAMPLE(
        listOf(
            "id",
            "name",
            "email"
        )
    )
}
