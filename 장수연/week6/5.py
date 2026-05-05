def solution(s):
    nums = list(map(int, s.split()))
    
    min_val = min(nums)
    max_val = max(nums)
    
    return f"{min_val} {max_val}"