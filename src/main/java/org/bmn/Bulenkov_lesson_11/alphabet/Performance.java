package org.bmn.Bulenkov_lesson_11.alphabet;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Performance {

    public Map<String, String> alphabet() {
        Map<String, String> result = new HashMap<>();

        result.put("в", "д");
        result.put("о", "л");
        result.put("к", "ю");
        result.put("%", " ");
        result.put("~", "я");
        result.put("Ж", "J");
        result.put("п", "v");

        return result;
    }
}
