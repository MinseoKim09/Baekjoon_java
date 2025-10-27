n = int(input())
s = input()
count = 0
for ch in s:
    if ch in 'aiueo':
        count += 1
print(count)