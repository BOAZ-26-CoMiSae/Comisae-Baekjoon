# Level 0: 옹알이

def solution(babbling):
    answer = 0
    
    can_speak = ["aya", "ye", "woo", "ma"]
    
    for item in babbling:
        
        for speak in can_speak:
            item = item.replace(speak, " ", 1)
            
        if item.strip() == "":
            answer += 1
    
    return answer 