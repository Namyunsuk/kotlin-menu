package menu.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    companion object {
        fun enterCoachName(): List<String> {
            println("코치의 이름을 입력해 주세요. (, 로 구분)")
            val userInput = Console.readLine()
            val names = userInput.split(",")
            return names
        }

        fun enterNotEatFood(coachName: String): List<String> {
            println("${coachName}(이)가 못 먹는 메뉴를 입력해 주세요.")
            val userInput = Console.readLine()
            val notEatMenu = userInput.split(",")
            return notEatMenu
        }
    }
}