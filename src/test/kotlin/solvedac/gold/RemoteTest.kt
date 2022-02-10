package solvedac.gold

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class RemoteTest : FreeSpec({

    "container" - {

        "test01" {
            getRemotePushCount(5457, sortedSetOf(6, 7, 8)) shouldBe 6
        }

    }

})
