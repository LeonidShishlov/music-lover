import kotlin.math.roundToInt

const val ITEM_PRISE = 10_001_00
const val DISCOUNT = 100_00
const val DISCOUNT_START = 1_001_00
fun main() {
    var purchaseAmount = 0
    while (true) {
        println("Для совершения покупки введите сумму, для выхода введите end")

        val itemCount = readLine() ?: return
        if (itemCount == "end") {
            break
        }
        val itemCount1 = itemCount.toInt() * 100


        val result = if (purchaseAmount in DISCOUNT_START until ITEM_PRISE) {
            itemCount1 - DISCOUNT
        }else if (purchaseAmount >= 1000100) {
            val percent = itemCount1.toDouble() * 0.95
            percent.roundToInt()
        }else itemCount1

        val trueFalse = purchaseAmount == 0
        val monthlyDiscount = if (!trueFalse) {
            val onePercent = result * 0.99
            onePercent.roundToInt()
        } else result
        purchaseAmount += monthlyDiscount
        val resultKopeck = monthlyDiscount%100
        val finalResult = monthlyDiscount/100
        if (purchaseAmount in DISCOUNT_START until ITEM_PRISE)
            println("Ваша покупка с учетом скидки $finalResult рублей $resultKopeck копеек.")
        else if (purchaseAmount >= 10001)
            println("Ваша покупка с учетом скидки $finalResult рублей $resultKopeck копеек.")
        else println("Ваша покупка с учетом скидки $finalResult рублей $resultKopeck копеек.")

    }
    println("Спасибо за покупки! приходите ещё)")

}