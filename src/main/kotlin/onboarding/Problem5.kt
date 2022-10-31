package onboarding

fun solution5(money: Int): List<Int> {
    val answer = mutableListOf<Int>()
    var currentMoney = money
    val unitMoney = listOf(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1)

    for (i in unitMoney.indices) {
        answer.add(currentMoney / unitMoney[i])
        currentMoney %= unitMoney[i]
    }

    return answer
}
