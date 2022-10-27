def solution(numbers):
    # 모든 숫자 문자열로 변환
    numbers = list(map(str, numbers))
    # 자릿수에 따른 정렬 문제 해결 (ex. 3 vs 30)
    numbers.sort(key=lambda x: x*3, reverse=True)
    # 0000와 같은 답 방지
    return str(int("".join(numbers)))