package com.example.lolguessquiz.data.remote

fun getChampionUrl(nameOfChampion: String): String = "http://ddragon.leagueoflegends.com/cdn/12.23.1/img/champion/${nameOfChampion}.png"
fun getChampionLength(champion: String): Int = champion.length

val listOfChampionNames: List<String> = listOf(
"Aatrox",
"Ahri",
"Akali",
"Alistar",
"Amumu",
"Anivia",
"Annie",
"Ashe",
"AurelionSol",
"Azir",
"Bard",
"Blitzcrank",
"Brand",
"Braum",
"Caitlyn",
"Camille",
"Cassiopeia",
"Chogath",
"Corki",
"Darius",
"Diana",
"DrMundo",
"Draven",
"Ekko",
"Elise",
"Evelynn",
"Ezreal",
"Fiddlesticks",
"Fiora",
"Fizz",
"Galio",
"Gangplank",
"Garen",
"Gnar",
"Gragas",
"Graves",
"Hecarim",
"Heimerdinger",
"Illaoi",
"Irelia",
"Ivern",
"Janna",
"JarvanIV",
"Jax",
"Jayce",
"Jhin",
"Jinx",
"Kaisa",
"Kalista",
"Karma",
"Karthus",
"Kassadin",
"Katarina",
"Kayle",
"Kayn",
"Kennen",
"Khazix",
"Kindred",
"Kled",
"Kogmaw",
"Leblanc",
"LeeSin",
"Leona",
"Lissandra",
"Lucian",
"Lulu",
"Lux",
"Malphite",
"Malzahar",
"Maokai",
"MasterYi",
"MissFortune",
"Mordekaiser",
"Morgana",
"Nami",
"Nasus",
"Nautilus",
"Nidalee",
"Nocturne",
"Nunu",
"Olaf",
"Orianna",
"Ornn",
"Pantheon",
"Poppy",
"Pyke",
"Quinn",
"Rakan",
"Rammus",
"RekSai",
"Renekton",
"Rengar",
"Riven",
"Rumble",
"Ryze",
"Sejuani",
"Shaco",
"Shen",
"Shyvana",
"Singed",
"Sion",
"Sivir",
"Skarner",
"Sona",
"Soraka",
"Swain",
"Syndra",
"TahmKench",
"Taliyah",
"Talon",
"Taric",
"Teemo",
"Thresh",
"Tristana",
"Trundle",
"Tryndamere",
"TwistedFate",
"Twitch",
"Udyr",
"Urgot",
"Varus",
"Vayne",
"Veigar",
"Velkoz",
"Vi",
"Viktor",
"Vladimir",
"Volibear",
"Warwick",
"Wukong",
"Xayah",
"Xerath",
"XinZhao",
"Yasuo",
"Yorick",
"Zac",
"Zed",
"Ziggs",
"Zilean",
"Zoe",
"Zyra"
)

fun getCorrectFullName(champName: String): String{
    when(champName){
        "Chogath" -> {
            return "Cho'Gath"
        }
        "DrMundo" -> {
            return "Dr.Mundo"
        }
        "Kaisa" -> {
            return "Kai'Sa"
        }
        "Khazix" -> {
            return "Kha'Zixs"
        }
        "KogMaw" -> {
            return "Kog'Maw"
        }
        "RekSai" -> {
            return "Rek'Sai"
        }
        "Velkoz" -> {
            return "Vel'Koz"
        }
        else -> return ""
    }
}