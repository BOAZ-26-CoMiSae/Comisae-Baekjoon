from collections import deque

def solution(m, n, h, w, drops):
    # 1. 각 칸이 비를 맞는 시간 기록 (1-indexed)
    inf = len(drops) + 1 #어떤 빗방울보다도 늦게 떨어지는 가상의 시간
    time_map = [[inf] * n for _ in range(m)] #전체 격자를 inf로 채우기
    for i, (r, c) in enumerate(drops):
        time_map[r][c] = i + 1 # 각 좌표에 몇번째로 비가 내리는지 기록

    # 각 행에서 가로 길이 w인 구간 내의 '가장 빠른 강우 시간'을 저장할 배열
    row_min = [[0] * (n - w + 1) for _ in range(m)]
    for r in range(m):
        dq = deque()
        for c in range(n):
            if dq and dq[0] <= c - w:
                dq.popleft() #윈도우 범위를 벗어난 오래된 인덱스를 제거
                #새로 들어온 값보다 큰 기존 값들을 제거하여 데크 내에 항상 오름차순이 유지되도록
            while dq and time_map[r][dq[-1]] >= time_map[r][c]:
                dq.pop()
            dq.append(c)
            if c >= w - 1:
                #가로 길이가 w가 되는 시점부터 해당 구간의 최솟값을 저장
                row_min[r][c - w + 1] = time_map[r][dq[0]]

    # 3. 세로 방향 슬라이딩 윈도우 최솟값 (윈도우 크기 h)
    max_first_rain = -1 #선인장이 '가장 늦게' 비를 맞는 시간을 찾기 위해 충분히 작은 값으로 초기화
    result = [0, 0]
    
    #이미 가로 최솟값이 계산된 row_min을 바탕으로 세로 방향으로 다시 윈도우 돌리기
    for c in range(n - w + 1):
        dq = deque()
        for r in range(m):
            if dq and dq[0] <= r - h:
                dq.popleft()
            while dq and row_min[dq[-1]][c] >= row_min[r][c]:
                dq.pop()
            dq.append(r)
            
            if r >= h - 1:
                # 현재 좌표(r-h+1, c)를 왼쪽 위 꼭짓점으로 하는 wxh 구역이 처음으로 비를 맞는 시각
                current_min = row_min[dq[0]][c]
                # 더 늦게 비를 맞는 위치를 찾거나, 
                # 같은 시간일 때 상단/좌측 우선 조건 확인
                if current_min > max_first_rain:
                    max_first_rain = current_min
                    result = [r - h + 1, c]
                elif current_min == max_first_rain:
                    # 행이 더 작거나, 행이 같고 열이 더 작은 경우 (c 순회 특성상 자동 처리)
                    if r - h + 1 < result[0]:
                        result = [r - h + 1, c]

    return result