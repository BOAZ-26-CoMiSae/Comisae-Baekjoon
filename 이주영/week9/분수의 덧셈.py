from math import lcm

def solution(numer1, denom1, numer2, denom2):
    numer = numer1 * denom2 + denom1 * numer2
    denom = denom1 * denom2
    divisor = (numer * denom) / lcm(numer, denom)

    answer = [numer / divisor, denom / divisor]
    
    return answer