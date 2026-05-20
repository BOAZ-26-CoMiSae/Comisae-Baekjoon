def solution(babbling):
  answer = 0
  valid_words = ["aya", "ye", "woo", "ma"]

  for word in babbling:
    for valid in valid_words:
      word = word.replace(valid, " ")

    if not word.strip():
      answer += 1

  return answer