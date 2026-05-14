def solition(babbliing):
    answer = 0
    can speak = ["aya", "ye", "woo", "ma"]

    for word in babbling:
        for speakable inn can_speak:

            if speakable in word:
            word = word.replace(speakable, " ")
        
        if word.strip() == "":
            answer += 1

    return answer