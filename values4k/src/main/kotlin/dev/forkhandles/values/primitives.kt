package dev.forkhandles.values

import java.math.BigDecimal
import java.math.BigInteger
import java.util.UUID

typealias StringValue = Value<String>
abstract class NonEmptyStringValue(value: String) : Value<String>(value, 1.minLength)

typealias IntValue = Value<Int>
typealias LongValue = Value<Long>
typealias DoubleValue = Value<Double>
typealias FloatValue = Value<Float>
typealias UUIDValue = Value<UUID>
typealias BigDecimalValue = Value<BigDecimal>
typealias BigIntegerValue = Value<BigInteger>