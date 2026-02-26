package collections;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class MapLessons {
    public static void main(String[] args) {
        // HashMap
        // ключ - значение
        HashMap<String, Integer> hashMap = new HashMap<>();
        // добавление элементов
        hashMap.put("Москва", 77);
        hashMap.put("Спб", 78);
        hashMap.put("Колпино", 666);
        hashMap.put(null, null);
        // удалениен пары
        hashMap.remove(null); // по ключу
        // замена пары
        hashMap.replace("Москва", 178); // по ключу
        hashMap.replace("Спб", 78, 778);
        System.out.println(hashMap);

        // получение
        // если ключ не найден - вернет null
        System.out.println(hashMap.get("Колпино"));
        // проверить, содержится ли ключ в мапе
        System.out.println(hashMap.containsKey("Спб"));
        System.out.println(hashMap.containsValue(800));

        // перебор в цикле
        // мапа.keySet(); только ключи (Set)
        // мапа.values(); только значения (Collection)
        // мапа.entrySet(); ключи и значения (
        for (Map.Entry<String, Integer> pair: hashMap.entrySet()) {
            System.out.println("Город (ключ): " + pair.getKey());
            System.out.println("Код (значение)" + pair.getValue());
        }

        // EnumMap - в качестве ключей используется перечисления
        // Role - тип данных ключей
        EnumMap<Role, String> enumRole = new EnumMap<>(Role.class);
        enumRole.put(Role.USER, "Пользователь");
        enumRole.put(Role.ADMIN, "Администратор");
        System.out.println(enumRole.get(Role.USER));

        User user1 = new User("user1", "a3352", Role.ADMIN, 28);
        User user2 = new User("user2", "436", Role.USER, 23);
        User user3 = new User("user3", "bt353", Role.USER, 18);
        User user4 = new User("user4", "hrtf2", Role.USER, 55);
        User user5 = new User("user5", "55432", Role.ADMIN, 22);

        HashMap<String, User> userHashMap = new HashMap<>();
        userHashMap.put(user1.getLogin(), user1);
        userHashMap.put(user2.getLogin(), user2);
        userHashMap.put(user3.getLogin(), user3);
    }
}
