### 스택의 개념

- 한 쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO 형식의 선형 자료구조

### 스택의 특징

- 단방향 입출력 : 데이터의 삽입과 삭제가 오직 Top에서만 일어난다
- 후입선출 : 가장 최근에 들어온 데이터가 가장 높은 우선순위를 가집니다.
- 데이터 접근 제한 : 중간에 있는 데이터를 직접 꺼낼 수 없음.
- Stack 대신 ArrayDeque 권장

### Java에서의 스택 사용법

```python
import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1); // [1]
        stack.push(2); // [1, 2]
        stack.push(3); // [1, 2, 3]

        System.out.println(stack.pop());  // 3 출력 (제거됨)
        System.out.println(stack.peek()); // 2 출력 (확인만 함)
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.size());    // 2 (size() 사용 가능)
    }
}
```

### 활용 사례

- 역순 정렬
  - 문자열을 뒤집거나 숫자를 역순으로 배치할 때
- 재귀 알고리즘
  - 재귀함수 사용 시 내부적으로 콜 스택 사용
- 괄호 검사
  - (()) 처럼 짝이 맞는지 확인하는 문제
- 수식 계산
  - 후위 표기법 계산

### 중위 & 전위 & 후위 표기법

| **표기법** | **예시**      | **주 사용처**      | **장점**                                 |
| ---------- | ------------- | ------------------ | ---------------------------------------- |
| **중위**   | `(1 + 2) * 3` | **사람**           | 읽기 편함, 익숙함                        |
| **후위**   | `1 2 + 3 *`   | **컴퓨터(계산기)** | 스택으로 계산하기 가장 쉬움, 괄호 불필요 |
| **전위**   | `* + 1 2 3`   | **컴파일러(트리)** | 수식 구조를 트리 형태로 파악하기 좋음    |

ArryDeque

- Stack 클래스는 내부적으로 동기화 처리가 되어있어 무겁습니다. 반면 ArrayDeque는 그럼 오버헤드가 없어 훨씬 빠릅니다.
- 상황에 따라 스택 또는 큐처럼 사용 가능
- 스택처럼 사용하고 싶을 때는 push(), pop()
  큐처럼 사용하고 싶을 떄는 add(), pull()

### 예시

- HELLO → OLLEH로 출력 (Deque 사용)

```python
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        String str = "HELLO";

        // 1. 스택 생성 (Java에서는 ArrayDeque 권장)
        Deque<Character> stack = new ArrayDeque<>();

        // 2. 문자열의 각 문자를 스택에 하나씩 넣기 (Push)
        for (char ch : str.toCharArray()) {
            stack.push(ch);
            System.out.println("Push: " + ch);
        }

        System.out.println("--- 꺼내기 시작 ---");

        // 3. 스택이 빌 때까지 하나씩 꺼내기 (Pop)
        // 가장 나중에 들어간 'O'가 가장 먼저 나옵니다!
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
```

- HELLO → OLLEH로 출력 (Stack 사용)

```python
import java.util.Stack; // Stack 클래스를 명시적으로 임포트

public class Main {
    public static void main(String[] args) {
        String str = "HELLO";

        // 1. 진짜 Stack 객체 생성
        // 내부적으로 Vector를 상속받은 클래스입니다.
        Stack<Character> stack = new Stack<>();

        // 2. 문자 넣기 (Push)
        for (char ch : str.toCharArray()) {
            stack.push(ch);
            System.out.println("Push: " + ch);
        }

        System.out.println("--- Stack에서 꺼내기 시작 ---");

        // 3. 비어있지 않을 때까지 꺼내기 (Pop)
        while (!stack.empty()) { // Stack 클래스는 isEmpty() 외에 empty() 메서드도 제공합니다.
            System.out.print(stack.pop());
        }
    }
}
```
