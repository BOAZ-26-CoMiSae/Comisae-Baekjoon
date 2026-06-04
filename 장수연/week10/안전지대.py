def solution(board):
    n = len(board)
    
    dx = [-1, 1, 0, 0, -1, -1, 1, 1]
    dy = [0, 0, -1, 1, -1, 1, -1, 1]
    

    danger_board = [[0] * n for _ in range(n)]
    
    for r in range(n):
        for c in range(n):
            if board[r][c] == 1:
                danger_board[r][c] = 1 
                
                for i in range(8):
                    nr = r + dx[i]
                    nc = c + dy[i]
                    
                    if 0 <= nr < n and 0 <= nc < n:
                        danger_board[nr][nc] = 1
                        
    danger_count = sum(sum(row) for row in danger_board)
    answer = (n * n) - danger_count
    
    return answer