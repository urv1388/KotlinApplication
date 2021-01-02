package com.example.kotlinapplication


fun main() {

//    val outputCount: Int = getSolution(mutableListOf(8, 4, 6, 12))
//    println(outputCount)


    val totalNeeded = fiveStarReviews(arrayOf(arrayOf(4, 4), arrayOf(1, 2), arrayOf(3, 6)), 77)
    println("Total $totalNeeded")
}

fun getSolution(mutableListOf: MutableList<Int>): Int {

    var mySum = 0

    mutableListOf.sort()
    if (mutableListOf.isNullOrEmpty()) {
        return mySum
    } else {

        while (mutableListOf.size > 1) {
            mutableListOf.sort()
            mySum += add2Smallest(mutableListOf)
        }
    }
    return mySum
}

fun add2Smallest(mutableListOf: MutableList<Int>): Int {

    val arrSize: Int = mutableListOf.size

    return if (arrSize < 2) {
        0
    } else {
        val first = mutableListOf[0]
        val second = mutableListOf[1]
        mutableListOf.add(first + second)
        mutableListOf.removeAt(0)
        mutableListOf.removeAt(0)
        first + second
    }
}
//
//fun getSolution(arrayOf: ArrayList<Int>): Int {
//
//    var sum: Int = 0
//
//
//    Collections.sort(arrayOf.toMutableList())
//
//
//    return sum
//
//}


fun fiveStarReviews(productRatings: Array<Array<Int>>, ratingThreshold: Int): Int {
    val mSortElements = mutableListOf<Pair<Int, Int>>()
    for (loopIndex in productRatings.indices) {
        val mValue = (productRatings[loopIndex][0] * 100) / productRatings[loopIndex][1]
        mSortElements.add(loopIndex to mValue)
    }
    mSortElements.sortBy { it.second }
    println(mSortElements.toList())












    val finalProductRatings = mutableListOf<Array<Int>>()
    for (indexOfSortedList in mSortElements.indices) {
        finalProductRatings.add(productRatings[mSortElements[indexOfSortedList].first])
    }
    return add2Rating(ratingThreshold, finalProductRatings)


}



fun add2Rating(ratingThreshold: Int, finalProductRatings: MutableList<Array<Int>>): Int {
    var finalFiveStar = 0




    for (mElement in finalProductRatings) {
        println(mElement.toList())
        finalFiveStar += checkRateAndAddMore(
            finalProductRatings, mElement,
            ratingThreshold, 0
        )

    }
    return finalFiveStar
}

fun checkRateAndAddMore(finalProductRatings: MutableList<Array<Int>>, mElement: Array<Int>, ratingThreshold: Int, rating: Int): Int {
    var isMaxRatingReached
    for ()


    return rating
}


//
//fun checkRateAndAddMore(
//    fiveStar: Int,
//    totalFiveStar: Int,
//    ratingThreshold: Int,
//    countFiveStar: Int
//): Int {
//    return if ((fiveStar * 100) / totalFiveStar <= ratingThreshold) {
//        println("checkRateAndAddMore: fiveStar is: $fiveStar totalFiveStar is $totalFiveStar")
//        println("checkRateAndAddMore: ${(fiveStar * 100) / totalFiveStar} <= $ratingThreshold")
//        println("checkRateAndAddMore: $countFiveStar")
//        println("--------------------------------------")
//        checkRateAndAddMore(
//            fiveStar + 1,
//            totalFiveStar + 1,
//            ratingThreshold,
//            countFiveStar + 1
//        )
//    } else {
//        countFiveStar
//    }
//}


