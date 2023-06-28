import java.util.*;

public class Notebook {
    private String brand;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Notebook(String brand, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    // Переопределение метода toString() для удобного вывода информации о ноутбуке
    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static List<Notebook> filterNotebooks(Set<Notebook> notebooks, int filterCriteria, String filterValue) {
        // Создание списка для хранения подходящих ноутбуков
        List<Notebook> filteredNotebooks = new ArrayList<>();

        // Фильтрация ноутбуков и добавление подходящих в список
        for (Notebook notebook : notebooks) {
            switch (filterCriteria) {
                case 1:
                    if (notebook.getRam() >= Integer.parseInt(filterValue)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 2:
                    if (notebook.getStorage() >= Integer.parseInt(filterValue)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 3:
                    if (notebook.getOs().equalsIgnoreCase(filterValue)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                case 4:
                    if (notebook.getColor().equalsIgnoreCase(filterValue)) {
                        filteredNotebooks.add(notebook);
                    }
                    break;
                default:
                    System.out.println("Неверный критерий фильтрации.");
                    return filteredNotebooks;
            }
        }

        return filteredNotebooks;
    }
}
