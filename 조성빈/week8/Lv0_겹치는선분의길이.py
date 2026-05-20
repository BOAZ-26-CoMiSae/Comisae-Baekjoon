def solutions(lines):
    counts = {} #딕셔너리 사용 (0~1은 0, 1~2는 1로 구간을 정정하고 그 구간에 얼만큼 선분이 겹친지 확인)
    for start, end in lines: #각 선분에 구간에 1씩 더해주기
        for i in range(start, end):
            if i in counts:
                counts[i] += 1
            else:
                counts[i] = 1


    answer = 0 #구간 합계가 2가 넘을 때부터 1씩 증가
    for count in counts.values():
        if count >= 2:
            answer += 1

    return answer