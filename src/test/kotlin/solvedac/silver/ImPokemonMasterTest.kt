package solvedac.silver

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class ImPokemonMasterTest : FreeSpec({

    "container" - {

        "test01" {
            val pokeBook = listOf(
                "Bulbasaur",
                "Ivysaur",
                "Venusaur",
                "Charmander",
                "Charmeleon",
                "Charizard",
                "Squirtle",
                "Wartortle",
                "Blastoise",
                "Caterpie",
                "Metapod",
                "Butterfree",
                "Weedle",
                "Kakuna",
                "Beedrill",
                "Pidgey",
                "Pidgeotto",
                "Pidgeot",
                "Rattata",
                "Raticate",
                "Spearow",
                "Fearow",
                "Ekans",
                "Arbok",
                "Pikachu",
                "Raichu"
            )

            val answer = listOf(
                "25",
                "Raichu",
                "3",
                "Pidgey",
                "Kakuna"
            )

            imPokemonMaster(pokeBook, answer) shouldBe listOf(
                "Pikachu",
                26,
                "Venusaur",
                16,
                14
            )

        }

    }

})
