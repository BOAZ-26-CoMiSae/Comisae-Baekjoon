def solution(array, commands):
    answer = [0] * len(commands)

    for i in range(len(commands)):
        # commands[i][0]번째부터 commands[i][1]번째까지 자르기
        sliced = array[commands[i][0] - 1 : commands[i][1]]

        # 정렬
        sliced.sort()

        # commands[i][2]번째 값 answer에 저장
        answer[i] = sliced[commands[i][2] - 1]

    return answer