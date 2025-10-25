L = int(input())
A = int(input())
B = int(input())
C = int(input())
D = int(input())
day_korean = (A + C - 1) // C
day_math = (B + D - 1) // D
study_days = max(day_korean, day_math)
print(L - study_days)