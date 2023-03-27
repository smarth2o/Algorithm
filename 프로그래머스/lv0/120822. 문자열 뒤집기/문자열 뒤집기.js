function solution(my_string) {
    rev_string = ""
    for (var i = my_string.length-1; i >= 0; i--) {
        rev_string += my_string.charAt(i);
    }
    return rev_string;
}