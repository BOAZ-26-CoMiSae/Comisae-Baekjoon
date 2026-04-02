# Java 정리

## Java 입력 관련
- `BufferedReader` → 빠른 입력 도구 (Scanner보다 빠름)
- `br.readLine()` → 한 줄 전체 읽기
- `Integer.parseInt()` → 문자열을 정수로 변환
- `StringTokenizer` → 한 줄을 공백 기준으로 쪼개기
- `st.nextToken()` → 쪼갠 값을 하나씩 꺼내기
- `throws IOException` → BufferedReader 쓸 때 필수

## Java 문자열 관련
- `String.valueOf()` → 숫자를 문자열로 변환
- `toCharArray()` → 문자열을 문자 배열로 변환
- `ch - '0'` → 문자를 숫자 인덱스로 변환
- `Character.getNumericValue()` → 문자를 숫자로 변환
- `String.repeat(n)` → 문자열을 n번 반복
- `StringBuilder` → 문자열을 효율적으로 이어붙이는 도구
- `sb.append()` → StringBuilder에 문자열 추가

## 자료구조 관련
- `HashSet` → 중복을 자동으로 제거하는 자료구조
- `<>` → 제네릭, HashSet에 저장할 타입 지정
- `int` → `Integer` 로 써야 HashSet에 저장 가능