# 노란불 신호등

from math import gcd

def lcm(a, b):
    return a*b // gcd(a,b)

def solution(signals):
    total_lcm = sum(signals[0])
    
    for i in range(1, len(signals)):
        total_lcm = lcm(total_lcm, sum(signals[i]))
    
    for t in range(1, total_lcm + 1):
        yellow = True
        for G, Y, R in signals:
            cycle = G + Y + R
            pos = (t - 1) % cycle
            if not (G <= pos < G +Y):
                yellow = False
                break
        if yellow:
            return t
    return -1
    