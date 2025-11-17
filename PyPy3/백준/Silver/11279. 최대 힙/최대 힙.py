# 최대 힙
import heapq
import sys
input = sys.stdin.readline
n = int(input())
heap = []
for _ in range(n):
    x = int(input())
    # 힙이 비어있다면 0을 출력
    if x == 0:
        if heap:
            # 최대 힙이므로 저장할 때 음수, 꺼낼 때 다시 음수로 복원
            print(-heapq.heappop(heap))
        else:
            print(0)
    else:
        # 최대 힙을 위해 음수로 저장
        heapq.heappush(heap, -x)