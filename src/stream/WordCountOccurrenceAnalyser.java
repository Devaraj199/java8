package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class WordCountOccurrenceAnalyser {

    private static final String FOLDER_PATH = "/Hyd/data";

    public List<String> findNthOccurrence(int rank, boolean highest) throws IOException, InterruptedException {

        Map<String, Integer> wordMap = new HashMap<>();
        // Get all files from the folder
        List<Path> files = Files.walk(Paths.get(FOLDER_PATH))
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());

        ExecutorService executor = Executors.newFixedThreadPool(2);
        // Read each file and update the word frequency
        for (Path file : files) {
            executor.execute(() -> {
                try {
                    Files.lines(file)
                            .flatMap(line -> Arrays.stream(line.split("\\W+")))
                            .filter(word -> !word.isEmpty())
                            .forEach(word -> wordMap.merge(word, 1, Integer::sum)); // Thread-safe merge operation
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS); // Wait for all threads to finish

//        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) { // Java 19 or 21
//            // Read each file and update the word frequency
//            for (Path file : files) {
//                executor.execute(() -> {
//                    try {
//                        Files.lines(file)
//                                .flatMap(line -> Arrays.stream(line.split("\\W+")))
//                                .filter(word -> !word.isEmpty())
//                                .forEach(word -> wordMap.merge(word, 1, Integer::sum)); // Thread-safe merge operation
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                });
//            }
//        }

        // Group words by frequency
        Map<Integer, List<String>> frequencyToWords = wordMap.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));

        // Sort frequencies based on the highest or lowest order
        List<Integer> keySets = new ArrayList<>(frequencyToWords.keySet());
        keySets.sort(highest ? Comparator.reverseOrder() : Comparator.naturalOrder());

        if (rank <= 0 || rank > keySets.size()) {
            throw new IllegalArgumentException("Rank is out of range");
        }

        int targetRank = keySets.get(rank - 1);
        return frequencyToWords.getOrDefault(targetRank, Collections.emptyList());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        WordCountOccurrenceAnalyser wordCountOccurrenceAnalyser = new WordCountOccurrenceAnalyser();
        System.out.println(wordCountOccurrenceAnalyser.findNthOccurrence(2, false));
    }
}

