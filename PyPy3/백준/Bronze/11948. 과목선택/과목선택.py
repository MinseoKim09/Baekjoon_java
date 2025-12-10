scores = [int(input()) for _ in range(6)]

science = scores[:4]
social = scores[4:]

science_sum = sum(sorted(science, reverse=True)[:3])
social_max = max(social)

print(science_sum + social_max)