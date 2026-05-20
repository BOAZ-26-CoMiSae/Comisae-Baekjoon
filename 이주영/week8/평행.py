from itertools import combinations

def solution(dots):
    a, b, c, d = dots
    return 1 if (
        (b[1]-a[1])*(d[0]-c[0]) == (d[1]-c[1])*(b[0]-a[0]) or
        (c[1]-a[1])*(d[0]-b[0]) == (d[1]-b[1])*(c[0]-a[0]) or
        (d[1]-a[1])*(c[0]-b[0]) == (c[1]-b[1])*(d[0]-a[0])
    ) else 0