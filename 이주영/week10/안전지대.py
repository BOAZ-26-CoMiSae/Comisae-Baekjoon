def solution(board):
    board2 = [[0] * (len(board)+2) for _ in range(len(board)+2)]
    
    for i in range(len(board)):
        for j in range(len(board)):
            board2[i+1][j+1] = board[i][j]
    
    count = 0
    for i in range(1, len(board)+1):
        for j in range(1, len(board)+1):
                if (board2[i-1][j-1]+board2[i-1][j]+board2[i-1][j+1]
                    +board2[i][j-1]+board2[i][j]+board2[i][j+1]
                    +board2[i+1][j-1]+board2[i+1][j]+board2[i+1][j+1]) == 0:
                    count += 1
    
    return count