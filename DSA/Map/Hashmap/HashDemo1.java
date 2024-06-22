package Map.Hashmap;

import java.util.Scanner;

class MapUsingHash {
    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // override the value if it already exists
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }
}

public class
HashDemo1 {
    public static void main(String[] args) {
        MapUsingHash mapUsingHash = new MapUsingHash();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Put");
            System.out.println("2. Get");
            System.out.println("3. Remove");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter key: ");
                    String key = scanner.nextLine();
                    System.out.print("Enter value: ");
                    String value = scanner.nextLine();
                    mapUsingHash.put(key, value);
                    break;
                case "2":
                    System.out.print("Enter key to get value: ");
                    String getKey = scanner.nextLine();
                    String retrievedValue = mapUsingHash.get(getKey);
                    if (retrievedValue != null) {
                        System.out.println("Value: " + retrievedValue);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case "3":
                    System.out.print("Enter key to remove: ");
                    String removeKey = scanner.nextLine();
                    mapUsingHash.remove(removeKey);
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
                    break;
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}
