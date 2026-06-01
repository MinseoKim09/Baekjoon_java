from collections import deque

def solution(maps):
    n, m = len(maps), len(maps[0])

    q = deque([(0, 0)])

    dx = (-1, 1, 0, 0)
    dy = (0, 0, -1, 1)

    while q:
        x, y = q.popleft()

        if x == n - 1 and y == m - 1:
            return maps[x][y]

        for k in range(4):
            nx = x + dx[k]
            ny = y + dy[k]

            if 0 <= nx < n and 0 <= ny < m and maps[nx][ny] == 1:
                maps[nx][ny] = maps[x][y] + 1
                q.append((nx, ny))

    return -1