package solvedac.silver

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SugarDeliveryTest {

    @Test
    fun availableForDelivery() {
        assertThat((1..5000))
            .filteredOn { !setOf(1, 2, 4, 7).contains(it) }
            .allMatch { sugarDelivery(it) != -1 }
    }

    @Test
    fun unAvailableForDelivery() {
        setOf(1, 2, 4, 7).forEach {
            println(it)
            assertThat(sugarDelivery(it)).isEqualTo(-1)
        }
    }

    @Test
    fun three_is_one() {
        assertThat(sugarDelivery(3)).isEqualTo(1)
    }

    @Test
    fun five_is_one() {
        assertThat(sugarDelivery(5)).isEqualTo(1)
    }

    @Test
    fun six_is_two() {
        assertThat(sugarDelivery(6)).isEqualTo(2)
    }

    @Test
    fun eight_is_two() {
        assertThat(sugarDelivery(8)).isEqualTo(2)
    }

    @Test
    fun nine_is_three() {
        assertThat(sugarDelivery(9)).isEqualTo(3)
    }

    @Test
    fun twenty_four_is_six() {
        assertThat(sugarDelivery(24)).isEqualTo(6)
    }

}
