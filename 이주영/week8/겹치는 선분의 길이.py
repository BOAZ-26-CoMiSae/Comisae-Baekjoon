def solution(lines):
    line_masks = [0] * 201
    for line in lines:
        a = line[0] + 100
        b = line[1] + 100
        for i in range(a, b):
            line_masks[i] += 1
    
    count = 0
    for i in range(201):
        if line_masks[i] > 1:
            count += 1
        
    return count