package test21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {


    public int solution(String[] E) {

        Map<Character, List<Integer>> participantsForDay = new HashMap<>();

        for (int i = 0; i < E.length; i++) {
            String possibleDays = E[i];
            for (int j = 0; j < possibleDays.length(); j++) {
                char key = possibleDays.charAt(j);
                if (!participantsForDay.containsKey(key)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    participantsForDay.put(key, list);
                } else {
                    List<Integer> current = participantsForDay.get(key);
                    current.add(i);
                    participantsForDay.put(key, current);
                }
            }
        }

        int maxParticipants = 0;
        List<List<Integer>> values = new ArrayList<>(participantsForDay.values());
        for (int i = 0; i < values.size(); i++) {
            List<Integer> current = values.get(i);
            for (int j = i + 1; j < values.size(); j++) {
                List<Integer> next = values.get(j);
                List<Integer> diff = next
                      .stream()
                      .filter(x -> !current.contains(x)).collect(Collectors.toList());
                int currentMax = diff.size() + current.size();
                if (currentMax > maxParticipants) {
                    maxParticipants = currentMax;
                }
            }
        }
        return maxParticipants;
    }
}
