import java.util.Map;

import static java.util.Map.entry;

class RnaTranscription {
    private static final Map<Character,Character> transcription = Map.ofEntries(entry('G','C'),entry('C','G'), entry('T','A'), entry('A','U') );

    String transcribe(String dnaString) {
        int n = dnaString.length();
        StringBuilder RnaTranscribe = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char rnaTranscription = getRNATranscription(dnaString.charAt(i));
            RnaTranscribe.append(rnaTranscription);
        }
        return RnaTranscribe.toString();
    }

    private static char getRNATranscription(char c) {
        return transcription.get(c);
    }

}
