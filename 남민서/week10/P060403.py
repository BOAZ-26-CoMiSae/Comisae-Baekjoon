# level 1: 자연수 뒤집어 배열로 만들기 
def solution(n):
    answer = []
    
    while n > 0:
        answer.append(n % 10)  # 나머지
        n = n // 10   # 몫 
    
    return answer