package com.example.demo.Utilty

import org.springframework.validation.BindingResult

class ValidationMessageUtility {

    companion object {
        /**
         * バリデーションエラー結果を項目ごとにグルーピングする.
         *
         * @param BindingResult バリデーションエラー結果
         * @return Map<String, List<String?>> 項目名、エラーメッセージのListのMap
         */
        private fun mapErrorMessage(result: BindingResult): Map<String, List<String?>> {
            return result.fieldErrors.groupBy({ it.field }, { it.defaultMessage })
        }

        /**
         * 項目名、エラーメッセージのListのMapを指定した項目順に並び替える.
         *
         * @param Map<String, List<String?>> 項目名、エラーメッセージのListのMap
         * @param List<String> 画面の表示項目のList
         * @return List<String> 画面の表示項目順に並んだエラーメッセージのList
         *
         */
        private fun sortErrorMessageFromErrorMessageMap(
            errorMessageMap: Map<String, List<String?>>,
            orderedItemList: List<String>
        ): List<String> {

            return orderedItemList.mapNotNull {
                errorMessageMap.get(it)
            }.flatten().filterNotNull()
        }

        /**
         * バリデーションメッセージを画面項目順に並び変える.
         *
         * @param BindingResult バリデーションエラー結果
         * @param List<String> 画面の表示項目のList
         *
         */
        fun sortErrorMessage(
            result: BindingResult,
            orderedItemList: List<String>
        ): List<String> {
            return this.sortErrorMessageFromErrorMessageMap(
                this.mapErrorMessage(result),
                orderedItemList
            )
        }
    }

}