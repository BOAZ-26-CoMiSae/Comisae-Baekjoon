# 해시: 완주하지 못한 선수

"""
[해시 충돌 해결 방식 비교]

1. 개방 주소법 (Open Addressing) - 주로 Python에서 사용
   - 원리: (해시값 % 칸 개수) 위치가 이미 차 있다면, 정해진 규칙에 따라 '다른 빈 칸'을 찾아 이동해 저장함.
   - 특징: 모든 데이터가 해시 테이블 내부에 저장되며, 메모리가 연속적으로 배치되어 읽기 속도가 빠름.

2. 체이닝 (Chaining) - 주로 Java에서 사용
   - 원리: (해시값 % 칸 개수) 위치가 이미 차 있다면, 해당 칸에 '연결 리스트(Linked List)'를 생성함.
   - 특징: 데이터들을 기차 칸처럼 줄줄이 매달아 저장하며, 테이블이 꽉 차더라도 리스트를 늘려 무한히 저장 가능함.
"""

def solution(participant, completion):
    answer = ""
    
    hash_dict = {}
    
    for name in participant:
        
        # hash_dict 에 이미 있는 이름인 경우 
        if name in hash_dict:
            hash_dict[name] += 1
        else:
            hash_dict[name] = 1
    
    # 완주자 명단 훑으면서 딕셔너리 인원수 차감 
    for name in completion:
        hash_dict[name] -= 1
        
    for name in hash_dict:
        if hash_dict[name] > 0:
            answer = name
            break
        
    return answer