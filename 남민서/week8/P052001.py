# level-0: 평행 

def solution(dots):
    answer = 0
    
    def is_parallel(p1, p2, p3, p4):
        dy1 = p2[1] - p1[1]
        dx1 = p2[0] - p1[0]
        dy2 = p4[1] - p3[1]
        dx2 = p4[0] - p3[0]
        return dy1 * dx2 == dy2 * dx1
    
    if is_parallel(dots[0], dots[1], dots[2], dots[3]): answer = 1
    if is_parallel(dots[0], dots[2], dots[1], dots[3]): answer = 1
    if is_parallel(dots[0], dots[3], dots[1], dots[2]): answer = 1
    
    return answer