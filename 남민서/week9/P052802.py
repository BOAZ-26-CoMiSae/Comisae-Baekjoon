# level 0: 주사위게임 3

def solution(a, b, c, d):
    answer = 0
    dice = sorted([a, b, c, d])
    
    if dice[0] == dice[3]:        # 4개의 쌍 모두 같은 경우
        answer = 1111 * dice[0]
    
    elif dice[0] == dice[2]:      # 3개의 쌍이 같은 경우(앞)
        answer = (10*dice[0] + dice[3])**2
    
    elif dice[1] == dice[3]:       # 3개의 쌍이 같은 경우(뒤)
        answer = (10*dice[1] + dice[0])**2
    
    elif dice[0] == dice[1] and dice[2] == dice[3]:   # 두 쌍
        answer = (dice[0] + dice[2]) * abs(dice[0] - dice[2])
    
    elif dice[0] == dice[1]:   # 한 쌍
        answer = dice[2] * dice[3]
    
    elif dice[1] == dice[2]:
        answer = dice[0] * dice[3]
    
    elif dice[2] == dice[3]: 
        answer = dice[0] * dice[1]
    
    else:
        answer = dice[0]        
        
    return answer



# 언패킹 해서 풀 수도 있음
def solution(a, b, c, d):
    answer = 0
    p, q, r, s = sorted([a, b, c, d])
    
    if p == s:
        answer = 1111 * p
    elif p == r:
        answer = (10*p + s)**2
    elif q == s:
        answer = (10*q + p)**2
    elif p == q and r == s:
        answer = (p + r) * abs(p - r)
    elif p == q:
        answer = r * s
    elif q == r:
        answer = p * s
    elif r == s:
        answer = p * q
    else:
        answer = p
        
    return answer