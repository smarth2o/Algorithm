function solution(id_pw, db) {
    let same_id = false;
    for (const acc of db) {
        if (id_pw[0] === acc[0]) {
            same_id = true;
            if (id_pw[1] === acc[1]) {
                return "login";
            }
        }
    }
    return same_id ? "wrong pw" : "fail";
}