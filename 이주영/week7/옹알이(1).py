def solution(babbling):
    count = 0
    mussk = ["aya", "ye", "woo", "ma"]
    
    for word in babbling:
        for m in mussk:
            word = word.replace(m, " ")
        if word.strip() == "":
            count += 1
                
    return count