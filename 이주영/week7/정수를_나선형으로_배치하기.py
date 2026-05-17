
def solution(n):
    answer = [[0] * n for _ in range(n)]    
    
    d = 0
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    
    num = 1
    x, y = 0, 0
    
    while(num <= n*n):
        answer[x][y] = num
        
        nx, ny = x + dx[d], y + dy[d]
        if (0 <= nx < n and 0 <= ny < n and answer[nx][ny] == 0):
            x, y = nx, ny
        else:
            d += 1
            d %= 4
            x, y = x + dx[d], y + dy[d]
        
        num += 1
    
    return answer