package solvedac.silver

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SieveOfEratosthenesTest {

    @Test
    fun test1() {
        assertThat(sieveOfEratosthenes(2, 1)).isEqualTo(2)
    }

    @Test
    fun test2() {
        assertThat(sieveOfEratosthenes(3, 1)).isEqualTo(2)
    }

    @Test
    fun test3() {
        assertThat(sieveOfEratosthenes(7, 3)).isEqualTo(6)
    }

    @Test
    fun test4() {
        assertThat(sieveOfEratosthenes(3, 2)).isEqualTo(3)
    }

    @Test
    fun test5() {
        assertThat(sieveOfEratosthenes(15, 12)).isEqualTo(7)
    }

    @Test
    fun test6() {
        assertThat(sieveOfEratosthenes(10, 7)).isEqualTo(9)
    }

    @Test
    fun test7() {
        assertThat(sieveOfEratosthenes(1000, 999)).isEqualTo(997)
    }

    @Test
    fun test8() {
        assertThat(sieveOfEratosthenes(333, 1)).isEqualTo(2)
    }

    @Test
    fun test9() {
        assertThat(sieveOfEratosthenes(332, 331)).isEqualTo(331)
    }

}
