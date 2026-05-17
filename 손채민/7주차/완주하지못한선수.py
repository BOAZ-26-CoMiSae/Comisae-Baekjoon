# 파이썬의 Collections.Counter는 Hash Table을 기반으로 동작
# 해시 가능한 객체들의 빈도수를 O(n) 시간에 효율적으로 계산
# 딕셔너리의 서브 클래스 from collections import Counter

def solution(participant, completion):
    
    diff =Counter(participant) - Counter(completion)
    
    
    answer = list(diff.keys())[0]

    return answer 
