/**
 * @param {number} dividend
 * @param {number} divisor
 * @return {number}
 */
var divide = function (dividend, divisor) {
    const INT_MAX = 2147483647;
    const INT_MIN = -2147483648;

    if (dividend === INT_MIN && divisor === -1) return INT_MAX;

    let dvd = BigInt(dividend);
    let dvs = BigInt(divisor);
    const negative = (dvd < 0n) ^ (dvs < 0n);

    dvd = dvd < 0n ? -dvd : dvd;
    dvs = dvs < 0n ? -dvs : dvs;

    let quotient = 0n;

    while (dvd >= dvs) {
        let temp = dvs;
        let multiple = 1n;

        while ((temp << 1n) <= dvd) {
            temp <<= 1n;
            multiple <<= 1n;
        }

        dvd -= temp;
        quotient += multiple;
    }

    if (negative) quotient = -quotient;

    if (quotient > BigInt(INT_MAX)) return INT_MAX;
    if (quotient < BigInt(INT_MIN)) return INT_MIN;
    return Number(quotient);
};