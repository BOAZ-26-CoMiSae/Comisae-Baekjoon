def solution(lines):
  count_map = {}

  for line in lines:
    start, end = line
    for i in range(start, end):
      # 이미 있으면 1 더하기, 처음 나왔으면 1로 시작하기
      count_map[i] = count_map.get(i, 0) + 1

  overlap_length = 0
  for count in count_map.values():
    if count >= 2:
      overlap_length += 1

  return overlap_length