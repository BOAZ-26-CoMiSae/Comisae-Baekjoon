import sys
input = sys.stdin.readline

a = int(input())
b = int(input())
c = int(input())

mul = a * b * c

# --- 1 ---
count = dict()

while mul > 0:
  temp = mul % 10
  mul = mul // 10
  count[temp] = count.get(temp, 0) + 1

for i in range(10):
  print(count.get(i, 0))

# --- 2 ---
# 배열 사용
count = [0] * 10

while mul > 0:
  count[mul % 10] += 1
  mul //= 10

for i in range(10):
  print(count[i])

# --- 3 ---
# 문자열 사용
count = [0] * 10

for ch in str(mul):
  count[int(ch)] += 1

for i in range(10):
  print(count[i])
