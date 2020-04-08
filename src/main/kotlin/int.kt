class int(var value: Int = 0) {
    operator fun plus(arg: int): int {
        return int(this.value + arg.value)
    }

    operator fun minus(arg: int): int {
        return int(this.value - arg.value)
    }

    operator fun times(arg: int): int {
        return int(this.value * arg.value)
    }

    operator fun div(arg: int): int {
        return int(this.value / arg.value)
    }

    operator fun unaryMinus(): int {
        return int(-this.value)
    }
}