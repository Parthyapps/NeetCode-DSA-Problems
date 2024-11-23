// using Brute Force:
    // Time complexity: O(n2)O(n2)
    // Space complexity: O(1)O(1)

fun main() {
    // intArrayOf is a Kotlin function used to create an array of integers.
      val array = intArrayOf(1,2,3,4)
      val result = containsDuplicate(array)
      println(result)
  }
  fun containsDuplicate(array: IntArray):Boolean{
   // Iterates through each index of the array.
    // array.indices generates a range representing all valid indices of the array (e.g., for an array of size 4, indices is 0..3).
      for(i in array.indices){
            // For each index i, starts a second loop from index i + 1 up to (but not including) array.size.
            // Ensures that each element in the array is compared only with the elements that come after it (avoids redundant comparisons).
          for (j in i+1 until array.size){
            
    // Compares the element at index i with the element at index j.
    // If the elements are equal, it means the array contains duplicate values.
              if(array[i] == array[j]){
                  return true
              }
          }
      }
      return false
  }
