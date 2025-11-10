board = input()
parts = board.split('.')
result = []
for part in parts:
    if len(part) == 0:
        result.append('')
        continue
    elif len(part) % 2 != 0:
        print(-1)
        break
    a_count = len(part) // 4
    b_count = (len(part) % 4) // 2
    result.append('AAAA' * a_count + 'BB' * b_count)
else:
    print('.'.join(result))