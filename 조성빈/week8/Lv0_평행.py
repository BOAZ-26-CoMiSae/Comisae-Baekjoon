def solution(dots):
    [x1,y1], [x2,y2], [x3,y3], [x4,y4] = dots

#3가지 경우
    if (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1):
        return 1
    
    if (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1):
        return 1
    
    if (y3 - y1) * (x3 - x2) == (y3 - y2) * (x4 - x1):
        return 1
    
#아닌 경우 
    reuturn 0