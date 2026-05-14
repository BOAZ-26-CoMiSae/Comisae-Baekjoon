def solution(babbling):
    answer = 0
    can_speak = ["aya", "ye", "woo", "ma"]  # 말할 수 있는 발음 리스트

    for word in babbling: #옹알이 단어 하나씩 검사
        for speakable in can_speak: 
            if speakable in word: 
                word = word.replace(speakable, " ") # 말할 수 있는 발음을 공백으로 대체
        if word.strip() == "": 
            answer += 1
            
    return answer



