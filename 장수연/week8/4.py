def solution(array, commands):
  answer = []
  for command in commands:
    i = command[0]
    j = command[1]
    k = command[2]

    newArr = []
    for l in range(i-1, j):
      newArr.append(array[l])

    newArr.sort()

    answer.append(newArr[k-1])

  return answer