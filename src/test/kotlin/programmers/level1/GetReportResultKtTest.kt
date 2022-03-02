package programmers.level1

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class GetReportResultKtTest : FreeSpec({

    "container" - {

        "test01" {
            val ids = arrayOf("muzi", "frodo", "apeach", "neo")
            val report = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi")
            val k = 2

            getReportResult(ids, report, k) shouldBe intArrayOf(2, 1, 1, 0)
        }

    }

})
