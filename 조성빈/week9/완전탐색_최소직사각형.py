def solution(sizes):
    max_w = 0 # 가로(긴 부분) 중 가장 긴 길이
    max_h = 0 # 세로(짧은 부분) 중 가장 긴 길이
    
    for w, h in sizes:
        # 긴 쪽은 긴 쪽끼리, 짧은 쪽은 짧은 쪽끼리 비교
        long_side = max(w, h)
        short_side = min(w, h)
        
        # 긴 쪽들 중 가장 긴 값으로 지갑의 가로를 늘립니다.
        max_w = max(max_w, long_side)
        
        # 짧은 쪽들 중 가장 긴 값으로 지갑의 세로를 늘립니다.
        max_h = max(max_h, short_side)
        
    # 지갑의 넓이를 반환
    return max_w * max_h