/*
 * Copyright © 2018-today Peter M. Stahl pemistahl@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pemistahl.lingua.internal

import com.squareup.moshi.ToJson
import kotlin.math.abs

@ConsistentCopyVisibility
internal data class Fraction private constructor(
    val numerator: Int,
    val denominator: Int,
) : Number(),
    Comparable<Fraction> {
    override fun compareTo(other: Fraction): Int {
        val n0d = numerator.toLong() * other.denominator
        val d0n = denominator.toLong() * other.numerator
        return when {
            n0d < d0n -> -1
            n0d > d0n -> 1
            else -> 0
        }
    }

    override fun toString() = "$numerator/$denominator"

    override fun toByte() = toDouble().toInt().toByte()

    override fun toDouble() = numerator.toDouble() / denominator.toDouble()

    override fun toFloat() = toDouble().toFloat()

    override fun toInt() = toDouble().toInt()

    override fun toLong() = toDouble().toLong()

    override fun toShort() = toDouble().toInt().toShort()

    companion object {
        /**
         * Creates a [Fraction] reduced to its lowest terms with a non-negative denominator.
         */
        operator fun invoke(
            numerator: Int,
            denominator: Int,
        ): Fraction {
            val (num, den) = reduceToLowestTerms(numerator, denominator)
            return Fraction(num, den)
        }
    }
}

private fun reduceToLowestTerms(
    numerator: Int,
    denominator: Int,
): Pair<Int, Int> {
    var num = numerator
    var den = denominator

    if (den == 0) throw ArithmeticException("zero denominator in fraction '$num/$den'")
    if (den < 0) {
        if (num == Int.MIN_VALUE || den == Int.MIN_VALUE) {
            throw ArithmeticException("overflow in fraction $num/$den, cannot negate")
        }
        num = -num
        den = -den
    }

    val gcd = greatestCommonDenominator(num, den)

    if (gcd > 1) {
        num /= gcd
        den /= gcd
    }
    if (den < 0) {
        num = -num
        den = -den
    }

    return Pair(num, den)
}

private fun greatestCommonDenominator(
    a: Int,
    b: Int,
): Int {
    if (a == 0 || b == 0) {
        if (a == Int.MIN_VALUE || b == Int.MIN_VALUE) {
            throw ArithmeticException("overflow: greatestCommonDenominator($a, $b) is 2^31")
        }
        return abs(a + b)
    }

    var x = a
    var y = b
    var xl = x.toLong()
    var yl = y.toLong()
    var useLong = false

    if (x < 0) {
        if (x == Int.MIN_VALUE) {
            useLong = true
        } else {
            x = -x
        }
        xl = -xl
    }
    if (y < 0) {
        if (y == Int.MIN_VALUE) {
            useLong = true
        } else {
            y = -y
        }
        yl = -yl
    }
    if (useLong) {
        if (xl == yl) throw ArithmeticException("overflow: greatestCommonDenominator($a, $b) is 2^31")
        var ylyu = yl
        yl = xl
        xl = ylyu % xl
        if (xl == 0L) {
            if (yl > Int.MAX_VALUE) throw ArithmeticException("overflow: greatestCommonDenominator($a, $b) is 2^31")
            return yl.toInt()
        }
        ylyu = yl

        y = xl.toInt()
        x = (ylyu % xl).toInt()
    }

    return greatestCommonDivisor(x, y)
}

private fun greatestCommonDivisor(
    a: Int,
    b: Int,
): Int {
    assert(a >= 0)
    assert(b >= 0)

    if (a == 0) return b
    if (b == 0) return a

    var x = a
    var y = b

    val xTwos = x.countTrailingZeroBits()
    val yTwos = y.countTrailingZeroBits()
    val shift = minOf(xTwos, yTwos)

    x = x shr xTwos
    y = y shr yTwos

    while (x != y) {
        val delta = x - y
        y = minOf(x, y)
        x = abs(delta)
        x = x shr x.countTrailingZeroBits()
    }

    return x shl shift
}

internal class FractionAdapter {
    @ToJson fun toJson(fraction: Fraction): String = fraction.toString()
}
