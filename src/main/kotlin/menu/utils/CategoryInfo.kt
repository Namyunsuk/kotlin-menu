package menu.utils

enum class CategoryInfo(val category: String, val categoryNum: Int) {
    JAPAN("일식", 1),
    KOREA("한식", 2),
    CHINA("중식", 3),
    ASIA("아시안", 4),
    WESTERN("양식", 5);

    companion object {
        fun matchCount(categoryNum: Int): String {
            return values().first { it.categoryNum == categoryNum }.category
        }
    }
}