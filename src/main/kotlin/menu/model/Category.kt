package menu.model

import camp.nextstep.edu.missionutils.Randoms
import menu.utils.CategoryInfo

class Category {
    fun makeCategory(): List<String> {
        val coachCategory = mutableListOf<String>()
        while (coachCategory.size != CATEGORY_SIZE) {
            val selectedCategory = selectCategory()
            if (isValidCategory(coachCategory, selectedCategory)) {
                coachCategory.add(selectedCategory)
            }
        }
        return coachCategory
    }

    private fun isValidCategory(
        coachCategory: MutableList<String>,
        selectedCategory: String
    ) = coachCategory.count { it == selectedCategory } < MAXIMUM_CATEGORY_ALLOWANCE

    fun selectCategory(): String {
        val randomNum = Randoms.pickNumberInRange(1, 5)
        return CategoryInfo.matchCategory(randomNum)
    }

    companion object {
        const val CATEGORY_SIZE = 5
        const val  MAXIMUM_CATEGORY_ALLOWANCE = 2
    }
}