import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * DataProcessor - A utility program to process, analyze, and transform data
 * This program demonstrates file handling, data structures, and stream operations
 */
public class DataProcessor {
    
    private List<String> data;
    
    public DataProcessor() {
        this.data = new ArrayList<>();
    }
    
    /**
     * Loads data from a file
     */
    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line.trim());
            }
            System.out.println("✓ Loaded " + data.size() + " lines from " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("✗ File not found: " + filename);
        } catch (IOException e) {
            System.out.println("✗ Error reading file: " + e.getMessage());
        }
    }
    
    /**
     * Adds a data entry
     */
    public void addData(String entry) {
        if (entry != null && !entry.isEmpty()) {
            data.add(entry);
        }
    }
    
    /**
     * Filters data based on a search term
     */
    public List<String> filterData(String searchTerm) {
        return data.stream()
                .filter(line -> line.toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    /**
     * Sorts data alphabetically
     */
    public void sortData() {
        Collections.sort(data);
        System.out.println("✓ Data sorted alphabetically");
    }
    
    /**
     * Removes duplicate entries
     */
    public void removeDuplicates() {
        int originalSize = data.size();
        data = data.stream().distinct().collect(Collectors.toList());
        System.out.println("✓ Removed " + (originalSize - data.size()) + " duplicates");
    }
    
    /**
     * Saves data to a file
     */
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("✓ Saved " + data.size() + " lines to " + filename);
        } catch (IOException e) {
            System.out.println("✗ Error writing file: " + e.getMessage());
        }
    }
    
    /**
     * Displays all data
     */
    public void displayData() {
        if (data.isEmpty()) {
            System.out.println("No data available");
            return;
        }
        System.out.println("\n--- Data Content (" + data.size() + " entries) ---");
        for (int i = 0; i < data.size(); i++) {
            System.out.println((i + 1) + ". " + data.get(i));
        }
    }
    
    /**
     * Returns statistics about the data
     */
    public void showStatistics() {
        if (data.isEmpty()) {
            System.out.println("No data available for statistics");
            return;
        }
        System.out.println("\n--- Statistics ---");
        System.out.println("Total entries: " + data.size());
        System.out.println("Average length: " + 
            String.format("%.2f", data.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0)));
    }
    
    /**
     * Main method with interactive menu
     */
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("=== DataProcessor ===");
        System.out.println("A utility program to process and analyze data\n");
        
        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Load from file");
            System.out.println("2. Add data");
            System.out.println("3. Display data");
            System.out.println("4. Filter data");
            System.out.println("5. Sort data");
            System.out.println("6. Remove duplicates");
            System.out.println("7. Show statistics");
            System.out.println("8. Save to file");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter filename: ");
                    processor.loadFromFile(scanner.nextLine().trim());
                    break;
                case "2":
                    System.out.print("Enter data: ");
                    processor.addData(scanner.nextLine().trim());
                    System.out.println("✓ Data added");
                    break;
                case "3":
                    processor.displayData();
                    break;
                case "4":
                    System.out.print("Enter search term: ");
                    List<String> filtered = processor.filterData(scanner.nextLine().trim());
                    System.out.println("Found " + filtered.size() + " matches:");
                    filtered.forEach(System.out::println);
                    break;
                case "5":
                    processor.sortData();
                    break;
                case "6":
                    processor.removeDuplicates();
                    break;
                case "7":
                    processor.showStatistics();
                    break;
                case "8":
                    System.out.print("Enter filename: ");
                    processor.saveToFile(scanner.nextLine().trim());
                    break;
                case "9":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }
}
