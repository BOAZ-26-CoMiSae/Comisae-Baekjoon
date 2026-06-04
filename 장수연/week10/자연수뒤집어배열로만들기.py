def solution(n):
    # 1. 숫자를 문자열로 변환: str(n) -> "12345"
    # 2. 문자열을 뒤집기: [::-1] -> "54321"
    # 3. 각 문자를 숫자로 바꾸어 리스트로 생성: int(x)
    answer = [int(x) for x in str(n)[::-1]]
    return answer