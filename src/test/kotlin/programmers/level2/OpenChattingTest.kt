package programmers.level2

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class OpenChattingTest : FreeSpec({

    "container" - {

        "test01" {
            openChatting(
                arrayOf(
                    "Enter uid1234 Muzi",
                    "Enter uid4567 Prodo",
                    "Leave uid1234",
                    "Enter uid1234 Prodo",
                    "Change uid4567 Ryan"
                )
            ) shouldBe arrayOf(
                "Prodo님이 들어왔습니다.",
                "Ryan님이 들어왔습니다.",
                "Prodo님이 나갔습니다.",
                "Prodo님이 들어왔습니다."
            )

        }

    }

})
