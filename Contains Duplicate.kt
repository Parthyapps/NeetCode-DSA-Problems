  fun main() {
      val array = intArrayOf(1,2,3,4)
      val result = containsDuplicate(array)
      println(result)
  }
  fun containsDuplicate(array: IntArray):Boolean{
      for(i in array.indices){
          for (j in i+1 until array.size){
              if(array[i] == array[j]){
                  return true
              }
          }
      }
      return false
  }
