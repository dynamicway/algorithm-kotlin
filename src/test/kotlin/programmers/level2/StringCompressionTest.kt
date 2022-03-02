package programmers.level2

import io.kotest.core.spec.style.FreeSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class StringCompressionTest : FreeSpec({

    "container" - {

        "test01" {
            stringCompression("aabbaccc") shouldBe 7
        }

        "test02" {
            stringCompression("ababcdcdababcdcd") shouldBe 9
        }

        "test03" {
            stringCompression("xababcdcdababcdcd") shouldBe 17
        }

        "test05" {
            stringCompression("a") shouldBe 1
        }

    }

})
