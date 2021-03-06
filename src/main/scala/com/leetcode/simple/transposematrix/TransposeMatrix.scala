package com.leetcode.simple.transposematrix

/**
  * Given a matrix A, return the transpose of A.
  *
  * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.
  *
  *
  *
  * Example 1:
  *
  * Input: [[1,2,3],[4,5,6],[7,8,9]]
  * Output: [[1,4,7],[2,5,8],[3,6,9]]
  *
  * Example 2:
  *
  * Input: [[1,2,3],[4,5,6]]
  * Output: [[1,4],[2,5],[3,6]]
  *
  *
  *
  * Note:
  *
  * 1 <= A.length <= 1000
  * 1 <= A[0].length <= 1000
  */
object TransposeMatrix {
  def main(args: Array[String]): Unit = {
    val arr = Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
   transpose(arr).foreach(_.foreach(println(_)))
  }
  def transpose(A: Array[Array[Int]]): Array[Array[Int]] = {
    val arr = new Array[Array[Int]](A(0).length)

    for (i <- A(0).indices) {
      val arrInner = new Array[Int](A.length)
      for(j <- A.indices){
        arrInner(j) = A(j)(i)
      }
      arr(i) = arrInner
    }
    arr
  }
}
