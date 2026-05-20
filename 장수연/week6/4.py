def solution(signals):
    MAX_TIME = 1000000 
    
    for t in range(1, MAX_TIME):
        all_yellow = True
        
        for green, yellow, red in signals:
            cycle = green + yellow + red
            current_time_in_cycle = (t - 1) % cycle
            if not (green <= current_time_in_cycle < green + yellow):
                all_yellow = False
                break
        
        if all_yellow:
            return t
            
    return -1