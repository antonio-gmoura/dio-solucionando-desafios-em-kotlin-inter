fun main(args: Array<String>) {

    var sum = 0.0
    var qtd = 0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12) }

    for (i in 0.until(M.size)) {
        for (j in 0.until(M.size)) {
            M[i][j] = readLine()!!.toDouble()
        }
    }

    for (i in 0.until(M.size-1)) {
        for (j in (i+1).until(M.size)) {
            sum += M[i][j]
            qtd ++
        }
    }

    if (T == "M") sum /= qtd
    println(sum.format(1))
}

private fun Double.format(digits: Int) = "%.${digits}f"
    .format(this)