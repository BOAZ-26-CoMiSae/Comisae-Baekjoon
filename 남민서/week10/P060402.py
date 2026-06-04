# lebel 0: 안전 지대 

def solution(board):
    
    n = len(board)  # board의 크기 (n x n)
    answer = 0
    
    # 위험지역 표시판 (전부 False = 안전으로 시작)
    danger = [[False] * n for _ in range(n)]
    
    # board 전체를 훑으면서 지뢰(1)을 찾는다
    for r in range(n):
        for c in range(n):
            if board[r][c] == 1:
                
                # 지뢰 주변 3x3 (9칸)을 위험 지역으로 표시
                for dr in [-1, 0, 1]:
                    for dc in [-1, 0, 1]:
                        nr = r + dr  # 이동할 행 
                        nc = c + dc  # 이동할 열
                        
                        # 행과 열이 격자 안에 있어야 한다 
                        if 0 <= nr < n and 0 <= nc < n:
                            danger[nr][nc] = True
    
    # 위험 표시가 없는 칸(안전지역)의 개수를 센다
    for r in range(n):
        for c in range(n):
            if danger[r][c] == False:
                answer += 1                    
    
    return answer