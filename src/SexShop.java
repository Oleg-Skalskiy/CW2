

class SexShop {
    private String id;
    private String name;
    private int weight;
    private int size;
    private String country;

    public SexShop(String id, String name, int weight, int size, String country) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public String getCountry() {
        return country;
    }
}
