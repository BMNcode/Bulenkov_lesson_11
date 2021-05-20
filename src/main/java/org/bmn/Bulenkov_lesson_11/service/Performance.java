package org.bmn.Bulenkov_lesson_11.service;

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
        result.put("Ж", "j");
        result.put("п", "v");

        return result;
    }
}
