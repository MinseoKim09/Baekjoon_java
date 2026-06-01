def solution(board):
    n = len(board)
    danger = set()

    for i in range(n):
        for j in range(n):
            if board[i][j]:
                for dx in (-1, 0, 1):
                    for dy in (-1, 0, 1):
                        nx, ny = i + dx, j + dy
                        if 0 <= nx < n and 0 <= ny < n:
                            danger.add((nx, ny))

    return n * n - len(danger)