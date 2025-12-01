def solution(phone_book):
    hash_map = {}
    for number in phone_book:
        hash_map[number] = True
    for number in phone_book:
        prefix = ""
        for digit in number:
            prefix += digit
            if prefix in hash_map and prefix != number:
                return False
    return True