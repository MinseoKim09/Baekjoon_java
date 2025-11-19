import sys
input = sys.stdin.readline
N = int(input())
count = [0] * 10
start, end = 1, N
digit = 1
def add_count(x, digit):
    while x > 0:
        count[x % 10] += digit
        x //= 10
while start <= end:
    while end % 10 != 9 and start <= end:
        add_count(end, digit)
        end -= 1
    while start % 10 != 0 and start <= end:
        add_count(start, digit)
        start += 1
    if start > end:
        break
    block = (end // 10) - (start // 10) + 1
    for i in range(10):
        count[i] += block * digit
    start //= 10
    end //= 10
    digit *= 10
print(*count)