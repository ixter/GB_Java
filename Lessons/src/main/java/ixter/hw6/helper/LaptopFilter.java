package ixter.hw6.helper;
import ixter.hw6.model.Laptop;
import java.util.HashMap;
import java.util.Map;

public class LaptopFilter {

    public Map<String, String> filterSet;

    public LaptopFilter() {
        this.filterSet = new HashMap<>();
    }

    /**
     * Добавить параметр в фильтр
     * @param key строка
     * @param value строка
     */
    public void add(String key, String value) {
        if (value.length() > 0)
            filterSet.put(key, value);
    }

    /**
     * Фильтр
     * @return Объект ноутбук
     */
    public Laptop getFilterSample() {
        int filterRam = Integer.parseInt(this.filterSet.getOrDefault("ram", "0"));
        int filterHDDSize = Integer.parseInt(this.filterSet.getOrDefault("hddSize", "0"));
        String filterOs = this.filterSet.getOrDefault("os", "");
        String filterColor = this.filterSet.getOrDefault("color", "");
        String filterManufacturer = this.filterSet.getOrDefault("manufacturer", "");
        return new Laptop(filterRam, filterHDDSize, filterOs, filterColor, filterManufacturer);
    }

}