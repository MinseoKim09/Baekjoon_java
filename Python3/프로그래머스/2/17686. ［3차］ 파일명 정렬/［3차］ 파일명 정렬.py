import re

def solution(files):
    def parse(file):
        head, number, tail = re.match(r'([^0-9]+)([0-9]{1,5})(.*)', file).groups()
        return (head.lower(), int(number))

    return sorted(files, key=parse)