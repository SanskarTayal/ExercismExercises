import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        int n = dnaStrand.length();
        StringBuilder RnaTranscribe = new StringBuilder();
        for (int i = 0; i < n; i++) {
            RnaTranscribe.append(getRNATranscription(dnaStrand.charAt(i)));
        }
        return RnaTranscribe.toString();
    }

    private static char getRNATranscription(char c) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('G', 'C');
        map.put('C', 'G');
        map.put('T', 'A');
        map.put('A', 'U');
        return map.get(c);
    }

}
