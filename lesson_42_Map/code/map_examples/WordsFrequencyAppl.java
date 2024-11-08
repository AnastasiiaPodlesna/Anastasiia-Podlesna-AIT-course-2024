package map_examples;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyAppl
{
    public static void main(String[] args)
    {
        String[] words = {"a", "abc", "ab", "limit", "ab", "a", "1a", "ab", "limit", "a", "a", "a", "1a"};

        printWordFrequency(words);

    }

    private static void printWordFrequency(String[] words)
    {
        // Key - это слово, а value  - количество его повторений в массиве
        Map<String, Integer> resultMap = new HashMap<>();

        for (String word : words)
        {
            if (!resultMap.containsKey(word)) // когда слово попалось 1-й раз
            {
                resultMap.put(word, 1);
            }
            else
            {
                resultMap.put(word, resultMap.get(word) + 1); // увелич. частоту на 1
            }
        }
        // print resultMap
        for (String word: resultMap.keySet())
        {
            System.out.println("Word: " + word + ", frequency: " + resultMap.get(word));
        }

    }

}
