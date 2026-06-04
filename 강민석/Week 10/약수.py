def solution(n):
    answer = 0
    for i in range(1, int(n ** 0.5) + 1):
        if n % i == 0:
            answer += i           # 약수를 더함
            if i != n // i:       # 짝이 되는 약수가 중복되지 않는다면
                answer += n // i  # 짝이 되는 약수도 더함
    return answer
