def solurion(n):
    answer = [[0] * n for _ in range(n)]

    dx = [0, 1, 0, -1] #우, 하
    dy = [1, 0, -1, 0] #좌, 상 (시계 방향을 위해 우, 하, 좌, 상 순서로 설정)

    x, y = 0, 0  #배열의 시작 위치
    direction = 0

    for i in range(1, n * n + 1):  #1부터 n*n까지의 숫자를 배열에 채우기
        answer[x][y] = i

        nx = x + dx[direction] #다음 위치 계산
        ny = y + dy[direction] #다음 위치 계산

        if nx < 0 or nx >= n or ny < 0 or ny >= n or answer[nx][ny] != 0: #배열이 벽에 부딫히거나 미이 숫자가 채워진 칸을 만났을 때
            direction = (direction + 1) % 4  #향향 전환 

        x += dx[direction] #바뀐 새로운 방향으로 다시 한 칸 이동할 좌표 계산
        y += dy[direction] #바뀐 새로운 방향으로 다시 한 칸 이동할 좌표 계산

        x, y = nx, ny #현재 위치로 업데이트

    return answer

