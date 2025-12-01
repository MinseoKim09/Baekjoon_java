A, B, C = map(int, input().split())
answer = max(A * B / C, A / B * C)
print(int(answer))
