// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать множество ноутбуков.
// 3) Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.

// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// 1) Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// 2) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

import java.util.*;

public class main {
    public static void main(String[] args) {
        // Создание множества ноутбуков
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Brand1", 8, 256, "Windows", "Red"));
        notebooks.add(new Notebook("Brand2", 16, 512, "MacOS", "Blue"));
        notebooks.add(new Notebook("Brand3", 8, 512, "Linux", "Red"));
        notebooks.add(new Notebook("Brand4", 16, 256, "Windows", "Green"));
        notebooks.add(new Notebook("Brand5", 8, 512, "MacOS", "Black"));

        // Запрос критерия фильтрации у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int filterCriteria = scanner.nextInt();

        // Запрос минимального значения или цвета для указанного критерия
        System.out.println("Введите минимальное значение или цвет для выбранного критерия или название OS:");
        String filterValue = scanner.next();

        // Фильтрация подходящих ноутбуков
        List<Notebook> filteredNotebooks = Notebook.filterNotebooks(notebooks, filterCriteria, filterValue);

        // Вывод отфильтрованных ноутбуков
        System.out.println("Подходящие ноутбуки:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }
}
