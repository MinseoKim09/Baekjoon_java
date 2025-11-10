case_num = 1
while True:
    data = list(map(int, input().split()))
    n = data[0]
    if n == 0:
        break
    numbers = data[1:]
    if n % 2 == 1:
        median = numbers[n // 2]
    else:
        median = (numbers[n // 2 - 1] + numbers[n // 2]) / 2
    print(f"Case {case_num}: {median:.1f}")
    case_num += 1