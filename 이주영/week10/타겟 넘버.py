def solution(numbers, target):
    count = 0
    for n in range(2**len(numbers)):
        check = 0
        for i in range(len(numbers)):
            if (n & (1<<i)) != 0:
                check += numbers[len(numbers) - 1 - i]
            else:
                check -= numbers[len(numbers) - 1 - i]
        if check == target:
            count += 1
    
    return count