import sys
input = sys.stdin.readline
n, m, r = map(int, input().split())
graph = [[] for _ in range(n + 1)]
for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)
for i in range(1, n + 1):
    graph[i].sort(reverse=True)
visited = [0] * (n + 1)
stack = [r]
order = 1
while stack:
    cur = stack.pop()
    if visited[cur]:
        continue
    visited[cur] = order
    order += 1
    for nxt in graph[cur]:
        if not visited[nxt]:
            stack.append(nxt)
for i in range(1, n + 1):
    print(visited[i])