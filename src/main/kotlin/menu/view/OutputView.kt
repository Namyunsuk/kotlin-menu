package menu.view

class OutputView {
    companion object {
        fun printStartComment() {
            println("점심 메뉴 추천을 시작합니다.\n")
        }

        fun printResulTemplate() {
            println("메뉴 추천 결과입니다.")
            println("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]")
            println("[ 카테고리 | 한식 | 한식 | 일식 | 중식 | 아시안 ]")
        }

        fun printResult(coachName: String, menuInfo: List<String>) {
            val menuString = menuInfo.joinToString(" | ")
            println("[ $coachName | $menuString ]")
        }

        fun printEndingComment(){
            print("추천을 완료했습니다.")
        }
    }
}