import sys
input_data = sys.stdin.read().strip().split()
p = list(map(int, input_data[:4]))
x = int(input_data[4])

ans = 0
for i in range(4):
    if p[i] == x:
        ans = i+1
        break
print(ans)