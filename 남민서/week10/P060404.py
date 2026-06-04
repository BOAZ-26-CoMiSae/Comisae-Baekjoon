# DFS(깊이 우선 탐색): 타겟 넘버 

# 재귀적이란: 같은 형태의 더 작은 문제(부분 문제)를 풀고 부분 문제의 답을 이용해 기존 문제를 푸는 것
# base case(탈출 조건, 문제가 충분히 작아 바로 풀 수 있는 경우)과 recursive case(자기 자신을 다시 부르는 부분)
def solution(numbers, target):
    answer = 0
    
    def dfs(index, current):
        nonlocal answer
        
        # 트리의 맨 아래까지 내려온 경우 
        if index == len(numbers):
            if current == target:  # 현재 결과가 target과 같으면
                answer += 1
            return
        
        dfs(index + 1, current + numbers[index])  # + 길로 가보기
        dfs(index + 1, current - numbers[index])  # - 길로 가보기 
    
    dfs(0, 0)
    return answer



# 스택 사용하는 경우 함수 형태
def solution(numbers, target):
    answer = 0
    stack = [(0, 0)]  # (index, current) 시작값 넣기

    while stack:                          # 스택이 빌 때까지 반복
        index, current = stack.pop()      # 꺼내기

        if index == len(numbers):         # 맨 아래 도달
            if current == target:
                answer += 1
            continue                      # 다음 반복으로

        stack.append((index+1, current + numbers[index]))  # + 갈래 넣기
        stack.append((index+1, current - numbers[index]))  # - 갈래 넣기

    return answer