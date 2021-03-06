package d_6June;

public class MinEditDistance {
    /**
     * 动态规划算法 无递归
     * @param {string} a
     * @param {string} b
     * @returns {number} 从 a → b 的最小编辑距离
     */
   /*
    function dynamicPlanning(a, b) {
        let lenA = a.length;
        let lenB = b.length;
        let d = [];
        d[0] = [];

        for (let j = 0; j <= lenB; j++) {
            d[0].push(j);
        }

        for (let i = 0; i <= lenA; i++) {
            if (d[i]) {
                d[i][0] = i;
            } else {
                d[i] = [];
                d[i][0] = i;
            }
        }

        for (let i = 1; i <= lenA; i++) {
            for (let j = 1; j <= lenB; j++) {
                if (a[i - 1] === b[j - 1]) {
                    d[i][j] = d[i - 1][j - 1];
                } else {
                    let m1 = d[i - 1][j] + 1;
                    let m2 = d[i][j - 1] + 1;
                    let m3 = d[i - 1][j - 1] + 1;
                    d[i][j] = Math.min(m1, m2, m3);
                }
            }
        }

        return d[lenA][lenB];
    }
    */
    /**
     * 递归算法
     * @param {string} a
     * @param {string} b
     * @param {number} i 字符串 a 的长度
     * @param {number} j 字符串 b 的长度
     * @returns {number} 从 a → b 的最小编辑距离
     */
   /*
    function recursion(a, b, i, j) {
        if (j === 0) {
            return i;
        } else if (i === 0) {
            return j;
        } else if (a[i - 1] === b [j - 1]) {
            return recursion(a, b, i - 1, j - 1);
        } else {
            let m1 = recursion(a, b, i - 1, j) + 1;
            let m2 = recursion(a, b, i, j - 1) + 1;
            let m3 = recursion(a, b, i - 1, j - 1) + 1;
            return Math.min(m1, m2, m3);
        }
    }
    */
}
