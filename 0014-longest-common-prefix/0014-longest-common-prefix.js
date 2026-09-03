/**
 * @param {string[]} strs
 * @return {string}
 */
 var longestCommonPrefix = function (strs) {
    if (!strs.length) return "";

    let minLen = strs[0].length;
    for (let i = 1; i < strs.length; i++) {
        if (strs[i].length < minLen) minLen = strs[i].length;
        if (minLen === 0) return "";
    }

    let prefixEnd = 0;

    for (let i = 0; i < minLen; i++) {
        const ch = strs[0][i];
        for (let j = 1; j < strs.length; j++) {
            if (strs[j][i] !== ch) {
                return strs[0].slice(0, prefixEnd);
            }
        }

        prefixEnd = i + 1;
    }

    return strs[0].slice(0, prefixEnd);
 };