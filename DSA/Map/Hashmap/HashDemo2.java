package Map.Hashmap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class HashUsingChaining<K, V> {
    private ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public HashUsingChaining() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }
        if (((float) (size) / list.size()) > lf) {
            reHash();
        }
        entities.add(new Entity(key, value));
        size++;
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entities.remove(entity);
                size--;
                return;
            }
        }
    }

    private void reHash() {
        System.out.println("We are now rehashing...");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }
        for (LinkedList<Entity> entities : old) {
            for (Entity entity : entities) {
                put(entity.key, entity.value);
            }
        }
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class HashDemo2 {
    public static void main(String[] args) {
        HashUsingChaining<String, String> map = new HashUsingChaining<>();
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
                    map.put(key, value);
                    break;
                case "2":
                    System.out.print("Enter key to get value: ");
                    String getKey = scanner.nextLine();
                    String retrievedValue = map.get(getKey);
                    if (retrievedValue != null) {
                        System.out.println("Value: " + retrievedValue);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case "3":
                    System.out.print("Enter key to remove: ");
                    String removeKey = scanner.nextLine();
                    map.remove(removeKey);
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
