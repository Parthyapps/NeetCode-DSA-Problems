fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(nums, target)
    println(result.joinToString(", ")) // Output: 0, 1
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>() // A HashMap to store values and their indices.
    for (i in nums.indices) {
        val complement = target - nums[i] // Calculate the complement of the current number.
        if (map.containsKey(complement)) {
            // If the complement exists in the map, return the indices.
            return intArrayOf(map[complement]!!, i)
        }
        // Otherwise, add the current number and its index to the map.
        map[nums[i]] = i
    }
    throw IllegalArgumentException("No solution found")
}
