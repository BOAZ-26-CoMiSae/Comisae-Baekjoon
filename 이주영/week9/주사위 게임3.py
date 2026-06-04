from collections import Counter

def solution(a, b, c, d):
    num_set = {a, b, c, d}
    num_list = [a, b, c, d]
    num_counter = Counter(num_list)
    answer = 0
    
    if len(num_set) == 1:
        common_nums = num_counter.most_common(1)
        answer = 1111 * common_nums[0][0]
    elif len(num_set) == 2:
        common_nums = num_counter.most_common(2)
        if common_nums[0][1] == 3:
            answer = (10*common_nums[0][0] + common_nums[1][0]) ** 2
        else:
            answer = (common_nums[0][0] + common_nums[1][0]) * abs(common_nums[0][0] - common_nums[1][0])
    elif len(num_set) == 3:
        common_nums = num_counter.most_common(3)
        answer = common_nums[1][0] * common_nums[2][0]
    else:
        num_list.sort()
        answer = num_list[0]

    return answer