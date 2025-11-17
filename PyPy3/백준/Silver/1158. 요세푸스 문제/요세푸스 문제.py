# 요세푸스 문제
from collections import deque
# 입력: N명, K번째 사람 제거
n, k = map(int, input().split())
# 1부터 N까지 사람 번호를 큐에 넣기
people = deque(range(1, n + 1))
result = []
while people:
    # K-1명은 뒤로 보내고, K번째 사람을 제거
    people.rotate(-(k - 1))
    # K번째 사람 제거하고 결과에 추가
    result.append(people.popleft())
print("<" + ", ".join(map(str, result)) + ">")