r, c, n = map(int, input().split())
row = (r + n - 1) // n
col = (c + n - 1) // n
print(row * col)