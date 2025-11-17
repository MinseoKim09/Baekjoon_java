from collections import deque
n = int(input())
# 1번부터 N번 카드까지 큐에 넣기
cards = deque(range(1, n + 1))

# 카드가 한 장 남을 때까지 반복
while len(cards) > 1:
    # 제일 위 카드 버리기
    cards.popleft()
    # 제일 위 카드를 제일 아래로 이동
    cards.append(cards.popleft())
print(cards[0])