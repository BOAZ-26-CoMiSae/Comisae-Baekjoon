# Lavel 0: 정수를 나선형으로 배치하기

def solution(n):

    answer = [[0]*n for _ in range(n)]

    # dr: 열 변화 / dc: 행 변화 (작은쪽 -1, 큰쪽 1, 안움직임 0)
    dr = [0, 1, 0, -1]
    dc = [1, 0, -1, 0]

    r, c, direction = 0, 0, 0

    for i in range(1, n*n + 1):

        answer[r][c] = i

        # 다음 위치 확인용 
        nr = r + dr[direction]
        nc = c + dc[direction]

        if nr < 0 or nr >= n or nc < 0 or nc >= n or answer[nr][nc] != 0:
            direction = (direction + 1) % 4

            # 실제 이동 
            nr = r + dr[direction]
            nc = c + dc[direction]
        
        r, c = nr, nc
    
    return answer
