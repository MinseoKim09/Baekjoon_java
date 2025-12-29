N, M = map(int, input().split())
board = [input().strip() for _ in range(N)]
answer = 64
for x in range(N - 7):
    for y in range(M - 7):
        w_start = 0
        b_start = 0
        for i in range(8):
            for j in range(8):
                if (i + j) % 2 == 0:
                    if board[x + i][y + j] != 'W':
                        w_start += 1
                    if board[x + i][y + j] != 'B':
                        b_start += 1
                else:
                    if board[x + i][y + j] != 'B':
                        w_start += 1
                    if board[x + i][y + j] != 'W':
                        b_start += 1
        answer = min(answer, w_start, b_start)
print(answer)