class Matrix(val data: Array<IntArray>) {
    val rows: Int = data.size
    val cols: Int = data[0].size

    operator fun plus(other: Matrix): Matrix {
        if (rows != other.rows || cols != other.cols) {
            throw IllegalArgumentException("Matrices must have the same dimensions for addition")
        }
        return Matrix(Array(rows) { r ->
            IntArray(cols) { c ->
                this.data[r][c] + other.data[r][c]
            }
        })
    }

    operator fun minus(other: Matrix): Matrix {
        if (rows != other.rows || cols != other.cols) {
            throw IllegalArgumentException("Matrices must have the same dimensions for subtraction")
        }
        return Matrix(Array(rows) { r ->
            IntArray(cols) { c ->
                this.data[r][c] - other.data[r][c]
            }
        })
    }

    operator fun times(other: Matrix): Matrix {
        if (cols != other.rows) {
            throw IllegalArgumentException("Number of columns in first matrix must equal number of rows in second matrix")
        }
        return Matrix(Array(rows) { r ->
            IntArray(other.cols) { c ->
                (0 until cols).sumOf { k ->
                    this.data[r][k] * other.data[k][c]
                }
            }
        })
    }

    override fun toString(): String {
        return data.joinToString("\n") { row ->
            row.joinToString(" ")
        }
    }
}

fun main() {
    val firstMatrix = Matrix(arrayOf(
        intArrayOf(2, 4, 6),
        intArrayOf(1, 3, 5)
    ))
    val secondMatrix = Matrix(arrayOf(
        intArrayOf(1, 3),
        intArrayOf(-9, 0),
        intArrayOf(2, 4)
    ))
    val secondMatrix1 = Matrix(arrayOf(
        intArrayOf(6, 9),
        intArrayOf(9, 0),
        intArrayOf(5, 4)
    ))

    println("************Addition***************")
    println("Matrix 1:")
    println(secondMatrix1)
    println("Matrix 2:")
    println(secondMatrix)
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition: \n$thirdMatrix")

    println("************Subtraction***************")
    println("Matrix 1:")
    println(secondMatrix1)
    println("Matrix 2:")
    println(secondMatrix)
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction: \n$subtractMatrix")

    println("************Multiplication***************")
    println("Matrix 1:")
    println(firstMatrix)
    println("Matrix 2:")
    println(secondMatrix)
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication: \n$multiplication")
}
