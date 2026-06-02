def solution(n):
    answer = 0
    
    # n이 0보다 클 때까지 계속 반복합니다.
    while n > 0:
        # 1. 10으로 나눈 나머지(맨 뒷자리 숫자)를 정답에 더합니다.
        answer += n % 10
        
        # 2. n을 10으로 나눈 몫으로 바꿉니다. (맨 뒷자리를 잘라냄)
        n = n // 10
        
    return answer