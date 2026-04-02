# 자료구조 ⇒ 문자열(String)

---

## 1. String Pool (문자열 풀)

> 📎 참고: [Java String Pool의 내부 동작 원리: 메모리 최적화와 문자열 관리 심층 분석 📘 — 벤지의 개발일지](https://benji.tistory.com/39)

JVM 메모리 안에 있는 **문자열 전용 저장 공간**.  
같은 문자열을 여러 번 만들어도 **하나만 저장하고 공유**한다.

```java
// 리터럴 → Pool 사용
String a = "hello";   // Pool에 "hello" 저장
String b = "hello";   // Pool에 이미 있으므로 재사용 (같은 객체)

// new → Pool 무시, Heap에 새 객체 생성
String c = new String("hello");

System.out.println(a == b);       // true  ← 같은 Pool 객체
System.out.println(a == c);       // false ← c는 Heap의 별도 객체
System.out.println(a.equals(c));  // true  ← 값은 같음
```

### == vs .equals()

```java
String a = new String("hello");
String b = new String("hello");

System.out.println(a == b);       // false ← 주소(참조)가 다름
System.out.println(a.equals(b));  // true  ← 값(내용)은 같음

// ⚠️ new로 만든 문자열은 반드시 .equals()로 비교할 것!
// ==으로 비교하면 항상 false → 버그 발생
```

### .intern() — Pool에 수동 등록

```java
String a = "hello";                // Pool에 "hello" 등록
String b = new String("hello");    // Heap에 새 객체 (Pool 무시)

System.out.println(a == b);        // false

String c = b.intern();             // Pool에서 "hello" 찾아서 반환
System.out.println(a == c);        // true ← 이제 같은 Pool 객체

// 동작 순서:
// 1. Pool에 같은 값 있는지 확인
// 2. 있으면 → 기존 객체 반환
// 3. 없으면 → Pool에 추가 후 반환

// 실무에서는 거의 안 씀 (리터럴 쓰면 JVM이 자동으로 처리)
```

### 가비지 컬렉션(GC)과 Pool

```java
String a = "hello";  // "hello" 객체 생성, a가 가리킴
a = "java";          // a가 "java"로 바뀜
                     // "hello"는 아무도 안 가리킴 → GC 수거 대상!

// Java 6 이전: Pool이 PermGen(고정 크기)에 위치 → GC 불가 → OutOfMemoryError 위험
// Java 7 이후: Pool이 Heap으로 이동 → GC 가능 → 자동으로 메모리 정리
```

---

## 2. String vs StringBuilder vs StringBuffer

> 📎 참고: [자바 String, StringBuilder 그리고 StringBuffer 성능 차이 비교 | MadPlay🚀](https://madplay.github.io/post/difference-between-string-stringbuilder-and-stringbuffer-in-java)

### String은 불변(Immutable)

```java
String a = "hello";
a = a + " world";
// "hello"가 바뀐 게 아니라 "hello world"라는 새 객체가 생성됨
// 원본 "hello"는 메모리 어딘가에 그대로 남아있음

// ❌ 반복문에서 + 쓰면 매번 새 객체 생성 → 느리고 낭비
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i;  // 반복마다 새 String 객체 생성!
}

// ✅ StringBuilder 사용 → 하나의 객체에서 계속 수정
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append(i);
}
String result = sb.toString();
```

### StringBuilder vs StringBuffer — 동기화 차이

```java
// StringBuilder — synchronized 없음 (빠르지만 멀티스레드에서 위험)
public StringBuilder append(String str) {
    super.append(str);
    return this;
}

// StringBuffer — synchronized 있음 (느리지만 멀티스레드에서 안전)
// synchronized = 한 번에 하나의 스레드만 접근 가능하도록 잠금
public synchronized StringBuffer append(String str) {
    super.append(str);
    return this;
}
```

| | `String` | `StringBuilder` | `StringBuffer` |
|---|---|---|---|
| 불변 여부 | 불변 | 가변 | 가변 |
| 동기화 | - | 없음 | 있음 |
| 속도 | 느림(반복 시) | 빠름 | 느림(잠금 비용) |
| 멀티스레드 안전 | 안전 | 위험 | 안전 |
| 언제 씀 | 단순 이어붙이기 | 대부분의 경우 | 멀티스레드 환경 |

### 언제 뭘 쓸까?

```java
// 단순 이어붙이기 몇 개 → + 도 무방 (컴파일러가 최적화해줌)
String msg = "안녕하세요, " + name + "님!";

// 반복문에서 문자열 조립 → StringBuilder
StringBuilder sb = new StringBuilder();
for (String item : list) {
    sb.append(item).append(", ");
}
String result = sb.toString();

// 여러 스레드가 동시에 같은 객체 수정 → StringBuffer
// (실무에서 거의 쓸 일 없음)
StringBuffer sharedLog = new StringBuffer();
new Thread(() -> sharedLog.append("[INFO] 시작\n")).start();
new Thread(() -> sharedLog.append("[ERROR] 오류\n")).start();
```

---

## 3. 자주 쓰는 String 메서드

### 🔍 찾기 / 확인

```java
String s = "Hello, World!";

s.length()              // 13        — 길이
s.contains("World")     // true      — 포함 여부
s.startsWith("Hello")   // true      — 시작 문자 확인
s.endsWith("!")         // true      — 끝 문자 확인
s.indexOf("o")          // 4         — 처음 나오는 위치 (없으면 -1)
s.lastIndexOf("o")      // 8         — 마지막으로 나오는 위치
s.isEmpty()             // false     — 길이가 0인지
s.isBlank()             // false     — 공백만 있거나 비어있는지 (Java 11+)
```

### ✂️ 자르기

```java
String s = "  Hello, World!  ";

s.trim()                // "Hello, World!" — 앞뒤 공백 제거
s.strip()               // "Hello, World!" — trim과 비슷, 유니코드 공백도 처리 (Java 11+)
s.substring(7, 12)      // "World"         — 7번째~12번째 직전까지
s.substring(7)          // "World!"        — 7번째부터 끝까지
```

### 🔄 바꾸기

```java
String s = "Hello, World!";

s.replace("World", "Java")      // "Hello, Java!"
s.toUpperCase()                  // "HELLO, WORLD!"
s.toLowerCase()                  // "hello, world!"
s.replaceAll("[aeiou]", "*")     // "H*ll*, W*rld!" — 정규식으로 교체
```

### 📦 나누기 / 합치기

```java
// split(구분자) — 구분자 기준으로 잘라서 배열로 반환
String csv = "사과,바나나,포도";    // 그냥 일반 String
String[] fruits = csv.split(",");  // 쉼표 기준으로 자름
// fruits[0] = "사과"
// fruits[1] = "바나나"
// fruits[2] = "포도"

// join(구분자, ...) — 사이에 구분자 끼워서 하나의 String으로 합침
String joined  = String.join(" / ", "사과", "바나나", "포도"); // "사과 / 바나나 / 포도"
String joined2 = String.join(", ", fruits);                    // "사과, 바나나, 포도"

// 구분자는 뭐든 상관없음 — 기준으로 삼고 싶은 문자를 넣으면 됨
String.join(",",  "A", "B", "C"); // "A,B,C"
String.join("/",  "A", "B", "C"); // "A/B/C"
String.join(" ",  "A", "B", "C"); // "A B C"
String.join(" - ","A", "B", "C"); // "A - B - C"
```

### 🔢 변환

```java
// 숫자 → String
String s1 = String.valueOf(42);         // "42"
String s2 = String.valueOf(3.14);       // "3.14"

// String → 숫자
int n     = Integer.parseInt("42");     // 42
double d  = Double.parseDouble("3.14"); // 3.14

// char 관련
char c      = "Hello".charAt(0);       // 'H'
char[] arr  = "Hello".toCharArray();   // ['H','e','l','l','o']
String back = new String(arr);          // "Hello"
```

### 📝 포매팅

```java
String name  = "철수";
int age      = 20;
double score = 95.5;

String result = String.format("%s의 나이는 %d살, 점수는 %.1f점", name, age, score);
// "철수의 나이는 20살, 점수는 95.5점"

// 주요 포맷 기호
// %s   → String
// %d   → 정수
// %f   → 실수 (기본 소수점 6자리)
// %.2f → 소수점 2자리 실수
// %n   → 줄바꿈
```

### ⚠️ null 처리 주의

```java
String s = null;

s.equals("hello");           // ❌ NullPointerException 발생!
"hello".equals(s);           // ✅ false — 이렇게 쓰는 게 안전
Objects.equals(s, "hello");  // ✅ false — null-safe 비교
```

---

## 4. 실전 요약

```java
// ✅ 문자열 비교는 항상 .equals()
if (a.equals("hello")) { ... }

// ✅ 반복 조립은 StringBuilder
StringBuilder sb = new StringBuilder();
for (...) { sb.append(...); }

// ✅ 사용자 입력은 trim()으로 공백 제거 후 사용
String input = userInput.trim();

// ✅ null 비교는 상수를 앞에
if ("hello".equals(input)) { ... }

// ✅ 숫자 변환 시 parseInt()
int num = Integer.parseInt(input);
```

| 메서드 | 용도 |
|---|---|
| `contains()` | 포함 여부 확인 |
| `split()` | 텍스트 파싱, CSV 처리 |
| `trim()` / `strip()` | 사용자 입력 공백 제거 |
| `replace()` | 특정 단어 교체 |
| `parseInt()` | 문자열 → 숫자 변환 |
| `equals()` | 값 비교 (== 절대 쓰지 말 것!) |
