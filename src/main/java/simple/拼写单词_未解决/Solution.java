package simple.拼写单词_未解决;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 *
 *
 * 示例 1：
 *
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 *
 * 示例 2：
 *
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 *
 *
 *
 * 提示：
 *
 *     1 <= words.length <= 1000
 *     1 <= words[i].length, chars.length <= 100
 *     所有字符串中都仅包含小写英文字母
 *
 * 来源：力扣（LeetCode）
 * User: ww
 * Date: 2020-03-17
 * Time: 16:43
 */
public class Solution {
    public static int countCharacters(String[] words, String chars) {
        int len = 0;
        String[] charArray = chars.split("",-1);
        for (String word : words) {
            List<String> wordList = Arrays.asList(word.split("", -1));
            List<String> tempList = Arrays.asList(charArray);
            for (String aCharArray : charArray) {
                if (wordList.contains(aCharArray)) {

                    wordList.remove(aCharArray);

                }
            }

//            if (charSet.size() == word.length()) {
//                len += word.length();
//            }
        }
        return len;
    }

    public static void main(String[] args) {
//        System.out.println(countCharacters(new String[] {"hello","world","leetcode"},"welldonehoneyr"));
//        System.out.println("aaa".split("",-1)[1]);

        List<String> remove = Arrays.asList("1", "2", "3", "3", "3");
        remove.remove("4");
        System.out.println(remove.get(5));
    }

}
